package com.muratguzel.kisileruygulamas.di

import com.muratguzel.kisileruygulamas.data.datasource.KisilerDataSource
import com.muratguzel.kisileruygulamas.data.repo.KisilerRepository
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
    fun provideKisilerRepository(): KisilerDataSource {
        return KisilerDataSource()
    }

    @Provides
    @Singleton
    fun provideKisilerDataSource(kds: KisilerDataSource): KisilerRepository {
        return KisilerRepository(kds)
    }


}