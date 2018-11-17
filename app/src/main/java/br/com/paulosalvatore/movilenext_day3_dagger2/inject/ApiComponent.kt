package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class
    ]
)
interface ApiComponent {
    fun api(): TwitterApi
}
