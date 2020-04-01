package br.com.rodrigolmti.authentication.di

import br.com.rodrigolmti.authentication.ui.AuthenticationFragment
import br.com.rodrigolmti.core_android.di.ApplicationProvider
import br.com.rodrigolmti.injector.ViewModelFactoryModule
import dagger.Component

@AuthenticationScope
@Component(
    modules = [ViewModelFactoryModule::class, AuthenticationViewModelModule::class],
    dependencies = [ApplicationProvider::class]
)
interface AuthenticationComponent {

    fun inject(fragment: AuthenticationFragment)
}