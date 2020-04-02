package br.com.rodrigolmti.android_dagger_modular.di

import br.com.rodrigolmti.android_dagger_modular.di.modules.AppModule
import br.com.rodrigolmti.android_dagger_modular.ui.SplashFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class]
)
interface AppComponent {

    fun inject(fragment: SplashFragment)
}

object Injector {

    @JvmStatic
    fun inject(): AppComponent = DaggerAppComponent.builder().build()
}