package br.com.rodrigolmti.injector

import android.app.Activity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CoreModule::class]
)
interface CoreComponent

interface CoreComponentProvider {
    fun coreComponent(): CoreComponent
}

object Injector {

    @JvmStatic
    fun inject(): CoreComponent = DaggerCoreComponent.builder().build()
}

fun Activity.coreComponent() = (this.applicationContext as CoreComponentProvider).coreComponent()
