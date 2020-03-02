package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class Service(@JsonAlias("android:description") var description: String?,
                   @JsonAlias("android:directBootAware") var directBootAware: Boolean = false,
                   @JsonAlias("android:enabled") var enabled: Boolean = true,
                   @JsonAlias("android:exported") var exported: Boolean?,
                   @JsonAlias("android:foregroundServiceType") var foregroundServiceType: ForegroundServiceType?,
                   @JsonAlias("android:icon") var icon: String?,
                   @JsonAlias("android:isolatedProcess") var isolatedProcess: Boolean?,
                   @JsonAlias("android:label") var label: String?,
                   @JsonAlias("android:name") var name: String,
                   @JsonAlias("android:permission") var permission: String?,
                   @JsonAlias("android:process") var process: String?,
                   @set:JsonProperty("intent-filter") var intentFilters: Set<IntentFilter> = setOf(),
                   @set:JsonProperty("meta-data") var metaData: Set<MetaData> = setOf())

enum class ForegroundServiceType {
    connectedDevice,
    dataSync,
    location,
    mediaPlayback,
    mediaProjection,
    phoneCall
}
