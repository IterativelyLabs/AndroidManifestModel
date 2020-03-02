package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class PathPermission(@JsonAlias("android:path") var path: String,
                          @JsonAlias("android:pathPrefix") var pathPrefix: String,
                          @JsonAlias("android:pathPattern") var pathPattern: String,
                          @JsonAlias("android:permission") var permission: String,
                          @JsonAlias("android:readPermission") var readPermission: String,
                          @JsonAlias("android:writePermission") var writePermission: String)
