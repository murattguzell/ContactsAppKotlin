package com.muratguzel.kisileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import com.muratguzel.kisileruygulamas.databinding.FragmentMainBinding
import com.muratguzel.kisileruygulamas.ui.adapter.KisilerAdapter


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var kisilerAdapter: KisilerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.mainFragment = this
        binding.mainToolBarBaslik = "Kişiler"

        binding.search.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextChange(newText: String?): Boolean {
                ara(newText.toString())
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                ara(query.toString())
                return true
            }
        })
        setRecyclerView()
        return binding.root

    }

    fun fub(view: View){
        Navigation.findNavController(view).navigate(R.id.kisiKayitGecis)

    }

    fun ara(aramaKelimesi: String) {
        Log.e("Kişi Ara", aramaKelimesi)
    }

    fun setRecyclerView() {
        val kisilerListesi = ArrayList<Kisiler>()
        val murat = Kisiler(1, "Murat", "0538 392 20 37")
        val nazli = Kisiler(2, "Nazlı", "0530 022 86 01")
        val ayse = Kisiler(3, "Ayşe", "11111111")
        kisilerListesi.add(murat)
        kisilerListesi.add(nazli)
        kisilerListesi.add(ayse)
        kisilerAdapter = KisilerAdapter(requireContext(), kisilerListesi)
        binding.kisilerAdapter = kisilerAdapter
    }
}