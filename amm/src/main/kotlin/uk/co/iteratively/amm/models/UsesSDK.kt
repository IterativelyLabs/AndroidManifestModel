package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class UsesSDK(@JsonAlias("android:minSdkVersion") var minSdkVersion: Int,
                   @Since(AndroidApi.DONUT) @JsonAlias("android:targetSdkVersion") var targetSdkVersion: Int?,
                   @Since(AndroidApi.DONUT) @JsonAlias("android:maxSdkVersion") var maxSdkVersion: Int?)