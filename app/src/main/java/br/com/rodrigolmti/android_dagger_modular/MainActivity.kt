package br.com.rodrigolmti.android_dagger_modular

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.android_dagger_modular.features.ui.AuthenticationActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, AuthenticationActivity::class.java))
    }
}