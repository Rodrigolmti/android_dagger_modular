package br.com.rodrigolmti.authentication.di

import br.com.rodrigolmti.authentication.ui.AuthenticationFragment
import dagger.Subcomponent

@AuthenticationScope
@Subcomponent(modules = [AuthenticationViewModelModule::class])
interface AuthenticationSubComponent {

    fun inject(fragment: AuthenticationFragment)
}