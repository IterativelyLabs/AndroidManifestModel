package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.MARSHMALLOW)
class UsesPermissionSDK23(@JsonAlias("android:name") var name: String?,
                          @JsonAlias("android:maxSdkVersion") var maxSdkVersion: Int)