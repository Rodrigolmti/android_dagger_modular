package br.com.rodrigolmti.injector

import android.content.Context

object CoreComponentInjector {

    fun provideCoreComponent(applicationContext: Context): CoreComponent {
        return if (applicationContext is CoreComponentProvider) {
            (applicationContext as CoreComponentProvider).coreComponent()
        } else {
            throw IllegalStateException("The application context you have passed does not implement CoreComponentProvider")
        }
    }
}