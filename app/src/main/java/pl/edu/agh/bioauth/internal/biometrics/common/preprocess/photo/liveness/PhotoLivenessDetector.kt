/**
 * The algorithm is based on https://github.com/ee09115/spoofing_detection
 */

package pl.edu.agh.bioauth.internal.biometrics.common.preprocess.photo.liveness

import android.content.res.Resources
import org.opencv.core.*
import org.opencv.imgcodecs.Imgcodecs
import org.opencv.imgproc.Imgproc
import org.opencv.objdetect.CascadeClassifier
import pl.edu.agh.bioauth.BioAuth
import pl.edu.agh.bioauth.R
import pl.edu.agh.bioauth.exception.SdkUninitializedException
import pl.edu.agh.bioauth.internal.biometrics.common.preprocess.LivenessDetector
import pl.edu.agh.bioauth.internal.util.ErrorUtil
import pl.edu.agh.bioauth.internal.util.FileUtil
import pl.edu.agh.bioauth.internal.util.extension.median
import pl.edu.agh.bioauth.internal.util.extension.toInt
import pl.edu.agh.bioauth.internal.util.type.FileType
import java.io.File

internal class PhotoLivenessDetector : LivenessDetector() {

    @get:Throws(SdkUninitializedException::class)
    private val resources: Resources
        get() = BioAuth.instance?.applicationContext?.resources ?: ErrorUtil.failWithSdkUninitialized()

    override fun testLiveness(samples: List<File>): Boolean {
        val faceCascadeFile = FileUtil.createTempFile(FileType.XML)
        resources.openRawResource(R.raw.bioauth_haarcascade_frontalface_default).use { input ->
            faceCascadeFile.outputStream().use { output ->
                input.copyTo(output)
            }
        }

        val faceCascade = CascadeClassifier(faceCascadeFile.absolutePath)

        val measures = mutableListOf<MutableList<Int>>()
        val sampleVotes = mutableListOf<Int>()

        samples
            .map { Imgcodecs.imread(it.absolutePath) }
            .filterNot { it.empty() }
            .forEachIndexed { index, image ->
                val imgGrey = Mat().apply { Imgproc.cvtColor(image, this, Imgproc.COLOR_BGR2GRAY) }

                val faces = detectFaces(imgGrey, faceCascade)

                measures.add(mutableListOf())
                faces.toArray().forEach {
                    val roi = with (it) { image.submat(y, y + height, x, x + width) }

                    val imgYcrcb = Mat().apply { Imgproc.cvtColor(roi, this, Imgproc.COLOR_BGR2YCrCb) }
                    val imgLuv = Mat().apply { Imgproc.cvtColor(roi, this, Imgproc.COLOR_BGR2Luv) }

                    val ycrcbHist = calcHist(imgYcrcb)
                    val luvHist = calcHist(imgLuv)

                    val featureVector = (ycrcbHist.flatten() + luvHist.flatten())
                        .map(DoubleArray::toTypedArray)
                        .toTypedArray()
                        .flatten()
                        .toDoubleArray()

                    val probability = LivenessClassifier.predictProba(featureVector)[1]
                    measures[index].add((probability >= EPSILON).toInt())
                }

                sampleVotes.add(measures[index].median() ?: -1)
            }

        faceCascadeFile.delete()
        return sampleVotes.median() == 0
    }

    private fun detectFaces(img: Mat, cascadeClassifier: CascadeClassifier): MatOfRect {
        return MatOfRect().apply {
            cascadeClassifier.detectMultiScale(img, this, 1.1, 5, 0, Size(110.0, 110.0))
        }
    }

    private fun calcHist(img: Mat): List<List<DoubleArray>> {
        val histogram = mutableListOf<List<DoubleArray>>()
        for (i in 0 until 3) {
            var histr = Mat().apply {
                Imgproc.calcHist(listOf(img), MatOfInt(i), Mat(), this, MatOfInt(256), MatOfFloat(0.0f, 256.0f))
            }
            val max = Core.minMaxLoc(histr).maxVal
            histr = with (histr) { mul(Mat(size(), type(), Scalar(250.0 / max))) }

            val histrList = mutableListOf<DoubleArray>()
            val rows = histr.size().height.toInt()
            for (j in 0 until rows) {
                histrList.add(histr[j, 0])
            }

            histogram.add(histrList)
        }

        return histogram
    }

    companion object {
        private const val EPSILON = 0.7

        init {
            System.loadLibrary("opencv_java3")
        }
    }
}