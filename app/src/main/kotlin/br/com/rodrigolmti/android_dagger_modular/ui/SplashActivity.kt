package br.com.rodrigolmti.android_dagger_modular.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.android_dagger_modular.MainApp
import br.com.rodrigolmti.android_dagger_modular.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        (applicationContext as MainApp).appComponent().inject(this)
    }
}