class NumberArray2(private val numbers: Array<Int>) {

    // Метод, который возвращает массив с удвоенными четными и утроенными нечетными элементами
    fun transformArray(): Array<Int> {
        return numbers.map { if (it % 2 == 0) it * 2 else it * 3 }.toTypedArray()
    }

    // Метод, который возвращает максимальный элемент массива
    fun maxElement(): Int {
        return numbers.maxOrNull() ?: throw NoSuchElementException("Массив пуст")
    }

    // Метод, который возвращает минимальный элемент массива
    fun minElement(): Int {
        return numbers.minOrNull() ?: throw NoSuchElementException("Массив пуст")
    }

    // Свойство, которое возвращает сумму элементов массива
    val sumOfElements: Int
        get() = numbers.sum()
}

fun main() {
    // Создание объекта класса с массивом чисел
    val array = NumberArray2(arrayOf(1, 4, 3, 8, -2, 7))

    // Вызов методов и вывод результатов на экран
    println("Массив с удвоенными четными и утроенными нечетными элементами: ${array.transformArray().contentToString()}")
    println("Максимальный элемент массива: ${array.maxElement()}")
    println("Минимальный элемент массива: ${array.minElement()}")
    println("Сумма элементов массива: ${array.sumOfElements}")
}
