package uk.co.iteratively.amm

import org.junit.Assert.*
import org.junit.Test
import uk.co.iteratively.amm.extensions.from
import uk.co.iteratively.amm.models.Manifest

class ManifestTest {

    @Test
    fun testSimpleManifest() {
        val xml = "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"" +
                "          package=\"com.test.wobble\"" +
                "          android:versionCode=\"1\"" +
                "          android:versionName=\"1.0\"><application android:allowBackup=\"true\" android:name=\"thingy\">"+
                "     <activity name=\".MainActivity\"></activity><activity name=\".SplashActivity\"></activity></application></manifest>"

        val manifest = Manifest.from(xml)

        assertEquals("com.test.wobble", manifest?.packageName)
        assertEquals(1, manifest?.versionCode)
        assertEquals("1.0", manifest?.versionName)
        assertNotNull(manifest?.application)
        assertEquals(2, manifest?.application?.activities?.size)
        assertNull(manifest?.sharedUserId)
        assertNull(manifest?.sharedUserLabel)
        assertNull(manifest?.installLocation)
    }
}