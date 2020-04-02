package br.com.rodrigolmti.authentication.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.rodrigolmti.authentication.R
import br.com.rodrigolmti.core_android.BaseFragment
import br.com.rodrigolmti.navigator.Actions
import kotlinx.android.synthetic.main.authentication_fragment.*

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonSignIn.setOnClickListener {
            startActivity(Actions.openDashboard(requireContext()))
            activity?.finish()
        }

        buttonSignUp.setOnClickListener {
            startActivity(Actions.openDashboard(requireContext()))
            activity?.finish()
        }
    }
}