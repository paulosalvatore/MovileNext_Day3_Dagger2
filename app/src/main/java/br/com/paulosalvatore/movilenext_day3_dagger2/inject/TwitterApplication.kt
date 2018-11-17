package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import javax.inject.Inject

class TwitterApplication @Inject constructor() : Runnable {
    @Inject
    lateinit var tweeter: Tweeter
    @Inject
    lateinit var timeline: Timeline

    override fun run() {
        tweeter.tweet("Hello, #DependencyInjection")
        tweeter.tweet("#Kotlin > #Java")

        timeline.loadMore(20)
        timeline.get().forEach {
            println("${it.tweet}\n")
        }
    }

    @Inject
    fun enableStreaming(streaming: Streaming) {
        streaming.register(this)
    }
}
