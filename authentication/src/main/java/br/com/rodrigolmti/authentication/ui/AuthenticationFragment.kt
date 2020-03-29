package br.com.rodrigolmti.authentication.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import br.com.rodrigolmti.authentication.R
import br.com.rodrigolmti.core_android.BaseFragment

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
        (context as AuthenticationProvider).get().inject(this)
    }

    companion object {
        fun newInstance() =
            AuthenticationFragment()
    }
}