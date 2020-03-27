package br.com.rodrigolmti.android_dagger_modular.features.di

import androidx.lifecycle.ViewModel
import br.com.rodrigolmti.core_android.di.common.ViewModelKey
import br.com.rodrigolmti.android_dagger_modular.features.ui.AuthenticationViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthenticationViewModelModule {

    @[Binds IntoMap br.com.rodrigolmti.core_android.di.common.ViewModelKey(AuthenticationViewModel::class)]
    internal abstract fun bindAuthenticationViewModel(
        authenticationViewModel: AuthenticationViewModel
    ): ViewModel
}