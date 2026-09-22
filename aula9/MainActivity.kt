package com.example.aula9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula9.ui.theme.Aula9Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula9Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RandomFlag(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//@Composable
//fun HomeScreen(modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula9Theme {
        RandomFlag()
    }
}