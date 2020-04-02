package br.com.rodrigolmti.feature_demo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rodrigolmti.feature_demo.R
import br.com.rodrigolmti.navigator.Actions
import kotlinx.android.synthetic.main.activity_feature_demo.*

class FeatureDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_demo)

        startFeatureButton.setOnClickListener {
            startActivity(Actions.openDashboard(this))
        }
    }
}