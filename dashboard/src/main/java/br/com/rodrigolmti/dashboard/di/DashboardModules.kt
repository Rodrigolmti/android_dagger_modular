package br.com.rodrigolmti.dashboard.di

import androidx.lifecycle.ViewModel
import br.com.rodrigolmti.dashboard.ui.home.HomeViewModel
import br.com.rodrigolmti.injector.common.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class DashboardViewModelModule {

    @[Binds IntoMap ViewModelKey(HomeViewModel::class)]
    internal abstract fun bindHomeViewModel(
        viewModel: HomeViewModel
    ): ViewModel
}