package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class PermissionGroup(@JsonAlias("android:description") var description: String,
                           @JsonAlias("android:icon") var icon: String,
                           @JsonAlias("android:label") var label: String,
                           @JsonAlias("android:name") var name: String)
