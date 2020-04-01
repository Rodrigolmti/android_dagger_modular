package br.com.rodrigolmti.android_dagger_modular.di

import android.app.Application
import br.com.rodrigolmti.android_dagger_modular.di.modules.AppModule
import br.com.rodrigolmti.android_dagger_modular.di.modules.AppNavigatorsModule
import br.com.rodrigolmti.android_dagger_modular.ui.SplashFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class, AppNavigatorsModule::class]
)
interface AppComponent {

    fun inject(fragment: SplashFragment)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}