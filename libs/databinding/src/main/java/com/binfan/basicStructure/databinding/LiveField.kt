package com.binfan.basicStructure.databinding

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData

open class LiveField<T : Any>(value: T) : LiveData<T>() {
    init {
        this.value = value
    }

    override fun getValue(): T {
        return super.getValue()!!
    }
}

inline fun <T : Any> LiveField<T>.observe(owner: LifecycleOwner, crossinline observer: (t: T) -> Unit) = observeNotNull(owner, observer)

inline fun <T : Any> LiveData<T>.observeNotNull(owner: LifecycleOwner, crossinline observer: (T) -> Unit) {
    this.observe(owner) { it?.run(observer) }
}
