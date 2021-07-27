package com.qasim.paging3example.utils.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.qasim.paging3example.utils.SingleEvent

fun AppCompatActivity.replaceFragment(
    fragment: Fragment,
    frameId: Int,
    addBackStack: Boolean,
    clearBackStack: Boolean
) {
    supportFragmentManager.transact {
        if (addBackStack)
            addToBackStack(fragment::class.java.name)
        if (clearBackStack) {
            for (i in 0 until supportFragmentManager.backStackEntryCount) {
                supportFragmentManager.popBackStack()
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

fun <T> LifecycleOwner.observe(liveData: LiveData<T>, action: (t: T) -> Unit) {
    liveData.observe(this, Observer { it?.let { t -> action(t) } })
}

fun <T> LifecycleOwner.observeEvent(
    liveData: LiveData<SingleEvent<T>>,
    action: (t: SingleEvent<T>) -> Unit
) {
    liveData.observe(this, Observer { it?.let { t -> action(t) } })
}