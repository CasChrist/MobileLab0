import kotlin.math.sqrt

// Функция для возврата квадрата числа
fun sqr(n: Double): Double {
    return n * n
}

// Функция для вычисления дискриминанта
fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}

// Функция для определения количества корней уравнения
fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

// Функция для нахождения и вывода корней квадратного уравнения
fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    val roots = rootsNumber(a, b, c)
    when {
        roots == 2 -> {
            val root1 = (-b + sqrt(d)) / (2 * a)
            val root2 = (-b - sqrt(d)) / (2 * a)
            println("Уравнение имеет два корня: $root1 и $root2")
        }
        roots == 1 -> {
            val root = -b / (2 * a)
            println("Уравнение имеет один корень: $root")
        }
        else -> {
            println("Уравнение не имеет действительных корней")
        }
    }
}

fun main() {
    val a = 1.0
    val b = -3.0
    val c = 2.0

    quadraticRoot(a, b, c)
}
