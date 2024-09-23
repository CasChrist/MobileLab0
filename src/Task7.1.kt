class Car(var name: String, var speed: Int)

data class Vehicle2(var name: String, var speed: Int)

fun main() {
    // Создаем объекты Car
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)

    // Сравниваем объекты car1 и car2
    println("car1 == car2: ${car1 == car2}")   // Сравнение по значениям (не сработает для обычного класса)
    println("car1 === car2: ${car1 === car2}") // Сравнение по ссылке

    // Выводим hashCode объектов car1 и car2
    println("hashCode car1: ${car1.hashCode()}")
    println("hashCode car2: ${car2.hashCode()}")

    // Создаем объект car3 как ссылку на car1
    val car3 = car1
    println("car1 == car3: ${car1 == car3}")   // Сравнение по значениям (true)
    println("car1 === car3: ${car1 === car3}") // Сравнение по ссылке (true)

    // Выводим hashCode объектов car1 и car3
    println("hashCode car1: ${car1.hashCode()}")
    println("hashCode car3: ${car3.hashCode()}")

    // Изменяем поле name в объекте car3
    car3.name = "Belaz"
    println("car1 name: ${car1.name}")   // Свойство изменится, так как car1 и car3 указывают на один объект
    println("car3 name: ${car3.name}")

    // Создаем объекты Vehicle
    val vehicle1 = Vehicle2("Ural", 100)
    val vehicle2 = Vehicle2("Ural", 100)

    // Сравниваем объекты vehicle1 и vehicle2
    println("vehicle1 == vehicle2: ${vehicle1 == vehicle2}")   // true, сравнение по значениям
    println("vehicle1 === vehicle2: ${vehicle1 === vehicle2}") // false, сравнение по ссылке

    // Выводим hashCode объектов vehicle1 и vehicle2
    println("hashCode vehicle1: ${vehicle1.hashCode()}")
    println("hashCode vehicle2: ${vehicle2.hashCode()}")

    // Копирование объектов
    val vehicle3 = vehicle1.copy(name = "ZIL")
    val vehicle4 = vehicle1.copy()

    // Сравнение vehicle3 и vehicle1
    println("vehicle3 == vehicle1: ${vehicle3 == vehicle1}")   // false, разные name
    println("vehicle3 === vehicle1: ${vehicle3 === vehicle1}") // false, разные объекты

    // Сравнение vehicle4 и vehicle1
    println("vehicle4 == vehicle1: ${vehicle4 == vehicle1}")   // true, одинаковые поля
    println("vehicle4 === vehicle1: ${vehicle4 === vehicle1}") // false, разные объекты
}
