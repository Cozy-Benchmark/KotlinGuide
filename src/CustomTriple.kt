class CustomTriple<A : Any, B: Any, C: Any>(
    var first: A,
    var second: B,
    var third: C,
) {
    fun printTypes() : Unit {
        println("Type of first is ${first::class}")
        println("Type of first is ${second::class}")
        println("Type of first is ${third::class}")
    }
}