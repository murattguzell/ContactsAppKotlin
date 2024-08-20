package com.muratguzel.kisileruygulamas.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.databinding.FragmentMainBinding
import com.muratguzel.kisileruygulamas.ui.adapter.KisilerAdapter
import com.muratguzel.kisileruygulamas.ui.viewmodel.MainViewModel


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var kisilerAdapter: KisilerAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: MainViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        binding.mainFragment = this
        binding.mainToolBarBaslik = "Kişiler"
        viewModel.kisilerListesi.observe(viewLifecycleOwner){kisilerListesi ->
            kisilerAdapter = KisilerAdapter(requireContext(), kisilerListesi,viewModel)
            binding.kisilerAdapter = kisilerAdapter
        }

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
        return binding.root

    }

    fun fub(view: View){
        Navigation.findNavController(view).navigate(R.id.kisiKayitGecis)

    }

    fun ara(aramaKelimesi: String) {
        viewModel.ara(aramaKelimesi)
    }
}