import kotlin.math.pow

fun main() {
    val line: String = "--------------------------------------------------------------------------"
    val variable: String = "Variable"

//  Printing
    println(line)
    println("Hello World")
    println(line)

//  Variables
    val characterValue: Char = 'A'       // Character
    val stringValue: String = "String"   // String
    val booleanVale: Boolean = false     // Boolean
    val integerValue: Int = 0            // Integer
    val doubleValue: Double = 0.0        // Double
    val byteValue: Byte = 0              // Byte
    val shortValue: Short = 0            // Short
    val longValue: Long = 0              // Long
    val floatValue: Float = 0F           // Float

//  Max Values for Integer Data Types
    val maxIntegerValue: Int = Int.MAX_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE
    val maxShortValue: Short = Short.MAX_VALUE
    val maxLongValue: Long = Long.MAX_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

//  Min Values for Integer Fata Types
    val minIntegerValue: Int = Int.MIN_VALUE
    val minDoubleValue: Double = Double.MIN_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    val minFloatValue: Float = Float.MIN_VALUE

//  ARITHMETIC OPERATIONS
//    Values
//    Integer (Computation with Integer Numbers)
//    val x = 3 // val x: Int = 3
//    val y = 4 // val y: Int = 4
//    val z = 5 // val z: Int = 5
//    Float (Computation with Float Numbers)
//    val x: Float = 3F
//    val y: Float = 4F
//    val z: Float = 5F
//    Decimal (Computation with Double Numbers)
    val x: Double = 3.0
    val y: Double = 4.0
    val z: Double = 5.0

//    Operate to themselves
//       x += x
//       x -= x
//       x *= x
//       x /= 1

    val sumResultOf2 = x + y
    val differenceResultOf2 = x - y
    val productResultOf2 = x * y
    val quotientResultOf2 = x / y
    val sumResultOf3 = sumResultOf2 + z
    val differenceResultOf3 = differenceResultOf2 - z
    val productResultOf3 = productResultOf2 * z
    val quotientResultOf3 = quotientResultOf2 / z
    val areaResult = Math.PI * 0.75 * x.pow(3.0)


    println(line)
    println("NOTES:")
    println(line)
    println("Val is constant.")
    println("Var is modifiable.")
    println(line)
    println(line)
    println("VARIABLES:")
    println(line)
    println(String.format("%-25s %s","Char", characterValue))
    println(String.format("%-25s %s","String", stringValue))
    println(String.format("%-25s %s","Boolean", booleanVale))
    println(String.format("%-25s %,d","Integer", integerValue))
    println(String.format("%-25s %.2f","Double", doubleValue))
    println(String.format("%-25s %d","Byte", byteValue))
    println(String.format("%-25s %d","Short", shortValue))
    println(String.format("%-25s %d","Long", longValue))
    println(String.format("%-25s %.2f","Float", floatValue))
    println(line)
    println("Max and Min Values for Integer Types:")
    println(line)
    println(String.format("%-25s %-25s %s","Data Type", "Min", "Max"))
    println(String.format("%-25s %-25d %,d","Integer", minIntegerValue, maxIntegerValue))
    println(String.format("%-25s %-25.2f %.2f","Double", minDoubleValue, maxDoubleValue))
    println(String.format("%-25s %-25d %d","Byte", minByteValue, maxByteValue))
    println(String.format("%-25s %-25d %d","Short", minShortValue, maxShortValue))
    println(String.format("%-25s %-25d %d","Long", minLongValue, maxLongValue))
    println(String.format("%-25s %-25.2f %.2f","Float", minFloatValue, maxFloatValue))
    println(line)
    println(line)
    println("IN LINE CALLING OF VARIABLE: $variable")
    println(line)
    println(line)
    println("ARITHMETIC OPERATIONS:")
    println(line)
    println("Values: \n x = $x \n y = $y")
    println(line)
    println(String.format("%-35s %s","The sum of x and y is: ", sumResultOf2))
    println(String.format("%-35s %s","The difference of x and y is: ", differenceResultOf2))
    println(String.format("%-35s %s","The product of x and y is: ", productResultOf2))
    println(String.format("%-35s %s","The quotient of x and y is: ", quotientResultOf2))
    println(line)
    println(String.format("%-35s %s","The sum of x, y, and z is: ", sumResultOf3))
    println(String.format("%-35s %s","The difference of x, y, and z is: ", differenceResultOf3))
    println(String.format("%-35s %s","The product of x, y, and z is: ", productResultOf3))
    println(String.format("%-35s %s","The quotient of x, y, and z is: ", quotientResultOf3))
    println(line)
    println("Sample Computation of getting the area of a spherical object (x):")
    println(line)
    println("Formula: 0.75 * ${Math.PI} * radius (x) ^ 3")
    println(line)
    println(String.format("%-35s %s", "The area of $x is:", areaResult))
}
