package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.CUPCAKE)
data class UsesConfiguration(@JsonAlias("android:reqFiveWayNav") var reqFiveWayNav: Boolean?,
                             @JsonAlias("android:reqHardKeyboard") var reqHardKeyboard: Boolean?,
                             @JsonAlias("android:reqKeyboardType") var reqKeyboardType: ReqKeyboardType = ReqKeyboardType.undefined,
                             @JsonAlias("android:reqNavigation") var reqNavigation: ReqNavigation = ReqNavigation.undefined,
                             @JsonAlias("android:reqTouchScreen") var reqTouchScreen: ReqTouchScreen = ReqTouchScreen.undefined)

enum class ReqKeyboardType {
    undefined,
    nokeys,
    qwerty,
    twelvekey
}

enum class ReqNavigation {
    undefined,
    nonav,
    dpad,
    trackball,
    wheel
}

enum class ReqTouchScreen {
    undefined,
    notouch,
    stylus,
    finger
}

