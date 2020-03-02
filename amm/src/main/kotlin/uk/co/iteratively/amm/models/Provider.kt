package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class Provider(@JsonAlias("android:authorities") var authorities: String,
                    @JsonAlias("android:directBootAware") var directBootAware: Boolean = false,
                    @JsonAlias("android:enabled") var enabled: Boolean = false,
                    @JsonAlias("android:exported") @Since(AndroidApi.JELLY_BEAN_MR1) var exported: Boolean?,
                    @JsonAlias("android:grantUriPermissions") var grantUriPermissions: Boolean = false,
                    @JsonAlias("android:icon") var icon: String?,
                    @JsonAlias("android:initOrder") var initOrder: Int?,
                    @JsonAlias("android:label") var label: String?,
                    @JsonAlias("android:multiprocess") var multiprocess: Boolean = false,
                    @JsonAlias("android:name") var name: String,
                    @JsonAlias("android:permission") var permission: String?,
                    @JsonAlias("android:readPermission") var readPermission: String?,
                    @JsonAlias("android:syncable") var syncable: Boolean?,
                    @JsonAlias("android:writePermission") var writePermission: String?,
                    @set:JsonProperty("meta-data") var metaData: Set<MetaData> = setOf(),
                    @set:JsonProperty("grant-uri-permission") var grantUriPermission: Set<GrantURIPermission> = setOf(),
                    @set:JsonProperty("path-permission") var pathPermission: Set<PathPermission> = setOf())
