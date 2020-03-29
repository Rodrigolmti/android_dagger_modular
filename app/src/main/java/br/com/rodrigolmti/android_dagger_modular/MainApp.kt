package br.com.rodrigolmti.android_dagger_modular

import android.app.Application
import br.com.rodrigolmti.android_dagger_modular.di.AppComponent
import br.com.rodrigolmti.android_dagger_modular.di.DaggerAppComponent
import br.com.rodrigolmti.android_dagger_modular.features.FeaturesComponent
import br.com.rodrigolmti.authentication.di.AuthenticationSubComponent

class MainApp : Application(), FeaturesComponent {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().application(this).build()
    }

    fun getComponent(): AppComponent = component

    override fun providesAuthenticationComponent(): AuthenticationSubComponent =
        component.authenticationSubComponent()
}