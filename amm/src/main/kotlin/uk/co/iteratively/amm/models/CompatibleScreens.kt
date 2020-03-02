package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.GINGERBREAD)
data class CompatibleScreens(@set:JsonProperty("screen") var screens: List<Screen> = listOf())

@Since(AndroidApi.GINGERBREAD)
data class Screen(@JsonAlias("android:screenSize") var screenSize: ScreenSize,
                  @JsonAlias("android:screenDensity") var screenDensity: ScreenDensity
)

enum class ScreenDensity {
    ldpi,
    mdpi,
    hdpi,
    xhdpi /* ,
    280,
    360,
    420,
    480,
    560 */
}

enum class ScreenSize {
    small,
    normal,
    large,
    xlarge
}