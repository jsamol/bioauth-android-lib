package pl.edu.agh.bioauth.internal.di.component.fragment

import pl.edu.agh.bioauth.internal.biometrics.facerecognition.ui.FaceRecognitionFragment
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.ui.FaceRecognitionViewModel
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import pl.edu.agh.bioauth.internal.di.module.fragment.FaceRecognitionFragmentModule
import pl.edu.agh.bioauth.internal.di.module.viewmodel.FaceRecognitionViewModelModule

@Component(
    targets = [FaceRecognitionFragment::class, FaceRecognitionViewModel::class],
    modules = [FaceRecognitionFragmentModule::class, FaceRecognitionViewModelModule::class]
)
internal class FaceRecognitionFragmentComponent : AbstractComponent()