package br.com.rodrigolmti.android_dagger_modular.di.modules

import androidx.lifecycle.ViewModelProvider
import br.com.rodrigolmti.core_android.di.common.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    internal abstract fun bindViewModelFactory(
        viewModel: ViewModelProviderFactory
    ): ViewModelProvider.Factory
}