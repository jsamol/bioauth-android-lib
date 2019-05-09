package pl.edu.agh.bioauth.internal.di.component.fragment

import pl.edu.agh.bioauth.internal.biometrics.facerecognition.FaceRecognitionFragment
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent

@Component(targets = [FaceRecognitionFragment::class], modules = [])
internal class FaceRecognitionFragmentComponent : AbstractComponent()