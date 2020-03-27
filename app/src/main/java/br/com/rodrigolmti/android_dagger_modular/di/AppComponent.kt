package br.com.rodrigolmti.android_dagger_modular.di

import br.com.rodrigolmti.android_dagger_modular.di.modules.AppModule
import br.com.rodrigolmti.android_dagger_modular.features.di.AuthenticationSubComponent
import br.com.rodrigolmti.android_dagger_modular.features.di.AuthenticationViewModelModule
import br.com.rodrigolmti.android_dagger_modular.features.ui.AuthenticationFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun authenticationSubComponent(): AuthenticationSubComponent
}