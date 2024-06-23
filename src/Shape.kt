abstract class Shape(
    var name: String = "Shape"
) {
    init {
        println("Shape is this class's Superclass")
    }

    abstract fun area() : Double

    abstract fun perimeter() : Double

    fun changeName(newName: String = "Shape Name"){
        name = newName
    }

    fun maxArea(shape1: Shape, shape2: Shape) : Double {
        val areaShape1 = shape1.area()
        val areaShape2 = shape2.area()

        return if(areaShape1 > areaShape2) areaShape1 else areaShape2
    }
}