package br.com.rodrigolmti.android_dagger_modular

import android.app.Application
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.CoreComponentProvider

class MainApp : Application(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()
        coreComponent = CoreComponent.inject()
    }

    override fun coreComponent(): CoreComponent = coreComponent
}