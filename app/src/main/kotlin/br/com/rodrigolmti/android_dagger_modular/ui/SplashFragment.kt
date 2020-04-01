package br.com.rodrigolmti.android_dagger_modular.ui

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.rodrigolmti.android_dagger_modular.R
import br.com.rodrigolmti.navigator.AuthenticationNavigator
import javax.inject.Inject

class SplashFragment : Fragment() {

    @Inject
    lateinit var authenticationNavigator: AuthenticationNavigator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context as SplashActivity).appComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        authenticationNavigator.showAuthentication()

        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_authenticationActivity)
        }, 2000L)
    }
}