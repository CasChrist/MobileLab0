fun main() {
    // 1. Выделить все отрицательные элементы в новый список, используя функцию filter{}
    val numbers = listOf(1, -5, 7, -10, 4, -3, 8)
    val negativeNumbers = numbers.filter { it < 0 }
    println("Отрицательные числа: $negativeNumbers")

    // 2. Изменить знак для всех положительных элементов списка
    val changedNumbers = numbers.map { if (it > 0) -it else it }
    println("Список с измененными положительными элементами: $changedNumbers")

    // 3. Сформировать новый список их квадратов, используя функцию map{}
    val squaredNumbers = numbers.map { it * it }
    println("Список квадратов чисел: $squaredNumbers")

    // 4. Список из чисел 1..7, вывести как "=1+2+3+4+5+6+7="
    val intRange = (1..7).toList()
    val formattedString = intRange.joinToString(separator = "+", prefix = "=", postfix = "=")
    println("Список чисел в формате: $formattedString")

    // 5. Фильтрация phoneBook по коду страны countryCode
    val phoneBook = mapOf("John" to "+1234567890", "Jane" to "+1987654321", "Alice" to "+1239876543")
    val countryCode = "+123"
    val filteredPhoneBook = phoneBook.filter { it.value.startsWith(countryCode) }
    println("Фильтрованные записи phoneBook: $filteredPhoneBook")

    // 6. Ввод числа в диапазоне 0..100 и вывод числа прописью
    print("Введите число от 0 до 100: ")
    val numberInput = readlnOrNull()?.toIntOrNull() ?: return
    val numberInWords = convertNumberToWords(numberInput)
    println("Число прописью: $numberInWords")

    // 7. Разобрать строку времени и рассчитать количество секунд с начала дня
    val timeString = "01:20:12"
    val totalSeconds = calculateSeconds(timeString)
    println("Количество секунд с начала дня: $totalSeconds")
}

// Функция для конвертации числа в диапазоне 0..100 в пропись
fun convertNumberToWords(number: Int): String {
    val units = listOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val teens = listOf("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
    val tens = listOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")

    return when (number) {
        in 0..9 -> units[number]
        in 10..19 -> teens[number - 10]
        in 20..99 -> {
            val tenPart = tens[number / 10]
            val unitPart = if (number % 10 != 0) units[number % 10] else ""
            "$tenPart $unitPart".trim()
        }
        100 -> "сто"
        else -> "некорректное число"
    }
}

// Функция для расчета количества секунд с начала дня из строки "hh:mm:ss"
fun calculateSeconds(time: String): Int {
    val timeParts = time.split(":").map { it.toInt() }
    val (hours, minutes, seconds) = timeParts
    return hours * 3600 + minutes * 60 + seconds
}
