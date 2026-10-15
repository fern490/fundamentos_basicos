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
    for (i in n downTo 1) {
        resultado *= i
    }
    return resultado
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]
    for (numero in numeros) {
        if (numero > maximo) {
            maximo = numero
        }
    }
    return maximo
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]
    for (numero in numeros) {
        if (numero < minimo) {
            minimo = numero
        }
    }
    return minimo
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}

fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    var contador = 0
    for (letra in texto.lowercase()) {
        if (letra in "aeiou") {
            contador++
        }
    }
    return contador
}

fun esPalindromo(texto: String): Boolean {
    val textoLimpio = texto.replace(" ", "").lowercase()
    return textoLimpio == textoLimpio.reversed()
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val lista = mutableListOf<Int>()
    for (i in 1..10) {
        lista.add(numero * i)
    }
    return lista
}
