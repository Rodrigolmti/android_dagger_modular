package br.com.rodrigolmti.feature_demo

import android.app.Application
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.CoreComponentProvider

class DemoFeatureApp : Application(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()
        coreComponent = CoreComponent.inject()
    }

    override fun coreComponent(): CoreComponent = coreComponent
}