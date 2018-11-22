package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import dagger.Component
import javax.inject.Singleton

@User
@Component(
    dependencies = [
        ApiComponent::class
    ],
    modules = [
        TwitterModule::class
    ]
)
interface TwitterComponent {
    fun app(): TwitterApplication
//    fun injectApp(app: TwitterApplication): TwitterApplication

//    fun injectActivity(activity: MainActivity): MainActivity
//    fun tweeter(): Tweeter
//    fun timeline(): Timeline
}
