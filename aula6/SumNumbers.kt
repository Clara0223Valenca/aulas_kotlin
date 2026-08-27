package com.example.aula6

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun Sum(modifier: Modifier = Modifier) {
    var contexto = LocalContext.current
    /*sempre que escrever ou pegar algo da tela, a variável é de estado mutável*/
    var typedNumber1 by remember { mutableStateOf("") }
    var typedNumber2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0.0)}

    Column(
        modifier =modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Coloque dois valores para somar: ")

        //área onde fica o primeiro valor
        TextField(
            value = typedNumber1,//valor inicial
            onValueChange = {typedNumber1 = it}//função lambda -> o que fazer quando eu altero esse valor
        )

        Text("+")

        //área onde fica o segundo valor
        TextField(
            value = typedNumber2,
            onValueChange = {typedNumber2 = it}
        )

        var Number1 = typedNumber1.toDoubleOrNull()
        var Number2 = typedNumber2.toDoubleOrNull()



        Button(
            onClick = {
                if(Number1 == null || Number2 == null){
                    Toast.makeText(contexto, "Digite um valor valido no numero 1", Toast.LENGTH_SHORT).show()
                }
                result = (Number1?:0.0) + (Number2?:0.0)
                typedNumber1 = ""
                typedNumber2 = ""
            }
        ) {
            Text("Somar")
        }
        Text(result.toString())

    }
}