package pl.edu.agh.bioauth.internal.di.component.fragment

import pl.edu.agh.bioauth.internal.biometrics.facerecognition.ui.FaceRecognitionFragment
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import pl.edu.agh.bioauth.internal.di.module.fragment.FaceRecognitionFragmentModule

@Component(targets = [FaceRecognitionFragment::class], modules = [FaceRecognitionFragmentModule::class])
internal class FaceRecognitionFragmentComponent : AbstractComponent()