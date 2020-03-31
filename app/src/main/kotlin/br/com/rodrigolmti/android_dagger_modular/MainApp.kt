package br.com.rodrigolmti.android_dagger_modular

import android.app.Application
import br.com.rodrigolmti.android_dagger_modular.di.AppComponent
import br.com.rodrigolmti.android_dagger_modular.di.DaggerAppComponent
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.CoreComponentProvider
import br.com.rodrigolmti.injector.DaggerCoreComponent

class MainApp : Application(), CoreComponentProvider {

    private val component: AppComponent by lazy {
        DaggerAppComponent.builder().application(this).build()
    }

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.builder().build()
    }

    override fun coreComponent(): CoreComponent = coreComponent

    fun appComponent(): AppComponent = component
}