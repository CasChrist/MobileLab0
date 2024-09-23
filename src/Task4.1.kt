class NumberArray1(private val numbers: Array<Int>) {

    // Метод для вычисления суммы положительных элементов
    fun sumOfPositiveElements(): Int {
        return numbers.filter { it > 0 }.sum()
    }

    // Метод для вычисления произведения всех элементов массива
    fun productOfElements(): Int {
        return numbers.fold(1) { acc, num -> acc * num }
    }

    // Метод для вычисления среднего арифметического значения элементов массива
    fun averageOfElements(): Double {
        return numbers.average()
    }
}

fun main() {
    // Создание объекта класса с массивом чисел
    val array = NumberArray1(arrayOf(1, -5, 3, 8, -2, 4))

    // Вызов методов и вывод результатов на экран
    println("Сумма положительных элементов: ${array.sumOfPositiveElements()}")
    println("Произведение элементов массива: ${array.productOfElements()}")
    println("Среднее арифметическое элементов массива: ${array.averageOfElements()}")
}
