package org.idpass.smartscanner.mrz.parser

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.idpass.smartscanner.mrz.parser.innovatrics.MrzParser
import org.idpass.smartscanner.mrz.parser.innovatrics.MrzRecord
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("org.idpass.smartscanner.mrz.parser", appContext.packageName)
    }

  @Test
  fun parseExample() {
    // This MRZ code is valid, but the document number has zeros in it
    val mrz: String = ""
    val parsed: MrzRecord = MrzParser.parse(mrz)
    Log.d("MRZRECORD", parsed.toString());
    assertTrue(parsed.validComposite && parsed.validDocumentNumber)
    //assertEquals(parsed.documentNumber, "C0NC0NZ27")
  }
}
