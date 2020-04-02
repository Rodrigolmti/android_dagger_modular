package br.com.rodrigolmti.authentication.ui

import android.os.Bundle
import br.com.rodrigolmti.authentication.R
import br.com.rodrigolmti.authentication.di.AuthenticationComponent
import br.com.rodrigolmti.authentication.di.Injector
import br.com.rodrigolmti.core_android.BaseActivity

class AuthenticationActivity : BaseActivity() {

    val component: AuthenticationComponent by lazy { Injector.inject(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentication_activity)
    }
}