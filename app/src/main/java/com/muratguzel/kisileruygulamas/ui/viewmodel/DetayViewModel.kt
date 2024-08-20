package com.muratguzel.kisileruygulamas.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetayViewModel : ViewModel() {
    val krepo = KisilerRepository()
    fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) =
        viewModelScope.launch(Dispatchers.Main) {
            krepo.guncelle(kisi_id, kisi_ad, kisi_tel)
        }
}