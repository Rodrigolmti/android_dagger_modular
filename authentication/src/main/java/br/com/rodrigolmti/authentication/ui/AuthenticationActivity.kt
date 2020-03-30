package br.com.rodrigolmti.authentication.ui

import android.os.Bundle
import br.com.rodrigolmti.authentication.R
import br.com.rodrigolmti.authentication.di.AuthenticationComponentProvider
import br.com.rodrigolmti.authentication.di.AuthenticationSubComponent
import br.com.rodrigolmti.core_android.BaseActivity
import javax.inject.Provider

typealias AuthenticationProvider = Provider<AuthenticationSubComponent>

class AuthenticationActivity : BaseActivity<AuthenticationSubComponent>(),
    AuthenticationProvider {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentication_activity)
        component =
            (applicationContext as AuthenticationComponentProvider).providesAuthenticationComponent()
    }

    override fun get(): AuthenticationSubComponent = component
}