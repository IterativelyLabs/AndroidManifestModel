package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class Data(@JsonAlias("android:scheme") var scheme: String,
                @JsonAlias("android:host") var host: String,
                @JsonAlias("android:port") var port: String,
                @JsonAlias("android:path") var path: String,
                @JsonAlias("android:pathPattern") var pathPattern: String,
                @JsonAlias("android:pathPrefix") var pathPrefix: String,
                @JsonAlias("android:mimeType") var mimeType: String)
