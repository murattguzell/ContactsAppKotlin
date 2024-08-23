package com.muratguzel.kisileruygulamas.retrofit

import com.muratguzel.kisileruygulamas.data.entity.CRUDResponse
import com.muratguzel.kisileruygulamas.data.entity.KisilerResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface KisilerDao {
    //http://kasimadalan.pe.hu/kisiler/tum_kisiler.php
    //http://kasimadalan.pe.hu/ -> base url
    //kisiler/tum_kisiler.php -> api url

    @GET("kisiler/tum_kisiler.php")
    suspend fun  kisileriYukle() : KisilerResponse

    @POST("kisiler/insert_kisiler.php")
    @FormUrlEncoded
    suspend fun kaydet(@Field("kisi_ad")kisi_ad:String,@Field("kisi_tel") kisi_tel:String) : CRUDResponse

    @POST("kisiler/update_kisiler.php")
    @FormUrlEncoded
    suspend fun guncelle(@Field("kisi_id")kisi_id:Int,@Field("kisi_ad")kisi_ad:String,@Field("kisi_tel") kisi_tel:String) : CRUDResponse

    @POST("kisiler/delete_kisiler.php")
    @FormUrlEncoded
    suspend fun sil(@Field("kisi_id")kisi_id:Int) : CRUDResponse

    @POST("kisiler/tum_kisiler_arama.php")
    @FormUrlEncoded
    suspend fun ara(@Field("kisi_ad")aramaKelimesi:String) : KisilerResponse
}