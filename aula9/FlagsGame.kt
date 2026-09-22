package com.example.aula9

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun RandomFlag(modifier: Modifier = Modifier) {

    val images = listOf(
        R.drawable.cabo_verde,
        R.drawable.tunisia,
        R.drawable.escocia
    )

    var resultGame by remember { mutableStateOf<Boolean?>(null) }

    var idDisplayedImage by remember {
        mutableStateOf(images.random())
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "✨ Adivinhe qual é a bandeira: ✨"
        )

        Image(
            painter = painterResource(idDisplayedImage),
            contentDescription = "Imagem de uma bandeira",
            modifier = Modifier
                .size(300.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                idDisplayedImage = images.random()
                resultGame = null
            }
        ) {
            Text("Sortear 🔄️")
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {
                    resultGame = idDisplayedImage == images[0]
                }
            ) {
                Text("Cabo Verde")
            }

            Button(
                onClick = {
                    resultGame = idDisplayedImage == images[1]
                }
            ) {
                Text("Tunísia")
            }

            Button(
                onClick = {
                    resultGame = idDisplayedImage == images[2]
                }
            ) {
                Text("Escócia")
            }
        }

        when (resultGame) {
            true -> Text("🎉 Você ACERTOU!!")
            false -> Text("❌ Você errou, tente novamente")
            null -> Text("Escolha uma opção!")
        }
    }
}