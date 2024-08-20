package com.muratguzel.kisileruygulamas.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.muratguzel.kisileruygulamas.R
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import com.muratguzel.kisileruygulamas.databinding.CardTasarimBinding
import com.muratguzel.kisileruygulamas.ui.fragment.MainFragmentDirections
import com.muratguzel.kisileruygulamas.ui.viewmodel.MainViewModel
import com.muratguzel.kisileruygulamas.util.switch

class KisilerAdapter(var context: Context, var kisilerListesi: List<Kisiler>,var viewModel: MainViewModel) :
    RecyclerView.Adapter<KisilerAdapter.CardTasarimVH>() {

        inner class CardTasarimVH(var tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimVH {
        val binding:CardTasarimBinding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.card_tasarim, parent, false)
        return CardTasarimVH(binding)
    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimVH, position: Int) {
        val kisi = kisilerListesi.get(position)
        holder.tasarim.kisiNesnesi = kisi

        holder.itemView.setOnClickListener {
            val gecis = MainFragmentDirections.kisiDetayGecis(kisi)
            Navigation.switch(it, gecis)
        }
        holder.tasarim.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_ad} Silinsin mi?",Snackbar.LENGTH_LONG).setAction("EVET"){
                viewModel.delete(kisi.kisi_id)
            }.show()
        }
    }

}