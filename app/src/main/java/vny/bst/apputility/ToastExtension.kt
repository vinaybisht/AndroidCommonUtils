package vny.bst.apputility

import android.content.Context
import android.widget.Toast

/**
 * Created by Vinay Singh Bisht on 5/8/2021.
 */


/**
 * Extension function for showing toast message
 * @param context
 * @param duration any of Toast.LENGTH_SHORT or LENGTH_LONG,
 * Default Toast.LENGTH_SHORT
 * */
fun String.toast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, this, duration).show()
}
