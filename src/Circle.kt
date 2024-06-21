import kotlin.math.roundToInt
import kotlin.math.roundToLong

class Circle(
    val radius: Double = 1.0
) {
    init {
        println("Circle Successfully Created!")
        println("----------------------------------")
        println(String.format("%-1s %-30s %s", "|", "Values","|"))
        println("----------------------------------")
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Radius", "|", radius, "|",))
        println(String.format("%-1s %-10s %-12s %-5s %s", "|", "Area", "|", "%.3f".format(this.area()), "|",))
        println(String.format("%-1s %-10s %-12s %-5s %s", "|", "Perimeter", "|", "%.3f".format(this.area()), "|",))
        println("----------------------------------")
    }

    fun area() = radius * radius * Math.PI

    fun perimeter() = 2 * radius * Math.PI
}