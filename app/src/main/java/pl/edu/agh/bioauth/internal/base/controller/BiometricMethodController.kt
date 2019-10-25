package pl.edu.agh.bioauth.internal.base.controller

import pl.edu.agh.bioauth.auth.listener.ResultListener
import pl.edu.agh.bioauth.internal.biometrics.common.type.BiometricsType
import pl.edu.agh.bioauth.internal.di.Injectable
import pl.edu.agh.bioauth.internal.network.ApiController
import pl.edu.agh.bioauth.internal.network.callback.ResultCallback
import pl.edu.agh.bioauth.internal.network.callback.SymmetricKeyCallback
import pl.edu.agh.bioauth.internal.util.FileUtil
import pl.edu.agh.bioauth.internal.util.SecurityUtil
import pl.edu.agh.bioauth.internal.util.extension.decode64
import pl.edu.agh.bioauth.internal.util.extension.stringValue
import pl.edu.agh.bioauth.internal.util.extension.toSymmetricKey
import java.io.File
import java.security.PrivateKey
import javax.crypto.SecretKey
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass

internal abstract class BiometricMethodController<C: ResultCallback<*, L, E>, L: ResultListener, E: Exception>(
    protected val biometricsType: BiometricsType,
    protected val resultCallback: C,
    private val symmetricKeyCallback: SymmetricKeyCallback,
    private val resultListener: L
) : Injectable {

    protected abstract val userId: String?

    protected val apiController: ApiController by inject()
    protected val securityUtil: SecurityUtil by inject()

    fun run(samples: List<File>) {
        getEncryptionKey { keyId, encryptedKey, iv, privateKey ->
            val key = securityUtil.decryptData(encryptedKey.decode64(), privateKey).toSymmetricKey()
            val encryptedSamples = encryptSamples(samples, key, iv.decode64())
            sendSamples(encryptedSamples, keyId)
        }
    }

    protected abstract fun sendSamples(samples: List<File>, keyId: String)
    protected abstract fun getException(message: String?, cause: Throwable?): E

    final override fun <R, T : Any> inject(kClass: KClass<T>?, init: T.() -> Unit): ReadOnlyProperty<R, T> {
        return super.inject(kClass, init)
    }

    fun onFailure(message: String? = null, cause: Throwable? = null) = resultListener.onFailure(getException(message, cause))

    private fun getEncryptionKey(onSuccess: (String, String, String, PrivateKey) -> Unit) {
        val keyPair = securityUtil.keyPair
        apiController.getSessionKey(keyPair.public.stringValue)
            .enqueue(symmetricKeyCallback.also { it.onSuccess = { id, key, iv ->
                onSuccess(id, key, iv, keyPair.private)
            } })
    }

    private fun encryptSamples(samples: List<File>, key: SecretKey, iv: ByteArray): List<File> =
        samples.map {
            val bytes = securityUtil.encryptData(it.readBytes(), key, iv)
            FileUtil.createEncryptedFile(bytes, it.parent, it.name)
        }
}