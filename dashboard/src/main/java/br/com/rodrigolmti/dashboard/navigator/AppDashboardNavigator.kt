package br.com.rodrigolmti.dashboard.navigator

import br.com.rodrigolmti.navigator.DashboardNavigator
import javax.inject.Inject

class AppDashboardNavigator @Inject constructor() : DashboardNavigator {

    override fun showDashboard() {
        print("")
    }
}