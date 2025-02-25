package pl.edu.agh.bioauth.auth

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.FragmentActivity
import pl.edu.agh.bioauth.R
import pl.edu.agh.bioauth.auth.LivenessMode.*
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.auth.listener.RegistrationListener
import pl.edu.agh.bioauth.internal.biometrics.facerecognition.ui.FaceRecognitionFragment

class FaceRecognitionView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val faceRecognitionFragment: FaceRecognitionFragment?
        get() = (context as? FragmentActivity)
            ?.supportFragmentManager
            ?.findFragmentById(R.id.faceRecognitionFragment) as? FaceRecognitionFragment

    fun initRegistration(userId: String, registrationListener: RegistrationListener, livenessMode: LivenessMode = MACHINE_LEARNING) {
        faceRecognitionFragment?.register(userId, registrationListener, livenessMode)
    }

    fun initAuthentication(userId: String?, authenticationListener: AuthenticationListener, livenessMode: LivenessMode = MACHINE_LEARNING) {
        faceRecognitionFragment?.authenticate(userId, authenticationListener, livenessMode)
    }

    init {
        View.inflate(context, R.layout.bioauth_view_face_recognition, this)
    }
}