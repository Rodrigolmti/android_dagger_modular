package br.com.rodrigolmti.authentication.di

import androidx.lifecycle.ViewModel
import br.com.rodrigolmti.authentication.navigator.AppAuthenticationNavigator
import br.com.rodrigolmti.authentication.ui.AuthenticationViewModel
import br.com.rodrigolmti.core_android.di.common.ViewModelKey
import br.com.rodrigolmti.navigator.AuthenticationNavigator
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class AuthenticationViewModelModule {

    @[Binds IntoMap ViewModelKey(AuthenticationViewModel::class)]
    internal abstract fun bindAuthenticationViewModel(
        authenticationViewModel: AuthenticationViewModel
    ): ViewModel
}