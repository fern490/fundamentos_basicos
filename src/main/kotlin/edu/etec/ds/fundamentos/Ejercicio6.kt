package edu.etec.ds.fundamentos

fun obtenerDiaSemana(dia: Int): String {
    return when (dia) {
        1-> "Lunes"
        2-> "Martes"
        3-> "Miercoles"
        4-> "Jueves"
        5-> "Viernes"
        6-> "Sabado"
        7-> "Domingo"
        else -> "Día inválido"
    }
}

fun obtenerNombreMes(mes: Int): String {
    return when (mes) {
        1-> "Enero"
        2-> "Febrero"
        3-> "Marzo"
        4-> "Abril"
        5-> "Mayo"
        6-> "Junio"
        7-> "Julio"
        8-> "Agosto"
        9-> "Septiembre"
        10-> "Octubre"
        11-> "Noviembre"
        12-> "Diciembre"
        else -> "Mes Inválido"
    }
}

fun clasificarNumeroWhen(numero: Int): String {
    TODO("Usar when para clasificar: Positivo, Negativo o Cero")
}

fun clasificarEdad(edad: Int): String {
    TODO("Usar when con rangos: Bebe (<3), Nino (3-12), Adolescente (13-17), Adulto (18-65), Anciano (>65)")
}

fun convertirMoneda(moneda: String, monto: Double): Double {
    TODO("Convertir: USD a MXN (1.85), EUR a MXN (18), JPY a MXN (0.10), otro retorna 0")
}

fun realizarOperacion(operador: Char, a: Int, b: Int): Double {
    TODO("Usar when para realizar + - * / %. Division por cero retorna 0.0")
}

fun obtenerDescuentoWhen(monto: Double): Double {
    TODO("Usar when como expresion: >200 -> 25%, >150 -> 15%, >100 -> 10%, else 0%")
}

fun obtenerCalificacion(nota: Int): String {
    TODO("Usar when con rangos: >=90 Promocionado, >=60 Aprobado, else Desaprobado")
}

fun esVocal(caracter: Char): Boolean {
    TODO("Usar when para verificar si es vocal (a, e, i, o, u mayusculas y minusculas)")
}

fun esPrimo(numero: Int): Boolean {
    TODO("Usar when para determinar si un numero es primo (mayor a 1 divisible solo por 1 y si mismo)")
}
