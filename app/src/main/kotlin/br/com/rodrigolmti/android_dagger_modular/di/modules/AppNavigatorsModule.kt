package br.com.rodrigolmti.android_dagger_modular.di.modules

import br.com.rodrigolmti.authentication.navigator.AppAuthenticationNavigator
import br.com.rodrigolmti.navigator.AuthenticationNavigator
import dagger.Binds
import dagger.Module

@Module
internal abstract class AppNavigatorsModule {

    @[Binds]
    internal abstract fun bindAuthenticationNavigator(
        appAuthenticationNavigator: AppAuthenticationNavigator
    ): AuthenticationNavigator
}