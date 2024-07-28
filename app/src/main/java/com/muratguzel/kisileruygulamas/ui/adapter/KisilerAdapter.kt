package com.muratguzel.kisileruygulamas.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import com.muratguzel.kisileruygulamas.databinding.CardTasarimBinding
import com.muratguzel.kisileruygulamas.ui.fragment.MainFragmentDirections

class KisilerAdapter(var context: Context, var kisilerListesi: List<Kisiler>) :
    RecyclerView.Adapter<KisilerAdapter.CardTasarimVH>() {
    inner class CardTasarimVH(var tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimVH {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(context), parent, false)
        return CardTasarimVH(binding)
    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimVH, position: Int) {
        val kisi = kisilerListesi.get(position)
        holder.tasarim.textViewKisi.text = kisi.kisi_ad
        holder.tasarim.textViewKisiTel.text = kisi.kisi_tel

        holder.itemView.setOnClickListener {
            val gecis = MainFragmentDirections.kisiDetayGecis(kisi)
            Navigation.findNavController(it).navigate(gecis)
        }
        holder.tasarim.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_ad} Silinsin mi?",Snackbar.LENGTH_LONG).setAction("EVET"){
                delete(kisi.kisi_id)
            }
        }
    }

    fun delete(kisId: Int){
    }
}