fun main() {
    val numbers = arrayOf(1, 5, 3, 8, 6, 4, 7)

    for (i in 1..<numbers.size - 1) {
        if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
            println("Элемент больше соседних: ${numbers[i]}")
        }
    }

    var i = 1
    while (i < numbers.size - 1) {
        if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
            println("Элемент больше соседних: ${numbers[i]}")
        }
        i++
    }

    numbers.forEachIndexed { index, value ->
        if (index > 0 && index < numbers.size - 1) {
            if (value > numbers[index - 1] && value > numbers[index + 1]) {
                println("Элемент больше соседних: $value")
            }
        }
    }
}
