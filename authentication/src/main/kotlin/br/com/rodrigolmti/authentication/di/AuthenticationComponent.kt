package br.com.rodrigolmti.authentication.di

import br.com.rodrigolmti.authentication.ui.AuthenticationActivity
import br.com.rodrigolmti.authentication.ui.AuthenticationFragment
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.ViewModelFactoryModule
import br.com.rodrigolmti.injector.coreComponent
import dagger.Component

@AuthenticationScope
@Component(
    modules = [ViewModelFactoryModule::class, AuthenticationViewModelModule::class],
    dependencies = [CoreComponent::class]
)
interface AuthenticationComponent {

    fun inject(fragment: AuthenticationFragment)

    @Component.Builder
    interface Builder {

        fun build(): AuthenticationComponent

        fun coreComponent(component: CoreComponent): Builder
    }
}

object Injector {

    @JvmStatic
    fun inject(activity: AuthenticationActivity): AuthenticationComponent =
        DaggerAuthenticationComponent.builder()
            .coreComponent(activity.coreComponent())
            .build()
}