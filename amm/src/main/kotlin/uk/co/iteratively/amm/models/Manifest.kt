package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Deprecated

enum class InstallLocation {
    auto,
    internalOnly,
    preferExternal
}

@JsonRootName("manifest")
data class Manifest(@JsonAlias("package") var packageName: String,
                    @JsonAlias("android:sharedUserId") @Deprecated(since = AndroidApi.Q) var sharedUserId: String? = null,
                    @JsonAlias("android:sharedUserLabel") @Deprecated(since = AndroidApi.Q) var sharedUserLabel: String? = null,
                    @JsonAlias("android:versionCode") var versionCode: Int,
                    @JsonAlias("android:versionName")var versionName: String,
                    @JsonAlias("android:installLocation")var installLocation: InstallLocation? = null,
                    @set:JsonProperty("application") var application: Application? = null,
                    @set:JsonProperty("compatible-screens") var compatibleScreens: CompatibleScreens? = null,
                    @set:JsonProperty("permission") var permissions: Set<Permission> = setOf(),
                    @set:JsonProperty("permission-group") var permissionGroups: Set<PermissionGroup> = setOf(),
                    @set:JsonProperty("permission-tree") var permissionTrees: Set<PermissionTree> = setOf(),
                    @set:JsonProperty("supports-screens") var supportsScreens: SupportsScreens? = null,
                    @set:JsonProperty("uses-configuration") var usesConfiguration: UsesConfiguration? = null,
                    @set:JsonProperty("uses-feature") var usesFeatures: Set<UsesFeature> = setOf(),
                    @set:JsonProperty("uses-permission") var usesPermissions: Set<UsesPermission> = setOf(),
                    @set:JsonProperty("uses-sdk") var usersSDK: UsesSDK? = null) {

    companion object {
    }
}
