package br.com.rodrigolmti.android_dagger_modular.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.android_dagger_modular.MainApp
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.android_dagger_modular.di.AppComponent

class SplashActivity : AppCompatActivity() {

    lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        appComponent = (applicationContext as MainApp).appComponent()
    }
}