package uk.co.iteratively.amm.models

import com.fasterxml.jackson.annotation.JsonAlias

data class SupportsGLTexture(@JsonAlias("android:name") var name: String)
