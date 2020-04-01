package br.com.rodrigolmti.dashboard.di

import br.com.rodrigolmti.core_android.di.ApplicationProvider
import br.com.rodrigolmti.dashboard.ui.home.HomeFragment
import br.com.rodrigolmti.injector.ViewModelFactoryModule
import dagger.Component

@DashboardScope
@Component(
    modules = [ViewModelFactoryModule::class, DashboardViewModelModule::class],
    dependencies = [ApplicationProvider::class]
)
interface DashboardComponent {

    fun inject(fragment: HomeFragment)
}