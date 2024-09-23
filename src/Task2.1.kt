import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    print("Введите количество простых чисел (n): ")
    val n = readln().toInt()
    var count = 0
    var number = 2

    while (count < n) {
        if (isPrime(number)) {
            count++
            println("${count}-е число: $number")
        }
        number++
    }
}