package com.muratguzel.kisileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.databinding.FragmentKisiKayitBinding
import com.muratguzel.kisileruygulamas.ui.viewmodel.KisiKayitViewModel


class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    private lateinit var viewModel: KisiKayitViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: KisiKayitViewModel by viewModels()
        viewModel = tempViewModel
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

        fun kaydet(kisi_ad: String, kisi_tel: String) {
            viewModel.kisiKayit(kisi_ad, kisi_tel)
        }

}