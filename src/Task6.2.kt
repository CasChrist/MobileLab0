// Интерфейс Figure
interface Figure1 {
    fun area(): Double
    fun perimeter(): Double
}

// Класс Square (Квадрат)
class Square1(private val side: Double) : Figure1 {
    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

// Класс Circle (Окружность)
class Circle1(private val radius: Double) : Figure1 {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

// Класс Triangle (Треугольник)
class Triangle1(private val a: Double, private val b: Double, private val c: Double) : Figure1 {
    override fun area(): Double {
        val s = (a + b + c) / 2  // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))  // Формула Герона
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}

fun main() {
    // Создание объектов классов фигур
    val square = Square1(5.0)
    val circle = Circle1(3.0)
    val triangle = Triangle1(3.0, 4.0, 5.0)

    // Вывод результатов для каждой фигуры
    println("Квадрат: площадь = ${square.area()}, периметр = ${square.perimeter()}")
    println("Окружность: площадь = ${circle.area()}, периметр = ${circle.perimeter()}")
    println("Треугольник: площадь = ${triangle.area()}, периметр = ${triangle.perimeter()}")
}
