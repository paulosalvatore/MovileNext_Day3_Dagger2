package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import br.com.paulosalvatore.movilenext_day3_dagger2.Timeline
import br.com.paulosalvatore.movilenext_day3_dagger2.Tweeter
import br.com.paulosalvatore.movilenext_day3_dagger2.TwitterApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        TwitterModule::class
    ]
)
interface TwitterComponent {
    fun app(): TwitterApplication
//    fun tweeter(): Tweeter
//    fun timeline(): Timeline
}
