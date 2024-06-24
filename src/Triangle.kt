import kotlin.math.sqrt
import kotlin.random.Random

class Triangle(
    val sideA: Double = 1.0,
    val sideB: Double = 1.0,
    val sideC: Double = 1.0
) : Shape("Triangle") {

    constructor(sideA: Double) : this(sideA, sideA, sideA)

    constructor(sideA: Double, sideB: Double) : this(sideA, sideB, sideA + sideB)

    constructor(sideA: Int) : this(sideA.toDouble(), sideA.toDouble(), sideA.toDouble())

    constructor(sideA : Int, sideB: Int) : this(sideA.toDouble(), sideB.toDouble(), sideA.toDouble() + sideB.toDouble())

    constructor(sideA: Int, sideB: Int, sideC: Int) : this(sideA.toDouble(), sideB.toDouble(), sideC.toDouble())

    companion object {
        fun randomTriangle() : Triangle {
            val sideA = Random.nextDouble(1.0, 10.0)
            val sideB = Random.nextDouble(1.0, 10.0)
            val sideC = Random.nextDouble(1.0, 10.0)
            val randomizer = Random.nextInt(1, 10)
            return if (randomizer % 2 == 0){
                Triangle(sideA)
            } else if (randomizer % 3 == 0){
                Triangle(sideA, sideB)
            } else {
                Triangle(sideA, sideB, sideC)
            }
        }
    }

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
