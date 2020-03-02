package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias
import uk.co.iteratively.amm.AndroidApi
import uk.co.iteratively.amm.annotations.Since

@Since(AndroidApi.DONUT)
data class SupportsScreens(@JsonAlias("android:resizeable") var resizeable: Boolean,
                           @JsonAlias("android:smallScreens") var smallScreens: Boolean = true,
                           @JsonAlias("android:normalScreens") var normalScreens: Boolean = true,
                           @JsonAlias("android:largeScreens") var largeScreens: Boolean,
                           @JsonAlias("android:xlargeScreens") @Since(AndroidApi.GINGERBREAD) var xlargeScreens: Boolean,
                           @JsonAlias("android:anyDensity") @Since(AndroidApi.DONUT) var anyDensity: Boolean = true,
                           @JsonAlias("android:requiresSmallestWidthDp") @Since(AndroidApi.HONEYCOMB_MR2) var requiresSmallestWidthDp: Int?,
                           @JsonAlias("android:compatibleWidthLimitDp") @Since(AndroidApi.HONEYCOMB_MR2) var compatibleWidthLimitDp: Int?,
                           @JsonAlias("android:largestWidthLimitDp") @Since(AndroidApi.HONEYCOMB_MR2) var largestWidthLimitDp: Int?)
