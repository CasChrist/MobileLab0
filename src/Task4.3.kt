import kotlin.math.sqrt

class Vector(private val x: Double, private val y: Double, private val z: Double) {

    // Метод для вычисления длины вектора
    fun length(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    // Метод для вычисления скалярного произведения двух векторов
    fun dotProduct(other: Vector): Double {
        return this.x * other.x + this.y * other.y + this.z * other.z
    }

    // Добавление инфиксной записи для скалярного произведения
    infix fun dot(other: Vector): Double {
        return this.dotProduct(other)
    }

    // Перегрузка оператора * для скалярного произведения
    operator fun times(other: Vector): Double {
        return this.dotProduct(other)
    }
}

// Вне класса создаем функцию для скалярного произведения двух векторов
fun dotProduct(v1: Vector, v2: Vector): Double {
    return v1 * v2
}

fun main() {
    val vector1 = Vector(1.0, 2.0, 3.0)
    val vector2 = Vector(3.0, 2.0, 1.0)

    // Вычисление длины вектора
    println("Длина вектора vector1: ${vector1.length()}")

    // Использование метода dotProduct
    println("Скалярное произведение (через метод): ${vector1.dotProduct(vector2)}")

    // Использование инфиксной записи
    println("Скалярное произведение (инфиксная запись): ${vector1 dot vector2}")

    // Использование оператора * для скалярного произведения
    println("Скалярное произведение (через оператор *): ${vector1 * vector2}")

    // Использование внешней функции для скалярного произведения
    println("Скалярное произведение (через внешнюю функцию): ${dotProduct(vector1, vector2)}")
}
