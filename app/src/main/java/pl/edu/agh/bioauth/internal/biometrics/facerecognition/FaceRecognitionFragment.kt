package pl.edu.agh.bioauth.internal.biometrics.facerecognition

import pl.edu.agh.bioauth.R
import pl.edu.agh.bioauth.internal.base.BaseFragment

internal class FaceRecognitionFragment : BaseFragment<FaceRecognitionViewModel>() {

    override val viewModelType: Class<FaceRecognitionViewModel> = FaceRecognitionViewModel::class.java
    override val layoutId: Int = R.layout.bioauth_fragment_face_recognition

}