fun main() {
    val words: List<String?> = listOf("hello", null, "world", "kotlin", null, "openai")

    // 1. Использование оператора if
    println("Использование if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        } else {
            println("null")
        }
    }

    // 2. Использование безопасного вызова ?
    println("\nИспользование безопасного вызова ?:")
    for (word in words) {
        println(word?.uppercase() ?: "null")
    }

    // 3. Использование функции let
    println("\nИспользование функции let:")
    for (word in words) {
        word?.let {
            println(it.uppercase())
        }
    }

    // 4. Использование Элвис-оператора ?:
    println("\nИспользование Элвис-оператора ?:")
    for (word in words) {
        println((word ?: "empty").uppercase())
    }
}
