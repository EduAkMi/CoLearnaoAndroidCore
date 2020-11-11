package com.example.colearnaoandroidcore.bProjectB

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReligionViewModel:ViewModel() {
    val religionVM : MutableLiveData<Boolean> = MutableLiveData()
    val changeTab: MutableLiveData<Boolean> = MutableLiveData()

    fun changeReligionVM (confirm: Boolean){
        religionVM.postValue(confirm)
    }

    fun setChangeTab (confirm: Boolean){
        changeTab.postValue(confirm)
    }
}