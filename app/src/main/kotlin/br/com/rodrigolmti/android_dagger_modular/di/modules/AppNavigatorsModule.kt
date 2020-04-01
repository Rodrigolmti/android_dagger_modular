package br.com.rodrigolmti.android_dagger_modular.di.modules

import br.com.rodrigolmti.authentication.navigator.AppAuthenticationNavigator
import br.com.rodrigolmti.dashboard.navigator.AppDashboardNavigator
import br.com.rodrigolmti.navigator.AuthenticationNavigator
import br.com.rodrigolmti.navigator.DashboardNavigator
import dagger.Binds
import dagger.Module

@Module
internal abstract class AppNavigatorsModule {

    @[Binds]
    internal abstract fun bindAuthenticationNavigator(
        navigator: AppAuthenticationNavigator
    ): AuthenticationNavigator

    @[Binds]
    internal abstract fun bindDashboardNavigator(
        navigator: AppDashboardNavigator
    ): DashboardNavigator
}