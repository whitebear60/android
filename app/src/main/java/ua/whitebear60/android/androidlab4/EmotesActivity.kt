package ua.whitebear60.android.androidlab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import ua.whitebear60.android.androidlab4.databinding.ActivityEmotesBinding

class EmotesActivity : ComponentActivity() {
    private lateinit var binding: ActivityEmotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmotesBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        val view = binding.root
        setContentView(view)
    }
}