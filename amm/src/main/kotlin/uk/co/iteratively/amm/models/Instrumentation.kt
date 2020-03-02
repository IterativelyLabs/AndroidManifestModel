package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class Instrumentation(@JsonAlias("android:functionalTest") var functionalTest: Boolean = false,
                           @JsonAlias("android:handleProfiling") var handleProfiling: Boolean = false,
                           @JsonAlias("android:icon") var icon: String = "",
                           @JsonAlias("android:label") var label: String = "",
                           @JsonAlias("android:name") var name: String,
                           @JsonAlias("android:targetPackage") var targetPackage: String = "",
                           @JsonAlias("android:targetProcesses") @Since(AndroidApi.OREO) var targetProcesses: String = "")





