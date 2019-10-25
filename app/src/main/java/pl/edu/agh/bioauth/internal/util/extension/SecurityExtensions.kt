package pl.edu.agh.bioauth.internal.util.extension

import pl.edu.agh.bioauth.internal.util.SecurityUtil.Companion.KEY_PAIR_ALGORITHM
import pl.edu.agh.bioauth.internal.util.SecurityUtil.Companion.KEY_SYMMETRIC_ALGORITHM
import java.security.KeyFactory
import java.security.PublicKey
import java.security.spec.X509EncodedKeySpec
import javax.crypto.SecretKey
import javax.crypto.spec.SecretKeySpec

internal val PublicKey.stringValue: String
    get() {
        val encodedKey = KeyFactory.getInstance(KEY_PAIR_ALGORITHM)
            .getKeySpec(this, X509EncodedKeySpec::class.java)
            .encoded

        return encodedKey.encode64()
    }

internal fun String.toPublicKey(): PublicKey {
    val keySpec = X509EncodedKeySpec(decode64())
    val keyFactory = KeyFactory.getInstance(KEY_PAIR_ALGORITHM)

    return keyFactory.generatePublic(keySpec)
}

internal fun ByteArray.toSymmetricKey(): SecretKey = SecretKeySpec(this, KEY_SYMMETRIC_ALGORITHM)