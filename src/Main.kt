fun main() {

    val resultado1 = ejercicio1(n1 = 7, n2 = 7, n3 = 2)
    println(resultado1)

    val resultado2 = ejercicio2(cliente = false, precio0 = 300.0)
    println(resultado2)

    val resultado3 = ejercicio3(materia = "Historia", nota = 65.3)
    println(resultado3)
}

fun ejercicio1(n1: Int, n2: Int, n3: Int): String {
    if (n1 == n2 && n2 == n3) {
        return "Los tres numeros son iguales: $n1"
    } else if (n1 == n2 && n1 > n3) {
        return "Empate entre $n1 y $n2"
    } else if (n1 == n3 && n1 > n2) {
        return "Empate entre $n1 y $n3"
    } else if (n2 == n3 && n3 > n1) {
        return "Empate entre $n2 y $n3"
    } else if (n1 > n2 && n1 > n3) {
        return "El mayor es: $n1"
    } else if (n2 > n1 && n2 > n3) {
        return "El mayor es: $n2"
    } else {
        return "El mayor es: $n3"
    }
}

fun ejercicio2(cliente: Boolean, precio0: Double): String {
    var porcentaje = 0

    if (cliente) {
        if (precio0 >= 500.0) {
            porcentaje = 25
        } else if (precio0 >= 200.0) {
            porcentaje = 15
        } else if (precio0 >= 50.0) {
            porcentaje = 10
        } else {
            porcentaje = 5
        }
    } else {
        if (precio0 >= 500.0) {
            porcentaje = 15
        } else if (precio0 >= 200.0) {
            porcentaje = 10
        } else {
            porcentaje = 0
        }
    }

    val descuento = (precio0 * porcentaje) / 100
    val precio1 = precio0 - descuento

    return "Monto original:$precio0  Descuento: $porcentaje  Total a pagar:$precio1"
}

fun ejercicio3(nota: Double, materia: String): String {
    if (nota > 100.0) {
        return "Error: nota invalida ($nota)"
    } else if (nota >= 90.0) {
        return "Curso: $materia  Nota: $nota A Excelente"
    } else if (nota >= 80.0) {
        return "Curso: $materia  Nota: $nota B Notable"
    } else if (nota >= 70.0) {
        return "Curso: $materia  Nota: $nota C Aprobado"
    } else if (nota >= 60.0) {
        return "Curso: $materia  Nota: $nota D Aprobado minimo"
    } else {
        return "Curso: $materia  Nota: $nota F Reprobado"
    }
}