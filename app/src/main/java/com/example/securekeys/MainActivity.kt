package com.example.securekeys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.securekeys.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = "${BuildConfig.APPLICATION_ID} \n-- ${Secrets.getServerUrl(packageName)} \n-- ${Secrets.getAppName(packageName)} \n-- ${Secrets.getApiKey(packageName)}"
    }
}