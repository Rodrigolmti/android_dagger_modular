package br.com.rodrigolmti.dashboard.di

import br.com.rodrigolmti.dashboard.ui.home.HomeFragment
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.ViewModelFactoryModule
import dagger.Component

@DashboardScope
@Component(
    modules = [ViewModelFactoryModule::class, DashboardViewModelModule::class],
    dependencies = [CoreComponent::class]
)
interface DashboardComponent {

    fun inject(fragment: HomeFragment)
}