package pl.edu.agh.bioauth.internal.biometrics.facerecognition

internal enum class CameraCaptureState {
    PREVIEW, FACE_DETECTION, WAITING_LOCK, WAITING_PRECAPTURE, WAITING_NON_PRECAPTURE, PICTURE_TAKEN
}