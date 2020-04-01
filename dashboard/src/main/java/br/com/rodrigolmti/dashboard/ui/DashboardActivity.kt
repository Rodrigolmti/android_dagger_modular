package br.com.rodrigolmti.dashboard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.dashboard.R
import br.com.rodrigolmti.dashboard.di.DaggerDashboardComponent
import br.com.rodrigolmti.dashboard.di.DashboardComponent
import br.com.rodrigolmti.injector.CoreComponentInjector

class DashboardActivity : AppCompatActivity() {

    val component: DashboardComponent by lazy {
        DaggerDashboardComponent.builder()
            .coreComponent(CoreComponentInjector.provideCoreComponent(applicationContext))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_activity)
    }
}