package com.miwas.yapraktikum8cohort4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.miwas.yapraktikum8cohort4.uikit.UiKitButton

class MainActivity(dsflkdsmklfmdskfdsmlkmfs: Boolean) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<UiKitButton>(R.id.button).setOnClickListener {
            Toast.makeText(this@MainActivity, "Меня нажали!", Toast.LENGTH_LONG).show()
        }
    }
}