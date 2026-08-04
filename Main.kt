package com.example.exemploterminal

fun main() {

    println("Olá mundo")

    println("Digite o primeiro número")

    for(x in 0..9 ){

        var num1 : Int?  = readlnOrNull()?.toIntOrNull() ?: 0
        println("Digite o segundo número")
        var num2: Int? = readlnOrNull()?.toIntOrNull() ?:0

        var soma = num1!!+num2!!
        println("A soma dos números é : $soma")

    }
}