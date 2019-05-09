package pl.edu.agh.bioauth.auth

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import pl.edu.agh.bioauth.R
import pl.edu.agh.bioauth.auth.listener.AuthenticationListener
import pl.edu.agh.bioauth.auth.listener.RegistrationListener

class FaceRecognitionView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    fun initRegistration(userId: String, registrationListener: RegistrationListener) {

    }

    fun initAuthentication(userId: String?, authenticationListener: AuthenticationListener) {

    }

    init {
        View.inflate(context, R.layout.bioauth_view_face_recognition, this)
    }
}