fun main() {
    val targetNumber = (0..10).random() // Загадка компьютера
    var userGuess: Int

    println("Компьютер загадал число от 0 до 10. Попробуйте угадать!")

    do {
        print("Введите ваше число: ")
        userGuess = readln().toInt() // Чтение числа пользователя

        when {
            userGuess > targetNumber -> println("Много")
            userGuess < targetNumber -> println("Мало")
            else -> println("Угадал!")
        }
    } while (userGuess != targetNumber) // Повторяем ввод, пока не угадал
}
