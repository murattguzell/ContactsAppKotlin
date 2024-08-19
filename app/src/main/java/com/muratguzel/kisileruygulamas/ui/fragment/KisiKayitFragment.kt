package com.muratguzel.kisileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_kisi_kayit, container, false)
        binding.kisiKayitFragment = this
        binding.kisiKayitToolBarBaslik = "Kişi Kayıt"
        return binding.root
    }

    fun kisiKayit(kisi_ad: String, kisi_tel: String) {
        Log.d("kaydet", "$kisi_ad - $kisi_tel")
    }

}