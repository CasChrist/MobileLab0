fun main() {
    print("Enter a natural number: ")
    val input = readln()
    val number = input.toInt()
    val lastDigit = number % 10

    var firstDigit = number
    while (firstDigit >= 10) {
        firstDigit /= 10
    }

    val sum = firstDigit + lastDigit
    println("The sum of the first and the last digits is $sum")
}