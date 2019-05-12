package pl.edu.agh.bioauth.internal.util.extension

import android.util.Base64
import pl.edu.agh.bioauth.BioAuth
import java.security.KeyFactory
import java.security.PublicKey
import java.security.spec.X509EncodedKeySpec

internal fun String.toPublicKey(): PublicKey {
    val keySpec = X509EncodedKeySpec(Base64.decode(this, Base64.DEFAULT))
    val keyFactory = KeyFactory.getInstance(BioAuth.KEY_PAIR_ALGORITHM)

    return keyFactory.generatePublic(keySpec)
}