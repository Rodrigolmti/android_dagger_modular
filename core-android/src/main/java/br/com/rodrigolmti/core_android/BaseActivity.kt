package br.com.rodrigolmti.core_android

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<C : Any> : AppCompatActivity() {

    protected lateinit var component: C
}