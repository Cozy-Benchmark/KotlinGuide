import java.util.function.BiPredicate

class Rectangle(
    // Constructor - values need to create a class
    val length: Double = 1.0,
    val width: Double = 1.0
) : Shape("Rectangle"){
    // Init Block - logic to be executed when an instance is created
    //            - always executes
    init {
        println("$name Successfully Created!")
        println("----------------------------------")
        println(String.format("%-1s %-30s %s", "|", "Values","|"))
        println("----------------------------------")
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Length", "|", length, "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Width", "|", width, "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Area", "|", this.area(), "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Perimeter", "|", this.perimeter(), "|",))
        println(String.format("%-1s %-10s %-13s %-5s %s", "|", "Is Square?", "|", this.isSquare(), "|",))
        println("----------------------------------")
    }

    override fun area() : Double = length * width

    override fun perimeter() : Double = (2 * length ) + (2 * width)

    fun isSquare() : Boolean = length == width
}