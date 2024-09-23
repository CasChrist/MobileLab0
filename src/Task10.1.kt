fun imitationOne() {
    for (i in 1..10) {
        Thread.sleep(1000) // Приостановка потока на 1 секунду
        println("One $i")
    }
}

fun imitationTwo() {
    for (i in 1..10) {
        Thread.sleep(1000) // Приостановка потока на 1 секунду
        println("Two $i")
    }
}

fun main() {
    // Часть 1. Вызов функций последовательно
    println("Начало Main")
    imitationTwo()
    imitationOne()
    println("Конец Main")

    // Часть 2. Обернем оба вызова в один Thread
    println("\nЗапуск обоих функций в одном потоке:")
    Thread {
        imitationTwo()
        imitationOne()
    }.start()

    // Часть 3. Обернем каждый вызов в отдельный Thread
    println("\nЗапуск каждой функции в своем потоке:")
    Thread {
        imitationTwo() // Здесь оставляем 1 сек
    }.start()

    Thread {
        imitationOne() // Здесь оставляем 1 сек или можно изменить на 1,5 сек
    }.start()

    // Часть 4. Изменим время блокировки в одном из методов на 1.5 секунды
    println("\nЗапуск функций с изменением времени блокировки:")
    Thread {
        imitationTwo() // Оставляем 1 сек для imitationTwo
    }.start()

    Thread {
        for (i in 1..10) {
            Thread.sleep(1500) // Увеличиваем время паузы до 1.5 секунд
            println("One $i")
        }
    }.start()
}
