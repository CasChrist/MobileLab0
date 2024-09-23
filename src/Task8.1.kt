fun main() {
    // Ввод двух чисел и знака операции
    print("Введите первое число: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return
    print("Введите второе число: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return
    print("Введите знак операции (+, -, *, /): ")
    val operation = readLine()

    // Выполнение операции
    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Деление на 0 невозможно"
        else -> "Неверный знак операции"
    }

    // Вывод результата
    println("Результат: $result")
}
