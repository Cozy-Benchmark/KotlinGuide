import kotlin.math.pow
import kotlin.random.Random

fun main() {
    val line: String = "--------------------------------------------------------------------------"
//  Printing
    println(line)
    println("Hello World")
    println(line)

//  String
    val variable: String = "Variable"
    val string = "This is an example String."

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

//  Comparison Operators
    val comparatorOne = Random.nextInt(0, 100)
    val comparatorTwo = Random.nextInt(0, 100)
    val comparatorThree = Random.nextInt(0, 100)
    val comparatorFour = Random.nextInt(0, 100)

    val comparingByLessThanResult = comparatorOne < comparatorTwo
    val comparingByLessThanOrEqualResult = comparatorOne <= comparatorTwo
    val comparingByEqualResult = comparatorOne == comparatorTwo
    val comparingByNotEqualResult = comparatorOne != comparatorTwo
    val comparisonByGreaterThanResult = comparatorOne > comparatorTwo
    val comparisonByGreaterThanOrEqualResult = comparatorOne >= comparatorTwo

//  Logical Operators
//  && Both conditions are true
//  || Either one or two are true
//  ! Reverses\Negates the Boolean Value
    val comparisonWithAndResult= (comparatorOne >= comparatorTwo) && (comparatorThree <= comparatorFour)
    val comparisonWithORResult= (comparatorOne >= comparatorTwo) || (comparatorThree <= comparatorFour)
    val comparisonWithNotAndAndResult= !(comparatorOne >= comparatorTwo) && (comparatorThree <= comparatorFour)
    val comparisonWithNotAndOrResult= !(comparatorOne >= comparatorTwo) || (comparatorThree <= comparatorFour)

    println("\nNOTES:")
    println("\nVal is constant.")
    println("\nVar is modifiable.")
    println("\nLogical Operators are not evaluated Left to Right. \n Its evaluated with AND (&&) as Priority and OR (||) as Second. \n Unless wrapped in Parenthesis ()")
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
    println("IN LINE CALLING OF VARIABLE: $variable")
    println(line)
    println(line)
    println("ARITHMETIC OPERATIONS:")
    println("\nValues: \n x = $x \n y = $y\n")
    println(String.format("%-35s %s","The sum of x and y is: ", sumResultOf2))
    println(String.format("%-35s %s","The difference of x and y is: ", differenceResultOf2))
    println(String.format("%-35s %s","The product of x and y is: ", productResultOf2))
    println(String.format("%-35s %s","The quotient of x and y is: ", quotientResultOf2))
    println()
    println(String.format("%-35s %s","The sum of x, y, and z is: ", sumResultOf3))
    println(String.format("%-35s %s","The difference of x, y, and z is: ", differenceResultOf3))
    println(String.format("%-35s %s","The product of x, y, and z is: ", productResultOf3))
    println(String.format("%-35s %s","The quotient of x, y, and z is: ", quotientResultOf3))
    println("\nSample Computation of getting the area of a spherical object (x):\n")
    println("Formula: 0.75 * %{Math.PI} * radius (x) ^ 3\n")
    println(String.format("%-35s %s", "The area of $x is:", areaResult))
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
    println("\nValues to be compared: \n a = $comparatorOne \n b = $comparatorTwo \n c = $comparatorThree \n d = $comparatorFour")
    println("\nComparison Operators:")
    println(String.format("%-15s %-45s %s", "(>)", "Is A Greater Than B:", comparisonByGreaterThanResult))
    println(String.format("%-15s %-45s %s", "(>=)", "Is A Greater Than or Equal to B:", comparisonByGreaterThanOrEqualResult))
    println(String.format("%-15s %-45s %s", "(==)", "Is A Equal to B:", comparingByEqualResult))
    println(String.format("%-15s %-45s %s", "(!=)", "A Not Equal to B:", comparingByNotEqualResult))
    println(String.format("%-15s %-45s %s", "(<)", "Is A Less Than B:", comparingByLessThanResult))
    println(String.format("%-15s %-45s %s", "(<=)", "Is A Less Than or Equal to B:", comparingByLessThanOrEqualResult))
    println("\nLogical Operators:")
    println(String.format("%-15s %-45s %s", "(&&)", "Is a >= b && c <= d?", comparisonWithAndResult))
    println(String.format("%-15s %-45s %s", "(||)", "Is a >= b || c <= d?", comparisonWithORResult))
    println(String.format("%-15s %-45s %s", "(! and &&)", "Is !(a >= b) && c <= d?", comparisonWithNotAndAndResult))
    println(String.format("%-15s %-45s %s", "(! and ||)", "Is !(a >= b) || c <= d?", comparisonWithNotAndOrResult))
    println(line)

    //  IF Conditions
    val xx: Int = 5
    val yy: Int = 7
    val zz: Int = if ((x + y) > 10) 3 else 4
    val wordToCheckForPalindrome: String = "Race car".replace("\\s".toRegex(), "").lowercase()
    println("\nConditional Statements")
    println("\nIf Else Conditions - if condition is true, the appropriate lines will work. Else skipped.")
    println("\nExample:")
    println("\n1. Result will state if XX is less, equal, or greater than yy")
    println("Values \n xx = $xx \n yy = $yy")
    if (xx < yy)
        println("Result: XX is less than YY")
    else if(xx > yy)
        println("Result: XX is greater than YY")
     else
        println("Result: XX is equal to YY")

    println("\n2. Check if word is a palindrome.")
    println("Values: \n word = $wordToCheckForPalindrome \n reversed = ${wordToCheckForPalindrome.reversed()}")
    if (wordToCheckForPalindrome == wordToCheckForPalindrome.reversed())
        println("The word $wordToCheckForPalindrome is a palindrome")
    else
        println("The word $wordToCheckForPalindrome is not a palindrome")

}
