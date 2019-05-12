package pl.edu.agh.bioauth.internal.biometrics.facerecognition.callback

import android.hardware.camera2.CameraDevice

internal class FaceCameraStateCallback : CameraDevice.StateCallback() {

    private lateinit var _onOpened: (CameraDevice) -> Unit
    private lateinit var _onDisconnected: () -> Unit
    private lateinit var _onError: () -> Unit

    override fun onOpened(camera: CameraDevice) = _onOpened(camera)

    override fun onDisconnected(camera: CameraDevice) = _onDisconnected()

    override fun onError(camera: CameraDevice, error: Int) {
        onDisconnected(camera)
        _onError()
    }

    fun initCallbacks(onOpened: (CameraDevice) -> Unit, onDisconnected: () -> Unit, onError: () -> Unit) {
        _onOpened = onOpened
        _onDisconnected = onDisconnected
        _onError = onError
    }
}