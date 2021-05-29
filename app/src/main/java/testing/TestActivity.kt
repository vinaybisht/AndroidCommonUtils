package testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vny.bst.apputility.R
import vny.bst.apputility.openActivity
import vny.bst.apputility.openUrl
import vny.bst.apputility.toast

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        openUrl("https:google.com")
        "This is test toast".toast(this)
        openActivity(TestActivity())
    }
}