package br.com.rodrigolmti.dashboard.di

import br.com.rodrigolmti.dashboard.ui.DashboardActivity
import br.com.rodrigolmti.dashboard.ui.home.HomeFragment
import br.com.rodrigolmti.injector.CoreComponent
import br.com.rodrigolmti.injector.ViewModelFactoryModule
import br.com.rodrigolmti.injector.coreComponent
import dagger.Component

@DashboardScope
@Component(
    modules = [ViewModelFactoryModule::class, DashboardViewModelModule::class],
    dependencies = [CoreComponent::class]
)
interface DashboardComponent {

    fun inject(fragment: HomeFragment)

    @Component.Builder
    interface Builder {

        fun build(): DashboardComponent

        fun coreComponent(component: CoreComponent): Builder
    }
}

object Injector {

    @JvmStatic
    fun inject(activity: DashboardActivity): DashboardComponent =
        DaggerDashboardComponent.builder()
            .coreComponent(activity.coreComponent())
            .build()
}