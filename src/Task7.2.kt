// Класс Point с координатами x и y
class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "текущие координаты: x = $x, y = $y"
    }
}

// Enum класс Command с командами перемещения
enum class Command {
    UP, DOWN, LEFT, RIGHT
}

// Класс Turtle с методом move()
class Turtle {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                point.y += 1
                println("Произведено перемещение по оси X на 0, по оси Y на 1")
            }
            Command.DOWN -> {
                point.y -= 1
                println("Произведено перемещение по оси X на 0, по оси Y на -1")
            }
            Command.LEFT -> {
                point.x -= 1
                println("Произведено перемещение по оси X на -1, по оси Y на 0")
            }
            Command.RIGHT -> {
                point.x += 1
                println("Произведено перемещение по оси X на 1, по оси Y на 0")
            }
        }
    }
}

fun main() {
    val turtle = Turtle()
    val point = Point(0, 0)

    // Первоначальные координаты
    println(point.toString())

    // Несколько перемещений
    turtle.move(point, Command.UP)
    println(point.toString())

    turtle.move(point, Command.RIGHT)
    println(point.toString())

    turtle.move(point, Command.DOWN)
    println(point.toString())

    turtle.move(point, Command.LEFT)
    println(point.toString())
}
