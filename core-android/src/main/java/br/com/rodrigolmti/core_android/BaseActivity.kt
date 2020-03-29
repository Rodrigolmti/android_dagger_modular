package br.com.rodrigolmti.core_android

import android.app.Activity
import javax.inject.Provider

abstract class BaseActivity<C : Any> : Activity() {

    protected lateinit var component: C
}