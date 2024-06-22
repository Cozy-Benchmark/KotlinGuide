import kotlin.math.roundToInt
import kotlin.math.roundToLong

class Circle(
    private val radius: Double = 1.0
) : Shape("Circle") {
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

    fun area() = radius * radius * Math.PI

    fun perimeter() = 2 * radius * Math.PI
}