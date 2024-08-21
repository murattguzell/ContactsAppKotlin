package com.muratguzel.kisileruygulamas.data.repo

import com.muratguzel.kisileruygulamas.data.datasource.KisilerDataSource
import com.muratguzel.kisileruygulamas.data.entity.Kisiler

class KisilerRepository(var kds: KisilerDataSource) {

    suspend fun kisiKayit(kisi_ad: String, kisi_tel: String) =
        kds.kisiKayit(kisi_ad, kisi_tel)

    suspend fun guncelle(kisi_id: Int, kisi_ad: String, kisi_tel: String) =
        kds.guncelle(kisi_id, kisi_ad, kisi_tel)

    suspend fun delete(kisId: Int) = kds.delete(kisId)

    suspend fun kisileriYukle(): List<Kisiler> = kds.kisileriYukle()

    suspend fun ara(aramaKelimesi: String) : List<Kisiler> = kds.ara(aramaKelimesi)
}