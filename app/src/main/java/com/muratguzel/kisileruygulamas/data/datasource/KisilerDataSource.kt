package com.muratguzel.kisileruygulamas.data.datasource

import android.util.Log
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource {

   suspend fun ara(aramaKelimesi: String): List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi = ArrayList<Kisiler>()
            val murat = Kisiler(1, "Murat", "0538 392 20 37")
            kisilerListesi.add(murat)
            return@withContext kisilerListesi
        }


   suspend fun kisiKayit(kisi_ad: String, kisi_tel: String) =
        Log.d("kaydet", "$kisi_ad - $kisi_tel")


    suspend fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) =
        Log.e("kişi Güncelle","$kisi_id - $kisi_ad -$kisi_tel")

    suspend fun delete(kisId: Int) =
        Log.e("Kişi Sil", "$kisId")

    suspend fun kisileriYukle() : List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi = ArrayList<Kisiler>()
            val murat = Kisiler(1, "Murat", "0538 392 20 37")
            val nazli = Kisiler(2, "Nazlı", "0530 022 86 01")
            val ayse = Kisiler(3, "Ayşe", "11111111")
            kisilerListesi.add(murat)
            kisilerListesi.add(nazli)
            kisilerListesi.add(ayse)
            return@withContext kisilerListesi
        }
}