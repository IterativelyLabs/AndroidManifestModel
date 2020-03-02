package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class GrantURIPermission(@JsonAlias("android:path") var path: String,
                              @JsonAlias("android:pathPattern") var pathPattern: String,
                              @JsonAlias("android:pathPrefix") var pathPrefix: String)
