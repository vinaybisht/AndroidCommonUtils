package vny.bst.apputility

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vny.bst.apputility.exception.BlankStringException

/**
 * Created by Vinay Singh Bisht on 5/8/2021.
 */


/**
 * Intent extension function for opening a url in external web browser
 * @param url an url to be open in browser
 * @exception BlankStringException if url is empty
 *
 * */
fun Context.openUrl(url: String) {
    if (url.isEmpty()) throw BlankStringException("Url is Missing")
    Intent(Intent.ACTION_VIEW).apply {
        data = Uri.parse(url)
        startActivity(this)
    }
}

/**
 * Intent extension for opening an Activity
 * @param activity Name of Activity to open
 *@param bundle Bundle to be passed to next activity, this can be null
 *
 **/

fun Context.openActivity(activity: Class<AppCompatActivity>, bundle: Bundle? = null) {
    Intent(this, activity).apply {
        bundle?.let {
            putExtras(it)
        }
        startActivity(this)
    }
}

