package br.com.rodrigolmti.authentication.ui

import android.os.Bundle
import br.com.rodrigolmti.authentication.R
import br.com.rodrigolmti.authentication.di.AuthenticationComponent
import br.com.rodrigolmti.authentication.di.DaggerAuthenticationComponent
import br.com.rodrigolmti.core_android.BaseActivity
import br.com.rodrigolmti.injector.CoreComponentInjector

class AuthenticationActivity : BaseActivity() {

    val component: AuthenticationComponent by lazy {
        DaggerAuthenticationComponent.builder()
            .coreComponent(CoreComponentInjector.provideCoreComponent(applicationContext))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentication_activity)

    }
}