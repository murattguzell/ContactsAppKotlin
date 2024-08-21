package com.muratguzel.kisileruygulamas.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class KisiKayitViewModel@Inject constructor(var krepo: KisilerRepository) :ViewModel(){

    fun kisiKayit(kisi_ad: String, kisi_tel: String){
        viewModelScope.launch(Dispatchers.Main) {
            krepo.kisiKayit(kisi_ad,kisi_tel)
        }
    }
}