package br.com.rodrigolmti.android_dagger_modular.features.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.android_dagger_modular.MainApp
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.android_dagger_modular.features.di.AuthenticationSubComponent
import javax.inject.Provider

typealias AuthenticationProvider = Provider<AuthenticationSubComponent>

class AuthenticationActivity : AppCompatActivity(), AuthenticationProvider {

    private lateinit var component: AuthenticationSubComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentication_activity)
        if (savedInstanceState == null) {
            component = (applicationContext as MainApp).getComponent().authenticationSubComponent()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AuthenticationFragment.newInstance())
                .commitNow()
        }
    }

    override fun get(): AuthenticationSubComponent = component
}