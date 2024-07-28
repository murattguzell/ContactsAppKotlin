package com.muratguzel.kisileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {

    private lateinit var binding: FragmentKisiKayitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKisiKayitBinding.inflate(inflater, container, false)

        binding.kisiKayitToolBar.title = "Kişi Kayıt"
        binding.kayit.setOnClickListener {
            val kisi_ad = binding.editTextKisiAdi.text.toString()
            val kisi_tel = binding.editTextTel.text.toString()
            kayit(kisi_ad,kisi_tel)
        }
        return binding.root
    }

    fun kayit(kisi_ad: String, kisi_tel: String) {

        Log.e("kaydet", "$kisi_ad - $kisi_tel")

    }

}