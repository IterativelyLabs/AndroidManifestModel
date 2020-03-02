package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
class UsesLibrary(@JsonAlias("android:name") var name: String,
                  @Since(AndroidApi.ECLAIR_MR2) @JsonAlias("android:required") var required: Boolean = true)