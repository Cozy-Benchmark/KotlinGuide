open class Shape(
    var name: String = "Shape"
) {
    init {
        println("Shape is this class's Superclass")
    }

    fun changeName(newName: String = "Shape Name"){
        name = newName
    }
}