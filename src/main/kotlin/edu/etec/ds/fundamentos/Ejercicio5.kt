package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    if (n <= 0) {
        return 0
    } else {
        return n + sumarHasta(n-1)
    }
}

fun contarPares(inicio: Int, fin: Int): Int {
    return (inicio..fin).count()
}

fun llegueHastaElNEsimoElementoDeFibonacci(contador: Int, n: Int): Boolean {
    return contador > n
}

fun fibonacci(n: Int): Int {
    var primero = 0
    var segundo = 1
    var resultado = primero + segundo
    var contador = 2
    while (!llegueHastaElNEsimoElementoDeFibonacci(contador, n)) {
        resultado = primero + segundo
        primero = segundo
        segundo = resultado
        contador++
    }
    return resultado
    TODO("Retornar el n-esimo numero de Fibonacci")
}

fun factorial(n: Int): Int {
    var resultado = 1
    for (i in n..1) {
        resultado *= i
    }
    return resultado
}

fun encontrarMaximo(numeros: List<Int>): Int {
    TODO("Encontrar el valor maximo en la lista")
}

fun encontrarMinimo(numeros: List<Int>): Int {
    TODO("Encontrar el valor minimo en la lista")
}

fun sumarLista(numeros: List<Int>): Int {
    TODO("Sumar todos los elementos de la lista")
}

fun inverter(texto: String): String {
    TODO("Invertir la cadena de texto")
}

fun contarVocales(texto: String): Int {
    TODO("Contar las vocales en el texto (considerar mayusculas y minusculas)")
}

fun esPalindromo(texto: String): Boolean {
    TODO("Verificar si el texto es un palindromo (ignorando espacios)")
}

fun tablaMultiplicar(numero: Int): List<Int> {
    TODO("Retornar lista con la tabla de multiplicar del 1 al 10")
}
