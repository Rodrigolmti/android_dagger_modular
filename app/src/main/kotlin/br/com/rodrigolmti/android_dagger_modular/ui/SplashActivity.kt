package br.com.rodrigolmti.android_dagger_modular.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.android_dagger_modular.di.AppComponent
import br.com.rodrigolmti.android_dagger_modular.di.Injector

class SplashActivity : AppCompatActivity() {

    val component: AppComponent by lazy { Injector.inject() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
    }
}