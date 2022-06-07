package com.binfan.basicStructure.databinding

class MutableLiveField<T : Any>(value: T) : LiveField<T>(value) {
    public override fun setValue(value: T) {
        super.setValue(value)
    }

    public override fun postValue(value: T) {
        super.postValue(value)
    }

    inline fun setValue(block: T.() -> T) {
        value = block(value)
    }
}
