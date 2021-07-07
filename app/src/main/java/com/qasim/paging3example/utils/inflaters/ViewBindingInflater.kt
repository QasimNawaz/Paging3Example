package com.qasim.paging3example.utils.inflaters

import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

//Activity View Binding
class SetContentView<out T : ViewDataBinding>(@LayoutRes private val layoutRes: Int) {

    private var value: T? = null

    operator fun getValue(thisRef: FragmentActivity, property: KProperty<*>): T {
        if (value == null) {
            value = DataBindingUtil.setContentView(thisRef, layoutRes)
            value!!.lifecycleOwner = thisRef
        }

        return value!!
    }
}

fun <T : ViewDataBinding> contentView(@LayoutRes layoutRes: Int) = SetContentView<T>(layoutRes)

//Activity View Binding
class FragmentViewBindingDelegate<T : ViewBinding>(
    val fragment: Fragment,
    val viewBindingFactory: (View) -> T
) : ReadOnlyProperty<Fragment, T> {
    private var binding: T? = null

    init {
        fragment.lifecycle.addObserver(object : LifecycleObserver {
            val viewLifecycleOwnerLiveDataObserver =
                Observer<LifecycleOwner?> {
                    val viewLifecycleOwner = it ?: return@Observer

                    viewLifecycleOwner.lifecycle.addObserver(object : LifecycleObserver {
                        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                        fun onDestroyObserver() {
                            binding = null
                        }
                    })
                }


            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            fun onCreateObserver() {
                fragment.viewLifecycleOwnerLiveData.observeForever(
                    viewLifecycleOwnerLiveDataObserver
                )
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroyObserver() {
                fragment.viewLifecycleOwnerLiveData.removeObserver(
                    viewLifecycleOwnerLiveDataObserver
                )
            }
        })
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        val binding = binding
        if (binding != null) {
            return binding
        }

        val lifecycle = fragment.viewLifecycleOwner.lifecycle
        if (!lifecycle.currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.")
        }

        return viewBindingFactory(thisRef.requireView()).also { this.binding = it }
    }
}

fun <T : ViewBinding> Fragment.viewBinding(viewBindingFactory: (View) -> T) =
    FragmentViewBindingDelegate(this, viewBindingFactory)