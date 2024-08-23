package com.muratguzel.kisileruygulamas.di

import com.muratguzel.kisileruygulamas.data.datasource.KisilerDataSource
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
import com.muratguzel.kisileruygulamas.retrofit.ApiUtils
import com.muratguzel.kisileruygulamas.retrofit.KisilerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideKisilerDataSource(kdao: KisilerDao): KisilerDataSource {
        return KisilerDataSource(kdao)
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kds: KisilerDataSource): KisilerRepository {
        return KisilerRepository(kds)
    }
    @Provides
    @Singleton
    fun provideKisilerDao(): KisilerDao {
        return ApiUtils.getKisilerDao()
    }
}