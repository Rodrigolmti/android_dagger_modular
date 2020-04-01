package br.com.rodrigolmti.android_dagger_modular.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.android_dagger_modular.MainApp
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.android_dagger_modular.di.ApplicationComponent

class SplashActivity : AppCompatActivity() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        applicationComponent = (applicationContext as MainApp).applicationComponent()
    }
}