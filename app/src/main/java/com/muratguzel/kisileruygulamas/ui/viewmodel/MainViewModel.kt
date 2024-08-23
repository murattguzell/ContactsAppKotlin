package com.muratguzel.kisileruygulamas.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(var krepo: KisilerRepository) : ViewModel() {
    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisileriYukle()
    }

    fun delete(kisId: Int) =
        viewModelScope.launch(Dispatchers.Main) {
            krepo.delete(kisId)
            kisileriYukle()
        }

    fun kisileriYukle() = viewModelScope.launch(Dispatchers.Main) {
        try {
            kisilerListesi.value = krepo.kisileriYukle()
        } catch (e:Exception){}

    }

    fun ara(aramaKelimesi: String) =
        viewModelScope.launch(Dispatchers.Main) {
            try {
                kisilerListesi.value = krepo.ara(aramaKelimesi)
            } catch (e:Exception){}

        }
}