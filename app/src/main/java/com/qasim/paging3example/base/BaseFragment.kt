package com.qasim.paging3example.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

abstract class BaseFragment : Fragment() {

    private var ctx: FragmentActivity? = null

    private lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.ctx = activity
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context;
    }

    fun popStack() {
        hideKeyboard((ctx as Activity?)!!)
        ctx!!.supportFragmentManager.popBackStack()
    }

    fun activateHideKeyboardUponTouchingScreen(view: View) {
        // Set up touch listener for non-text box views to hide keyboard.
        if (view !is EditText) {
            view.setOnTouchListener { _, _ ->
                hideKeyboard(ctx!!)
                false
            }
        }
        //If a layout container, iterate over children and seed recursion.
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                val innerView = view.getChildAt(i)
                activateHideKeyboardUponTouchingScreen(innerView)
            }
        }
    }

    private fun hideKeyboard(activity: Activity) {
        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun replaceFragment(
        fragment: Fragment,
        frameId: Int,
        addBackStack: Boolean,
        clearBackStack: Boolean
    ) {
        ctx!!.supportFragmentManager.transact {
            if (addBackStack)
                addToBackStack(fragment::class.java.name)
            if (clearBackStack) {
                for (i in 0 until ctx!!.supportFragmentManager.backStackEntryCount) {
                    ctx!!.supportFragmentManager.popBackStack()
                }
            }
            replace(frameId, fragment)
        }
    }

    private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
        beginTransaction().apply {
            action()
        }.commit()
    }

}