package com.muratguzel.kisileruygulamas.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val krepo = KisilerRepository()
    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisileriYukle()
    }

    fun delete(kisId: Int) =
        viewModelScope.launch(Dispatchers.Main) {
            krepo.delete(kisId)
        }

    private fun kisileriYukle() = viewModelScope.launch(Dispatchers.Main) {
        kisilerListesi.value = krepo.kisileriYukle()
    }

    fun ara(aramaKelimesi: String) =
        viewModelScope.launch(Dispatchers.Main) {
            kisilerListesi.value = krepo.ara(aramaKelimesi)
        }
}