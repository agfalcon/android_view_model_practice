package kr.ac.kumoh.KGB.smart_app_w3_02

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _count = MutableLiveData<Int>(0)

    fun getCount() = _count
    fun add(){
        _count.value = _count.value?.plus(1)
    }
}