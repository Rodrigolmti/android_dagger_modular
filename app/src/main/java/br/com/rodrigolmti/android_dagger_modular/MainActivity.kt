package br.com.rodrigolmti.android_dagger_modular

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.navigator.AuthenticationNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var authenticationNavigator: AuthenticationNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as MainApp).getComponent().inject(this)

        authenticationNavigator.showAuthentication()
    }
}