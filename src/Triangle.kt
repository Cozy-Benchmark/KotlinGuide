import kotlin.math.sqrt

class Triangle(
    val sideA: Double = 1.0,
    val sideB: Double = 1.0,
    val sideC: Double = 1.0
) : Shape("Triangle") {
    init {
        println("$name Successfully Created!")
        println("----------------------------------")
        println(String.format("%-1s %-30s %s", "|", "Values","|"))
        println("----------------------------------")
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Side A", "|", sideA, "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Side B", "|", sideB, "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Side C", "|", sideC, "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Area", "|", "%.3f".format(this.area()), "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Perimeter", "|", this.perimeter(), "|",))
        println("----------------------------------")
    }

    override fun area() : Double {
        val semiPerimeter = (sideA + sideB + sideC) / 2

        val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
        return area
    }

    override fun perimeter() : Double = sideA + sideB + sideC
}