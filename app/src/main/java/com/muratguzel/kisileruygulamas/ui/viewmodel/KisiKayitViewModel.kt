package com.muratguzel.kisileruygulamas.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiKayitViewModel :ViewModel(){
    var krepo = KisilerRepository()

    fun kisiKayit(kisi_ad: String, kisi_tel: String){
        viewModelScope.launch(Dispatchers.Main) {
            krepo.kisiKayit(kisi_ad,kisi_tel)
        }
    }
}