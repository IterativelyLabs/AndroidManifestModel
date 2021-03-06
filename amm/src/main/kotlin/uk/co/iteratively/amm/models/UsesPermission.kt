package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
class UsesPermission(@JsonAlias("android:name") var name: String?,
                     @Since(AndroidApi.KITKAT) @JsonAlias("android:maxSdkVersion") var maxSdkVersion: Int)