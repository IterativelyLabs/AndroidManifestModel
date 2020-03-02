package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.ANDROID_1)
data class Activity(@JsonAlias("android:allowEmbedded") var allowEmbedded: Boolean = false,
                    @JsonAlias("android:allowTaskReparenting") var allowTaskReparenting: Boolean = false,
                    @JsonAlias("android:alwaysRetainTaskState") var alwaysRetainTaskState: Boolean = false,
                    @JsonAlias("android:autoRemoveFromRecents") var autoRemoveFromRecents: Boolean,
                    @JsonAlias("android:banner") var banner: String? = null,
                    @JsonAlias("android:clearTaskOnLaunch") var clearTaskOnLaunch: Boolean = false,
                    @JsonAlias("android:colorMode") var colorMode: ColorMode?,
                    @JsonAlias("android:configChanges") var configChanges: ConfigChanges?,
                    @JsonAlias("android:directBootAware") var directBootAware: Boolean = false,
                    @JsonAlias("android:documentLaunchMode") var  documentLaunchMode: DocumentLaunchMode?,
                    @JsonAlias("android:enabled") var enabled: Boolean = true,
                    @JsonAlias("android:excludeFromRecents") var excludeFromRecents: Boolean = false,
                    @JsonAlias("android:exported") var exported: Boolean? = null,
                    @JsonAlias("android:finishOnTaskLaunch") var finishOnTaskLaunch: Boolean = false,
                    @JsonAlias("android:hardwareAccelerated") var hardwareAccelerated: Boolean = false,
                    @JsonAlias("android:icon") var icon: String = "",
                    @JsonAlias("android:immersive") var immersive: Boolean?,
                    @JsonAlias("android:label") var label: String = "",
                    @JsonAlias("android:launchMode") var launchMode: LaunchMode = LaunchMode.standard,
                    @JsonAlias("android:lockTaskMode") var lockTaskMode: LockTaskMode = LockTaskMode.normal,
                    @JsonAlias("android:maxRecents") var maxRecents: Int = 16,
                    @JsonAlias("android:maxAspectRatio") var maxAspectRatio: Float?,
                    @JsonAlias("android:multiprocess") var multiprocess: Boolean = false,
                    @JsonAlias("android:name") var name: String,
                    @JsonAlias("android:noHistory") @Since(AndroidApi.CUPCAKE) var noHistory: Boolean = false,
                    @JsonAlias("android:parentActivityName") @Since(AndroidApi.JELLY_BEAN) var parentActivityName: String = "",
                    @JsonAlias("android:persistableMode") var persistableMode: PersistableMode = PersistableMode.persistRootOnly,
                    @JsonAlias("android:permission") var permission: String = "",
                    @JsonAlias("android:process") var process: String = "",
                    @JsonAlias("android:relinquishTaskIdentity") var relinquishTaskIdentity: Boolean = false,
                    @JsonAlias("android:resizeableActivity") @Since(AndroidApi.NOUGAT) var resizeableActivity: Boolean?,
                    @JsonAlias("android:screenOrientation") var screenOrientation: ScreenOrientation = ScreenOrientation.unspecified,
                    @JsonAlias("android:showForAllUsers") @Since(AndroidApi.MARSHMALLOW) var showForAllUsers: Boolean?,
                    @JsonAlias("android:stateNotNeeded") var stateNotNeeded: Boolean = false,
                    @JsonAlias("android:supportsPictureInPicture") @Since(AndroidApi.NOUGAT) var supportsPictureInPicture: Boolean?,
                    @JsonAlias("android:taskAffinity") var taskAffinity: String = "",
                    @JsonAlias("android:theme") var theme: String = "",
                    @JsonAlias("android:uiOptions") var uiOptions: UIOptions = UIOptions.none,
                    @JsonAlias("android:windowSoftInputMode") @Since(AndroidApi.CUPCAKE) var windowSoftInputMode: WindowSoftInputMode?,
                    @set:JsonProperty("meta-data") var metaData: List<MetaData>? = listOf())

enum class ColorMode {
    hdr,
    wideColorGamut
}

enum class ConfigChanges {
    mcc,
    mnc,
    locale,
    touchscreen,
    keyboard,
    keyboardHidden,
    navigation,
    screenLayout,
    fontScale,
    uiMode,
    orientation,
    density,
    screenSize,
    smallestScreenSize
}

enum class DocumentLaunchMode {
    intoExisting,
    always,
    none,
    never
}

enum class LaunchMode {
    standard,
    singleTop,
    singleTask,
    singleInstance
}

enum class LockTaskMode {
    normal,
    never,
    if_whitelisted,
    always
}

enum class PersistableMode {
    persistRootOnly,
    persistAcrossReboots,
    persistNever
}

enum class ScreenOrientation {
    unspecified,
    behind,
    landscape,
    portrait,
    reverseLandscape,
    reversePortrait,
    sensorLandscape,
    sensorPortrait,
    userLandscape,
    userPortrait,
    sensor,
    fullSensor,
    nosensor,
    user,
    fullUser,
    locked
}

@Since(AndroidApi.ANDROID_1)
enum class UIOptions {
    none,

    @Since(AndroidApi.ICE_CREAM_SANDWICH)
    splitActionBarWhenNarrow
}

enum class WindowSoftInputMode {
    stateUnspecified,
    stateUnchanged,
    stateHidden,
    stateAlwaysHidden,
    stateVisible,
    stateAlwaysVisible,
    adjustUnspecified,
    adjustResize,
    adjustPan
}

