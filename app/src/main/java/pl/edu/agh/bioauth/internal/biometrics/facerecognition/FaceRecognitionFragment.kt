package pl.edu.agh.bioauth.internal.biometrics.facerecognition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pl.edu.agh.bioauth.R

internal class FaceRecognitionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.bioauth_fragment_face_recognition, container, false)
}