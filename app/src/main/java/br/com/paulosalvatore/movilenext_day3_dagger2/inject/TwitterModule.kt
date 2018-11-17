package br.com.paulosalvatore.movilenext_day3_dagger2.inject

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TwitterModule(private val user: String) {
    @Provides @User
    fun provideTweeter(api: TwitterApi) =
        Tweeter(api, user)

    @Provides @User
    fun provideTimeline(api: TwitterApi) =
        Timeline(api, user)
}
