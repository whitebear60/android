package ua.whitebear60.android.androidlab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.tvImages.setOnClickListener {
            val intent = Intent(this, ImagesActivity::class.java)
            startActivity(intent)
        }
        binding.tvJokes.setOnClickListener {
            val intent = Intent(this, JokesActivity::class.java)
            startActivity(intent)
        }
        binding.tvOmens.setOnClickListener {
            val intent = Intent(this, OmensActivity::class.java)
            startActivity(intent)
        }
        binding.tvQuotes.setOnClickListener {
            val intent = Intent(this, QuotesActivity::class.java)
            startActivity(intent)
        }
        binding.tvSeaImages.setOnClickListener {
            val intent = Intent(this, SeaImagesActivity::class.java)
            startActivity(intent)
        }

        binding.tvEmotes.setOnClickListener {
            val intent = Intent(this, EmotesActivity::class.java)
            startActivity(intent)
        }

        binding.tvAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
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