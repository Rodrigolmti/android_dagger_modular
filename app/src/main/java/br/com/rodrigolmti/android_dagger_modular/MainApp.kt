package br.com.rodrigolmti.android_dagger_modular

import android.app.Application
import br.com.rodrigolmti.android_dagger_modular.di.AppComponent
import br.com.rodrigolmti.android_dagger_modular.di.DaggerAppComponent

class MainApp : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }

    fun getComponent(): AppComponent = component
}