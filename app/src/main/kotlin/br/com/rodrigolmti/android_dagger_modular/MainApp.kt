package br.com.rodrigolmti.android_dagger_modular

import android.app.Application
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.CoreComponentProvider
import br.com.rodrigolmti.injector.Injector

class MainApp : Application(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()
        coreComponent = Injector.inject()
    }

    override fun coreComponent(): CoreComponent = coreComponent
}