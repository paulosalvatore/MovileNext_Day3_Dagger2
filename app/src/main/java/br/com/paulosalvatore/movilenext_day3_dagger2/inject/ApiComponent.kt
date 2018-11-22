package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import dagger.Component

@Component(
    modules = [
        NetworkModule::class
    ]
)
interface ApiComponent {
    fun api(): TwitterApi
}
