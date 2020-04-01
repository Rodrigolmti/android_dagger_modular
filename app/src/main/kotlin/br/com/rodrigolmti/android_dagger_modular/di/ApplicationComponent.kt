package br.com.rodrigolmti.android_dagger_modular.di

import br.com.rodrigolmti.android_dagger_modular.MainApp
import br.com.rodrigolmti.android_dagger_modular.di.modules.AppModule
import br.com.rodrigolmti.android_dagger_modular.di.modules.AppNavigatorsModule
import br.com.rodrigolmti.android_dagger_modular.ui.SplashFragment
import br.com.rodrigolmti.core_android.di.ApplicationProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class, AppNavigatorsModule::class]
)
interface ApplicationComponent : ApplicationProvider {

    fun inject(fragment: SplashFragment)

    fun inject(app: MainApp)
}