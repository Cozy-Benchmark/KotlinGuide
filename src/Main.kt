import kotlin.math.pow
import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    val line: String = "--------------------------------------------------------------------------"
    //  Printing
    println(line)
    println("Hello User!")
    println(line)

//  Classes
    val myRectangle = Rectangle(length = 4.0, width = 7.0)
    myRectangle.changeName("Bench's Rectangle")
    println("Rectangle Name: ${myRectangle.name}")
    val myCircle = Circle(5.0)
    myCircle.changeName("Bench's Circle")
    println("Circle Name: ${myCircle.name}")
    val myTriangle = Triangle(3.0,3.0,3.0)
    myTriangle.changeName("Bench's Triangle")
    println("Triangle Name: ${myTriangle.name}")
//      User Input
//    println("Please input the necessary values:")
//    print("w: ")
//    val w: Double? = readlnOrNull()?.toDoubleOrNull()
//
//    print("x: ")
//    val x: Double? = readlnOrNull()?.toDoubleOrNull()
//
//    print("y: ")
//    val y: Double? = readlnOrNull()?.toDoubleOrNull()
//
//    print("z: ")
//    val z: Double? = readlnOrNull()?.toDoubleOrNull()
//
//    print("Any word or phrase: ")
//    val string: String? = readlnOrNull()
//
//    if (w == null || x == null || y == null || z == null || string == null) exitProcess(1)

//    Functions
//    println(line)
//    guessingTheNumber()
//    println(line)
//    getThePower()
//    println(line)
//    arithmeticOperationsTutorial(x, y, z)
//    println(line)
//    stringTutorial(string)
//    println(line)
//    logicalAndComparisonOperatorstTutorial(x,y,z)
//    println(line)
//    ifElseTutorial(x,y)
//    println(line)
//    palidromChecker(string)
//    println(line)
//    whenTutorial()
//    println(line)
//    listTutorial()
//    println(line)
//    notes()
}

fun variablesTutorial(string: String = "") : Unit {
    println("\nVARIABLES:\n")

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
    println("IN LINE CALLING OF VARIABLE: $string")
}

fun arithmeticOperationsTutorial(x: Double = 1.0, y: Double = 1.0, z: Double = 1.0 ) : Unit{
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

    val array = arrayOf(x, y, z)

    println("\nARITHMETIC OPERATIONS:")
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

    val areaResult = Math.PI * 0.75 * sumResult.pow(3.0)
    println(String.format("%-35s %s","The sum of all values is: ", sumResult))
    println(String.format("%-35s %s","The difference of all values is: ", differenceResult))
    println(String.format("%-35s %s","The product of all values is: ", productResult))
    println(String.format("%-35s %s","The quotient of all values is: ", quotientResult))
    println()
    println("\nSample Computation of getting the area of a spherical object (x):\n")
    println("Formula: 0.75 * %{Math.PI} * radius (Sum of all values) ^ 3\n")
    println(String.format("%-35s %s", "The area of $sumResult is:", areaResult))
}

fun stringTutorial(string: String) : Unit {
    println("\nSTRING")
    println("\nString is: $string\n")
    println(String.format("%-35s %s","String in Upper Case: ", string.uppercase()))
    println(String.format("%-35s %s","String in Lower Case: ", string.lowercase()))
    println(String.format("%-35s %s","String in Reverse: ", string.reversed()))
}

fun logicalAndComparisonOperatorstTutorial(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0) : Unit {
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

    println("\nLOGICAL AND COMPARISON OPERATORS")
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
}

fun ifElseTutorial(x: Double = 0.0, y: Double = 0.0) : Unit {
    println("\nIf Else Conditional Statements")
    println("\nExample:")
    println("\n1. Result will state if $x is less, equal, or greater than $y")
    if (x < y)
        println("Result: $x is less than $y")
    else if(x > y)
        println("Result: $x is greater than $y")
     else
        println("Result: $x is equal to $y")
}

fun palidromChecker(string: String = "Orginal") : Unit {
    val wordToCheckForPalindrome: String = string.replace("\\s".toRegex(), "").lowercase()
    println("\nCheck if word is a palindrome.")
    println("Values: \n word = $wordToCheckForPalindrome \n reversed = ${wordToCheckForPalindrome.reversed()}")
    if (wordToCheckForPalindrome == wordToCheckForPalindrome.reversed())
        println("The word $string is a palindrome")
    else
        println("The word $string is not a palindrome")
}

fun whenTutorial() : Unit {
    //    Example: When
    println("\nMessage base on age.")
    print("Age: ")
    val age = readlnOrNull()?.toInt() ?: exitProcess(1)
    when(age){
        in 0..12 -> println("You're a child.")
        in 13..19 -> println("You're a teenager.")
        20 -> {
            println("You're in your adulating phase.")
            println("Get Good!")
        }
        21,22,23 -> println("You're Lost in life.")
        in 24..65 -> println("You're an adult.")
        else -> println("You're old.")
    }
}

fun listTutorial() : Unit{
    //  List
    //    val list = listOf(x, y, z)
    //    val mutableList = mutableListOf(x, y ,z)
    //    mutableList.add(w) // add to list (increase length and add value of w to end)
    //    mutableList.remove(w) // removes the element with the same value of argument
    //    mutableList.removeAt(3) // removes the index in the position of the argument
    //    val arraySize = array.size
    //    var i: Int = 0

    //    Example: Fibonacci Sequence base on input
    println("\nGet the Fibonacci Sequence base on user input.")
    val list = mutableListOf<Int>() // Empty list with the type of Int
    print("Enter a number > 1: ")
    var read = readlnOrNull()?.toInt() ?: exitProcess(1)

    if (read <= 0){
        println("Wrong Input")
        exitProcess(1)
    }

    var firstNumber: Int = 0
    var secondNumber: Int = 1
    while(read > 0){
        list.add(firstNumber)
        var sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        read--
    }
    println("List: $list")
    //    println("List: ${list.reversed()}") // Reverses a list
}

fun getThePower() : Unit{
    println("\nGet the power of a unit")
    print("Base: ")
    var base = readlnOrNull()?.toInt()
    print("Exponent: ")
    var exp = readlnOrNull()?.toInt()
    if (base == null || exp == null) exitProcess(1)
    var printPowerOfBase = returnFunctionTutorial(base,exp)
    println("The result of 3 to the power of 5 is $printPowerOfBase")
}

fun returnFunctionTutorial(base: Int = 0, exponent: Int = 1) : Int {
    var result: Int = 1
    for (i in 1..exponent) result *= base
    return result
}

fun guessingTheNumber() : Unit{
    println("\nGuessing Game.")
    var list = mutableListOf<Int>()
    print("Input the size of the list:")
    var length = readlnOrNull()?.toInt()
    if(length != null){
        while (length > 0){
            var randomNumber = Random.nextInt(0,10)
            list.add(randomNumber)
            length--
        }

        print("Guess a number from 0 to 20: ")
        var guessedNumber = readlnOrNull()?.toInt()
        if (guessedNumber != null){
            var searchedNumber = searchForNumberTutorialExercise(list, guessedNumber)

            println("--------------------------------")
            println("The list contained: $list")
            println("Guessed Number: $guessedNumber")
            println("Searched Number: ${if (searchedNumber == -1) "None" else searchedNumber}")
            println("Sum of the List: ${list.sum()}")
            println("Product of the List: ${list.product()}")
            println("--------------------------------")

            if(guessedNumber.isPrime()){
                println("$guessedNumber is a Prime Number")
            } else {
                println("$guessedNumber is not a Prime Number")
            }
        }
    }
}

fun paramaterUsingVargarg(vararg list: Int){

}


fun searchForNumberTutorialExercise(list: List<Int>, searchee: Int = 0) : Int {
    var searched = -1

    for (i in list.indices){
        if(searchee == list[i]){
            searched = list[i]
            println("------------------------------")
            println("You have guessed correctly!")
            println("------------------------------")
            break
        }
    }

    if (searched == -1) {
        println("------------------------------")
        println("Better Luck Next Time!")
        println("------------------------------")
    }

    return searched
}

fun Int.isPrime(): Boolean {
    for(i in 2 until this -1){
        if(this % i == 0){
            return false
        }
    }
    return true
}

fun List<Int>.sum(): Int {
    var sum: Int = 0
    for (i in this.indices){
        sum += this[i]
    }
    return sum
}

fun List<Int>.product(): Int {
    var product: Int = 1
    for (i in this.indices){
        product *= this[i]
    }
    return product
}

fun notes(): Unit{
    println("\nNOTES:")
    println("\n1. Val is constant.")
    println("\n2. Var is modifiable.")
    println("\n3. Logical Operators are not evaluated Left to Right. \n Its evaluated with AND (&&) as Priority and OR (||) as Second. \n Unless wrapped in Parenthesis ()")
    println("\n4.Values of a List are Immutable but the Values of an Array are. \n Mutable List however are mutable")
}