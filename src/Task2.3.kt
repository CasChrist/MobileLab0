fun main() {
    val numbers = arrayOf(2, 5, 3, 8, 6)

    // Используя цикл for
    var productFor = 1
    var minFor = numbers[0]
    var maxFor = numbers[0]
    for (i in numbers.indices) {
        productFor *= numbers[i]
        if (numbers[i] < minFor) minFor = numbers[i]
        if (numbers[i] > maxFor) maxFor = numbers[i]
    }
    println("Произведение (for): $productFor")
    println("Min (for): $minFor, Max (for): $maxFor")

    // Используя цикл while
    var productWhile = 1
    var minWhile = numbers[0]
    var maxWhile = numbers[0]
    var i = 0
    while (i < numbers.size) {
        productWhile *= numbers[i]
        if (numbers[i] < minWhile) minWhile = numbers[i]
        if (numbers[i] > maxWhile) maxWhile = numbers[i]
        i++
    }
    println("Произведение (while): $productWhile")
    println("Min (while): $minWhile, Max (while): $maxWhile")

    // Используя функцию reduce()
    val productReduce = numbers.reduce { acc, n -> acc * n }
    println("Произведение (reduce): $productReduce")

    // Используя оператор forEach
    var productForEach = 1
    var minForEach = numbers[0]
    var maxForEach = numbers[0]
    numbers.forEach {
        productForEach *= it
        if (it < minForEach) minForEach = it
        if (it > maxForEach) maxForEach = it
    }
    println("Произведение (forEach): $productForEach")
    println("Min (forEach): $minForEach, Max (forEach): $maxForEach")

    // Используя функции min() и max()
    val minFunc = numbers.minOrNull()
    val maxFunc = numbers.maxOrNull()
    println("Min (min()): $minFunc, Max (max()): $maxFunc")
}
