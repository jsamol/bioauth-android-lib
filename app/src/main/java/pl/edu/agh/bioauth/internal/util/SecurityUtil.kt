package pl.edu.agh.bioauth.internal.util

import java.security.Key
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.SecureRandom
import java.util.*
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec

internal class SecurityUtil {

    val challenge: String
        get() = UUID.randomUUID().toString()

    val keyPair: KeyPair
        get() = KeyPairGenerator
            .getInstance(KEY_PAIR_ALGORITHM)
            .apply { initialize(KEY_PAIR_SIZE, secureRandom) }
            .genKeyPair()

    fun decryptData(data: ByteArray, key: Key): ByteArray =
            Cipher.getInstance(DECRYPTION_TRANSFORMATION)
                .apply { init(Cipher.DECRYPT_MODE, key) }
                .doFinal(data)

    fun encryptData(data: ByteArray, key: Key, iv: ByteArray): ByteArray {
        return Cipher.getInstance(ENCRYPTION_TRANSFORMATION)
            .apply { init(Cipher.ENCRYPT_MODE, key, IvParameterSpec(iv)) }
            .doFinal(data)
    }

    private val secureRandom: SecureRandom
        get() = SecureRandom()

    companion object {
        const val KEY_PAIR_ALGORITHM = "RSA"
        const val KEY_SYMMETRIC_ALGORITHM = "AES"

        private const val DECRYPTION_TRANSFORMATION = "RSA/ECB/OAEPWithSHA1AndMGF1Padding"
        private const val ENCRYPTION_TRANSFORMATION = "AES/CBC/PKCS5Padding"

        private const val KEY_PAIR_SIZE = 1024
    }
}