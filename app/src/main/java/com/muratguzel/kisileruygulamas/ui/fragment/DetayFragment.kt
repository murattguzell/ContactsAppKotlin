package com.muratguzel.kisileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

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
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        binding.toolbar.title = "Kişi Detay"
        val bundle: DetayFragmentArgs by navArgs()
        val gelenKisi = bundle.kisi
        binding.editTextKisiAdi.setText(gelenKisi.kisi_ad)
        binding.editTextTel.setText(gelenKisi.kisi_tel)

        binding.guncelle.setOnClickListener {
            val kisi_ad = binding.editTextKisiAdi.text.toString()
            val kisi_tel = binding.editTextTel.text.toString()
            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }


        return binding.root


    }
    fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) {
        Log.e("kişi Güncelle","$kisi_id - $kisi_ad -$kisi_tel")
    }

}