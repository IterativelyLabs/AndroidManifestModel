package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class MetaData(@JsonAlias("android:name") var name: String,
                    @JsonAlias("android:resource") var resource: String,
                    @JsonAlias("android:value") var value: String)