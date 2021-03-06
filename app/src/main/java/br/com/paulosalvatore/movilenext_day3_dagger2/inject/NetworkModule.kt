package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    fun provideOkHttpClient() = OkHttpClient()

//    @Provides @Singleton
//    fun provideTwitterApi(client: OkHttpClient) = TwitterApi(client)
}
