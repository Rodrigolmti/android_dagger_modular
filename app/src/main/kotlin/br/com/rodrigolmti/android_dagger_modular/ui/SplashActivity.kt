package br.com.rodrigolmti.android_dagger_modular.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.android_dagger_modular.di.AppComponent

class SplashActivity : AppCompatActivity() {

    val component: AppComponent by lazy { AppComponent.inject() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
    }
}