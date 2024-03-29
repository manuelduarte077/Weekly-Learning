/*: * Functions
 */

fun aFunction() {
    print("I'm a function")
}

fun aFunctionReturning(): String {
    return "I'm a function"
}

fun aFunctionReturning2(): String = "I'm a function"

// Arguments
fun sum(a: Int, b: Int): Int {
    return a + b
}

// How do you call sum?
sum(4, 1)

/*: * Extension functions
    You can add functions to any Type! Careful OOP extremists!
*/
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

4.isEven()

/*: * Lambda functions, Type is (arguments) -> ReturnType
   if no return is expected, we use Unit
 */


val myFunction: (Int, Boolean) -> Unit = { int, isReady ->
    print(isReady, int)
}


// implicit `it` argument when there is only one argument
// you can still name it if you want to
val greet: (String) -> String
greet = {
    return "Hello $it"
}

val myCalc: (Int, Int) -> Int = a, b -> a+b


