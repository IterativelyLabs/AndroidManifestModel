package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Deprecated
import uk.co.iteratively.amm.annotations.Since

enum class ProtectionLevel {
    normal,
    dangerous,
    signature,
    @Deprecated(AndroidApi.MARSHMALLOW) signatureOrSystem
}

@Since(AndroidApi.ANDROID_1)
data class Permission(@JsonAlias("android:description") var description: String,
                      @JsonAlias("android:icon") var icon: String,
                      @JsonAlias("android:label") var label: String,
                      @JsonAlias("android:name") var name: String,
                      @JsonAlias("android:permissionGroup") var permissionGroup: String,
                      @JsonAlias("android:protectionLevel") var protectionLevel: ProtectionLevel = ProtectionLevel.normal)


