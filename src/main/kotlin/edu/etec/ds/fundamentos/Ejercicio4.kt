package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    return if (numero > 0) {
        "Positivo"
    } else {
        "No positivo"
    }
}

fun clasificarNumero(numero: Int): String {
    if (numero > 10) {
        return "Mayor a 10"
    } else if (numero < 10) {
        return "Menor a 10"
    } else {
        return "Igual a 10"
    }
}

fun evaluarEdad(edad: Int): String {
    TODO("Menor de edad: < 18, Adulto: 18-65, Adulto mayor: > 65")
    if (edad < 18) {
        return "Menor de edad"
    } else if (edad > 18 && edad < 65) {
        return "Adulto"
    } else if (edad > 65) {
        return "Adulto mayor"
    }
}

fun obtenerDescuento(monto: Double): Double {
    TODO("Retornar descuento: 10% si monto >= 100, 20% si >= 150, 30% si >= 200, sino 0%")
    if (monto >= 100) {
        return 0.10
    } else if (monto >= 150) {
        return 0.20
    } else if (monto >= 200) {
        return 0.30
    } else {
        return 0.00
    }
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    TODO("Realizar operacion: + - * /. Retornar 0.0 si division por cero u operador invalido")
    if (operador == '+') {
        return (a+b).toDouble()
    } else if (operador == '-') {
        return (a-b).toDouble()
    } else if (operador == '*') {
        return (a*b).toDouble()
    } else if (operador == '/') {
        if (b == 0) {
            return 0.0
        } else {
            return a.toDouble() / b
        }
    } else {
        return 0.0
    }
}
