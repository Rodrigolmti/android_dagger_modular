package br.com.rodrigolmti.android_dagger_modular.features.di

import br.com.rodrigolmti.android_dagger_modular.features.ui.AuthenticationFragment
import dagger.Subcomponent

@AuthenticationScope
@Subcomponent(modules = [AuthenticationViewModelModule::class])
interface AuthenticationSubComponent {

    fun inject(fragment: AuthenticationFragment)
}