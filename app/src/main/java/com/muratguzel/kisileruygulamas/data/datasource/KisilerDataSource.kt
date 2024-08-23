package com.muratguzel.kisileruygulamas.data.datasource

import android.util.Log
import com.muratguzel.kisileruygulamas.data.entity.Kisiler
import com.muratguzel.kisileruygulamas.retrofit.KisilerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource(var kdao: KisilerDao) {

    suspend fun ara(aramaKelimesi: String): List<Kisiler> =
        withContext(Dispatchers.IO) {
            return@withContext kdao.ara(aramaKelimesi).kisiler
        }


    suspend fun kisiKayit(kisi_ad: String, kisi_tel: String) =
        kdao.kaydet(kisi_ad, kisi_tel)


    suspend fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) =
        kdao.guncelle(kisi_id, kisi_ad, kisi_tel)

    suspend fun delete(kisId: Int) =
        kdao.sil(kisId)

    suspend fun kisileriYukle(): List<Kisiler> =
        withContext(Dispatchers.IO) {
            return@withContext kdao.kisileriYukle().kisiler
        }
}