package com.udacity.shoestore.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeStoreViewModel : ViewModel() {

    val shoesList : MutableLiveData<MutableList<Shoe>> = MutableLiveData()
    val shoe = MutableLiveData<Shoe>()

    init {
        shoesList.value = mutableListOf()
    }

    fun addNewShoe(pName: String, pCompany: String, pSize: String, pDescription: String) {
        shoesList.value!!.add(Shoe(name = pName, company = pCompany, size = pSize.toDouble(), description = pDescription))
    }

    fun clearData() {
        shoesList.value!!.clear()
    }
}