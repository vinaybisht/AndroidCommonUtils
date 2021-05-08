package vny.bst.apputility

import androidx.fragment.app.Fragment

/**
 * Created by Vinay Singh Bisht on 5/8/2021.
 */


/**
 * Replace a fragment in Activity
 * @param containerId Id of layout, fragment to be attached
 * @param fragment Name of fragment to be attached.
 * @param addToBackStack whether to add to back stack or not
 **/

fun Fragment.replaceFragment(
    containerId: Int,
    fragment: Fragment,
    addToBackStack: Boolean = false
) {
    childFragmentManager.apply {
        if (addToBackStack)
            beginTransaction().replace(containerId, fragment)
                .addToBackStack(fragment::class.java.simpleName).commit()
        else
            beginTransaction().replace(containerId, fragment).commit()
    }
}


/**
 * Add a fragment in Activity
 * @param containerId Id of layout, fragment to be attached
 * @param fragment Name of fragment to be attached.
 * @param addToBackStack whether to add to back stack or not
 **/

fun Fragment.addFragment(containerId: Int, fragment: Fragment, addToBackStack: Boolean = false) {
    childFragmentManager.apply {
        if (addToBackStack)
            beginTransaction().add(containerId, fragment)
                .addToBackStack(fragment::class.java.simpleName).commit()
        else
            beginTransaction().add(containerId, fragment).commit()
    }
}
