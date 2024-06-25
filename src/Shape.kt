abstract class Shape(
    var name: String = "Shape"
) {

    constructor(name: String, vararg dimensions: Double) : this(name)

    init {
        println("Shape is this class's Superclass")
    }

    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName: String = "Shape Name") {
        name = newName
    }
}