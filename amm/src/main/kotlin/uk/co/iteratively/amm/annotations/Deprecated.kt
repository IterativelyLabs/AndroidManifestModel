package uk.co.iteratively.amm.annotations

import uk.co.iteratively.amm.AndroidApi

annotation class Deprecated(val since: AndroidApi,
                            val replaceWith: ReplaceWith = ReplaceWith(""))
