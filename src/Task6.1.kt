// Абстрактный класс Figure
abstract class Figure {
    // Абстрактные методы для вычисления площади и периметра
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

// Класс Square (Квадрат)
class Square(private val side: Double) : Figure() {
    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

// Класс Circle (Окружность)
class Circle(private val radius: Double) : Figure() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

// Класс Triangle (Треугольник)
class Triangle(private val a: Double, private val b: Double, private val c: Double) : Figure() {
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
    val square = Square(5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    // Вывод результатов для каждой фигуры
    println("Квадрат: площадь = ${square.area()}, периметр = ${square.perimeter()}")
    println("Окружность: площадь = ${circle.area()}, периметр = ${circle.perimeter()}")
    println("Треугольник: площадь = ${triangle.area()}, периметр = ${triangle.perimeter()}")
}
