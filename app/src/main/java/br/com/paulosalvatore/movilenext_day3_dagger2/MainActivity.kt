package br.com.paulosalvatore.movilenext_day3_dagger2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.paulosalvatore.movilenext_day3_dagger2.inject.DaggerApiComponent
import br.com.paulosalvatore.movilenext_day3_dagger2.inject.DaggerTwitterComponent
import br.com.paulosalvatore.movilenext_day3_dagger2.inject.TwitterModule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiComponent = DaggerApiComponent.create()
        val twitterComponent = DaggerTwitterComponent.builder()
            .apiComponent(apiComponent)
            .twitterModule(TwitterModule("Paulo Salvatore"))
            .build()

        twitterComponent.app().run()

        /*

        val tweeter = component.tweeter()
        tweeter.tweet("Hello, #DependencyInjection")
        tweeter.tweet("#Kotlin > #Java")

        val timeline = component.timeline()
        timeline.loadMore(20)
        timeline.get().forEach {
            println("${it.tweet}\n")
        }*/
    }
}
