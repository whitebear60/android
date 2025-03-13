package ua.whitebear60.android.androidlab4

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.color.MaterialColors
import ua.whitebear60.android.androidlab4.databinding.ActivityMainBinding
import ua.whitebear60.android.androidlab4.ui.theme.AndroidLab4Theme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        val view = binding.root
        setContentView(view)
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        binding.tvNewGame.setOnClickListener {
            view.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.purple_700))
        }
        binding.tvAbout.setOnClickListener {
            view.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.purple_500))
        }
        binding.tvOptions.setOnClickListener {
            view.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.teal_200))
        }
        binding.tvContinue.setOnClickListener {
            view.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.teal_700))
        }





        /*setContent {
            AndroidLab4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }*/
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidLab4Theme {
        Greeting("Android")
    }
}