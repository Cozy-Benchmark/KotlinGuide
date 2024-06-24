import kotlin.math.roundToInt
import kotlin.math.roundToLong
import kotlin.random.Random

class Circle(
    val radius: Double = 1.0
) : Shape("Circle") {

    constructor(radius: Int) : this(radius.toDouble())

    companion object {
        fun randomCircle() : Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init {
        println("$name Successfully Created!")
        println("----------------------------------")
        println(String.format("%-1s %-30s %s", "|", "Values","|"))
        println("----------------------------------")
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Radius", "|", radius, "|",))
        println(String.format("%-1s %-10s %-12s %-5s %s", "|", "Area", "|", "%.3f".format(this.area()), "|",))
        println(String.format("%-1s %-10s %-12s %-5s %s", "|", "Perimeter", "|", "%.3f".format(this.perimeter()), "|",))
        println("----------------------------------")
    }

    override fun area() : Double = radius * radius * ImportantNumbers.PI

    override fun perimeter() : Double = 2 * radius * ImportantNumbers.PI
}