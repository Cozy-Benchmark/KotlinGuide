import kotlin.math.pow
import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    val line: String = "--------------------------------------------------------------------------"
//  Printing
    println(line)
    println("Hello User!")
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
//    val x: Double = 3.0
//    val y: Double = 4.0
//    val z: Double = 5.0

//    Operate to themselves
//       x += x
//       x -= x
//       x *= x
//       x /= 1

//    Example: Fibonacci Sequence base on input
    val list = mutableListOf<Int>() // Empty list with the type of Int
    print("Enter a number > 1: ")
    var read = readlnOrNull()?.toInt() ?: exitProcess(1)

    if (read <= 0){
        println("Wrong Input")
        exitProcess(1)
    }

    var firstNumber: Int = 0
    var secondNumber: Int = 1
    var sum: Int = 0
    while(read > 0){
        list.add(firstNumber)
        sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        read--
    }
    println("List: $list")
//    println("List: ${list.reversed()}") // Reverses a list
    exitProcess(1)

//  User Input
    println("Please input the necessary values:")
    print("w: ")
    val w: Double? = readlnOrNull()?.toDoubleOrNull()

    print("x: ")
    val x: Double? = readlnOrNull()?.toDoubleOrNull()

    print("y: ")
    val y: Double? = readlnOrNull()?.toDoubleOrNull()

    print("z: ")
    val z: Double? = readlnOrNull()?.toDoubleOrNull()


    print("Any word or phrase: ")
    val string: String? = readlnOrNull()

    if (w == null || x == null || y == null || z == null || string == null){
        exitProcess(1)
    }

//  Array
    val array = arrayOf(x, y, z)
//  List
//    val list = listOf(x, y, z)
//    val mutableList = mutableListOf(x, y ,z)
//    mutableList.add(w) // add to list (increase length and add value of w to end)
//    mutableList.remove(w) // removes the element with the same value of argument
//    mutableList.removeAt(3) // removes the index in the position of the argument
//    val arraySize = array.size
//    var i: Int = 0

//  While Loop
//    while (i < arraySize) {
//        println(array[i])
//        i++
//    }

//  For Loop
    var sumResult: Double = 0.0
    var differenceResult: Double = 0.0
    var productResult: Double = 1.0
    var quotientResult: Double = 1.0

    for (i in array){
        sumResult += i
        differenceResult -= i
        productResult *= i
        quotientResult /= i
    }

    //  val z: Int = if ((x + y) > 10) 3 else 4
    val wordToCheckForPalindrome: String = string.replace("\\s".toRegex(), "").lowercase()

    val areaResult = Math.PI * 0.75 * sumResult.pow(3.0)

//  Comparison Operators
    val comparingByLessThanResult = x < y
    val comparingByLessThanOrEqualResult = x <= y
    val comparingByEqualResult = x == y
    val comparingByNotEqualResult = x != y
    val comparisonByGreaterThanResult = x > y
    val comparisonByGreaterThanOrEqualResult = x >= y

//  Logical Operators
//  && Both conditions are true
//  || Either one or two are true
//  ! Reverses\Negates the Boolean Value
    val comparisonWithAndResult= (x >= y) && (y <= z)
    val comparisonWithORResult= (x >= y) || (y <= z)
    val comparisonWithNotAndAndResult= !(x >= y) && (y <= z)
    val comparisonWithNotAndOrResult= !(x >= y) || (y <= z)

    println("\nNOTES:")
    println("\nVal is constant.")
    println("\nVar is modifiable.")
    println("\nLogical Operators are not evaluated Left to Right. \n Its evaluated with AND (&&) as Priority and OR (||) as Second. \n Unless wrapped in Parenthesis ()")
    println("\nValues of a List are Immutable but the Values of an Array are.")
    println("\nMutable List however are mutable.")
    println(line)
    println(line)
    println("VARIABLES:\n")
    println(String.format("%-25s %s","Char", characterValue))
    println(String.format("%-25s %s","String", stringValue))
    println(String.format("%-25s %s","Boolean", booleanVale))
    println(String.format("%-25s %,d","Integer", integerValue))
    println(String.format("%-25s %.2f","Double", doubleValue))
    println(String.format("%-25s %d","Byte", byteValue))
    println(String.format("%-25s %d","Short", shortValue))
    println(String.format("%-25s %d","Long", longValue))
    println(String.format("%-25s %.2f","Float", floatValue))
    println("\nMax and Min Values for Integer Types:")
    println(String.format("%-25s %-25s %s","Data Type", "Min", "Max"))
    println(String.format("%-25s %-25d %,d","Integer", minIntegerValue, maxIntegerValue))
    println(String.format("%-25s %-25.2f %.2f","Double", minDoubleValue, maxDoubleValue))
    println(String.format("%-25s %-25d %d","Byte", minByteValue, maxByteValue))
    println(String.format("%-25s %-25d %d","Short", minShortValue, maxShortValue))
    println(String.format("%-25s %-25d %d","Long", minLongValue, maxLongValue))
    println(String.format("%-25s %-25.2f %.2f","Float", minFloatValue, maxFloatValue))
    println(line)
    println(line)
    println("IN LINE CALLING OF VARIABLE: $string")
    println(line)
    println(line)
    println("ARITHMETIC OPERATIONS:")
    println(String.format("%-35s %s","The sum of all values is: ", sumResult))
    println(String.format("%-35s %s","The difference of all values is: ", differenceResult))
    println(String.format("%-35s %s","The product of all values is: ", productResult))
    println(String.format("%-35s %s","The quotient of all values is: ", quotientResult))
    println()
    println("\nSample Computation of getting the area of a spherical object (x):\n")
    println("Formula: 0.75 * %{Math.PI} * radius (Sum of all values) ^ 3\n")
    println(String.format("%-35s %s", "The area of $sumResult is:", areaResult))
    println(line)
    println(line)
    println("STRING")
    println("\nString is: $string\n")
    println(String.format("%-35s %s","String in Upper Case: ", string.uppercase()))
    println(String.format("%-35s %s","String in Lower Case: ", string.lowercase()))
    println(String.format("%-35s %s","String in Reverse: ", string.reversed()))
    println(line)
    println(line)
    println("LOGICAL AND COMPARISON OPERATORS")
    println("\nComparison Operators:")
    println(String.format("%-15s %-45s %s", "(>)", "Is $x Greater Than $y:", comparisonByGreaterThanResult))
    println(String.format("%-15s %-45s %s", "(>=)", "Is $x Greater Than or Equal to $y:", comparisonByGreaterThanOrEqualResult))
    println(String.format("%-15s %-45s %s", "(==)", "Is $x Equal to $y:", comparingByEqualResult))
    println(String.format("%-15s %-45s %s", "(!=)", "Is $x Not Equal to $y:", comparingByNotEqualResult))
    println(String.format("%-15s %-45s %s", "(<)", "Is $x Less Than $y:", comparingByLessThanResult))
    println(String.format("%-15s %-45s %s", "(<=)", "Is $x Less Than or Equal to $y:", comparingByLessThanOrEqualResult))
    println("\nLogical Operators:")
    println(String.format("%-15s %-45s %s", "(&&)", "Is $x >= $y && $y <= $z?", comparisonWithAndResult))
    println(String.format("%-15s %-45s %s", "(||)", "Is $x >= $y || $y <= $z?", comparisonWithORResult))
    println(String.format("%-15s %-45s %s", "(! and &&)", "Is !($x >= $y) && $y <= $z?", comparisonWithNotAndAndResult))
    println(String.format("%-15s %-45s %s", "(! and ||)", "Is !($x >= $y) || $y <= $z?", comparisonWithNotAndOrResult))
    println(line)

//  IF Conditions
    println("\nConditional Statements")
//    println("\nExample:")
//    println("\n1. Result will state if $x is less, equal, or greater than $y")
//    if (x < y)
//        println("Result: $x is less than $y")
//    else if(x > y)
//        println("Result: $x is greater than $y")
//     else
//        println("Result: $x is equal to $y")

    println("\nCheck if word is a palindrome.")
    println("Values: \n word = $wordToCheckForPalindrome \n reversed = ${wordToCheckForPalindrome.reversed()}")
    if (wordToCheckForPalindrome == wordToCheckForPalindrome.reversed())
        println("The word $string is a palindrome")
    else
        println("The word $string is not a palindrome")


}
