package br.com.rodrigolmti.authentication.ui

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.rodrigolmti.authentication.R
import br.com.rodrigolmti.core_android.BaseFragment
import br.com.rodrigolmti.navigator.Actions

class AuthenticationFragment : BaseFragment() {

    private val viewModel by lazy { getViewModel(AuthenticationViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.authentication_fragment, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context as AuthenticationActivity).component.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({
            startActivity(Actions.openDashboard(requireContext()))
        }, 2000L)
    }
}