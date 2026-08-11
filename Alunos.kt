package com.example.atividades

/*1. Crie um programa que peça para o usuário indicar a quantidade de alunos que uma turma
tem. Após isso ele deve pedir a nota de cada um desses alunos da turma, após ter lido a
nota de cada aluno o programa deve mostrar qual a média de notas daquela turma. */

class Alunos () {

    fun calcMedia(notas : List<Int>) : Double{
        var acumulador = 0.0
        var qntd = 0.0
        for(x in 1..notas.lastIndex) {

            acumulador += notas[x]

            qntd++

        }
        return acumulador / qntd
    }
}

fun main() {

    var a1 = Alunos()
    var listaNotas = listOf<Int>(10,7,8)
    println(a1.calcMedia(listaNotas))

}
