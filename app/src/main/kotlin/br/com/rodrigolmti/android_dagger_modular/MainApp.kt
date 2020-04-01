package br.com.rodrigolmti.android_dagger_modular

import android.app.Application
import br.com.rodrigolmti.android_dagger_modular.di.ApplicationComponent
import br.com.rodrigolmti.android_dagger_modular.di.DaggerApplicationComponent
import br.com.rodrigolmti.core_android.di.App
import br.com.rodrigolmti.core_android.di.ApplicationProvider

class MainApp : Application(), App {

    private val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .build()
    }

    override fun applicationProvider(): ApplicationProvider = component

    fun applicationComponent(): ApplicationComponent = component
}