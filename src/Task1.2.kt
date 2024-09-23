fun main() {
    var count = 0
    var sum = 0.0

    while (true) {
        println("Введите число (0 для завершения):")
        val input = readln().toDouble()

        if (input == 0.0) {
            break
        }

        count++
        sum += input
    }

    if (count > 0) {
        val average = sum / count
        println("Количество введенных чисел: $count")
        println("Общая сумма: $sum")
        println("Среднее арифметическое: $average")
    } else {
        println("Ни одно число не было введено.")
    }
}