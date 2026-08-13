package com.example.atividades

/*2. Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada
de N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N*/

fun main() {

    //Declarar variáveis, coloca o tipo ou atribui um valor para indicar o tipo
    //var x:Int
    //var y =0
    //Não mode mudar o tipo depois

    var num : Int? = null

    println("Digite um número de 1 a 10 para visualizar a tabuada")
    num = readLine()?.toIntOrNull() ?: 0

    for (x in 0..10){

        print("$x x $num = ${x*num}")
        println()
    }

}

