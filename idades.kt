package com.example.exemplo2idades

fun main() {

    println("Digite a idade")
    var idade: Int? = readlnOrNull()?.toIntOrNull() ?:0

    if (idade in 0..120){
        println("Idade: $idade")
    }
    else{

        println("Idade Inválida")
    }

}