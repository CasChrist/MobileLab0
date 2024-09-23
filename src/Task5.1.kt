// Суперкласс Vehicle
open class Vehicle {
    // Свойства с инициализацией по умолчанию
    open val speed: Int = 0
    open val name: String = "Транспортное средство"

    // Метод для старта движения
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    // Метод для остановки
    open fun stop() {
        println("$name остановился")
    }
}

// Класс-наследник Boat (Лодка)
class Boat : Vehicle() {
    override val speed: Int = 30
    override val name: String = "Лодка"

    override fun start() {
        println("$name плывет со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановилась на воде")
    }
}

// Класс-наследник Plane (Самолет)
class Plane : Vehicle() {
    override val speed: Int = 900
    override val name: String = "Самолет"

    override fun start() {
        println("$name взлетает со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name приземлился и остановился")
    }
}

// Класс-наследник Tank (Танк)
class Tank : Vehicle() {
    override val speed: Int = 60
    override val name: String = "Танк"

    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился на поле боя")
    }
}

fun main() {
    // Создаем объекты транспортных средств
    val boat = Boat()
    val plane = Plane()
    val tank = Tank()

    // Демонстрация работы методов
    boat.start()
    boat.stop()

    plane.start()
    plane.stop()

    tank.start()
    tank.stop()
}
