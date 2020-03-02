package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class IntentFilter(@JsonAlias("android:icon") var icon: String,
                        @JsonAlias("android:label") var label: String,
                        @JsonAlias("android:priority") var priority: Int = 0,
                        @JsonAlias("android:order") @Since(AndroidApi.PIE) var order: Int = 0,
                        @set:JsonProperty("action") var actions: List<Action> = listOf(),
                        @set:JsonProperty("category") var categories: List<Category> = listOf(),
                        @set:JsonProperty("data") var data: List<Data> = listOf())