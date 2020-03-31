package br.com.rodrigolmti.authentication.di

import androidx.lifecycle.ViewModel
import br.com.rodrigolmti.authentication.ui.AuthenticationViewModel
import br.com.rodrigolmti.injector.common.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthenticationViewModelModule {

    @[Binds IntoMap ViewModelKey(AuthenticationViewModel::class)]
    internal abstract fun bindAuthenticationViewModel(
        authenticationViewModel: AuthenticationViewModel
    ): ViewModel
}