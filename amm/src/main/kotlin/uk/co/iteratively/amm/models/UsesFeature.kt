package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.DONUT)
class UsesFeature(@JsonAlias("android:name") var name: String?,
                  @JsonAlias("android:required") var required: Boolean = true,
                  @JsonAlias("android:glEsVersion") var glEsVersion: Int?)