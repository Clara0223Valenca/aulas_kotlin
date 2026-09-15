package com.example.aula8

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula8.ui.theme.Aula8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula8Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SimpleNavbar(

                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun SimpleNavbar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        val context = LocalContext.current

        // Botão 1
        Text(
            text = "Botão 1",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(8.dp)
                .border(
                    width = 2.dp,
                    color = Color(200,200,250)
                )

                .clickable {
                    Toast.makeText(context, "Clicou no Botão 1!", Toast.LENGTH_SHORT).show()
                }
                .padding(horizontal = 24.dp, vertical = 12.dp) // Padding interno do botão
        )

        // Botão 2
        Text(
            text = "Botão 2",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(8.dp)
                .border(
                    width = 2.dp,
                    color = Color.Green,
                )
                .clickable {
                    Toast.makeText(context, "Clicou no Botão 2!", Toast.LENGTH_SHORT).show()
                }
                .padding(horizontal = 24.dp, vertical = 12.dp)
        )

        // Botão 3
        Text(
            text = "Botão 3",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(8.dp)
                .border(
                    width = 2.dp,
                    color = Color.Red,
                )
                .clickable {
                    Toast.makeText(context, "Clicou no Botão 3!", Toast.LENGTH_SHORT).show()
                }
                .padding(horizontal = 24.dp, vertical = 12.dp)
        )
    }
}

@Composable
fun TextAndBorder(modifier: Modifier = Modifier, number: String){

    Text(
        text = "Botão ",

    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula8Theme {
        SimpleNavbar()
    }
}