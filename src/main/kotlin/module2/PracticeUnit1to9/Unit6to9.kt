package module2.PracticeUnit1to9

fun main() {
//task 6.1
//    val greeting:() -> Unit = ::greet
//    greeting()

//task 6.2
//    val operation: (Int, Int) -> Int = ::multiply2
//    println(operation(4, 5))

//task 6.3
//    var mathematics: (Int, Int) -> Int = ::multiply2
//    println(mathematics(1,2))
//
//    mathematics = ::substract2
//    println(mathematics(1,2))

//task 7.1
//    operate(3,3, ::add2)
//    operate(3, 3, ::substract2)
//    operate(3, 3, ::multiply2)

//task 7.2
    chooseGreeting(true)
}



//Unit 6 - Function Type
//Task 6.1: Create a function called greet that prints "Hello!" and assign it to a variable. Call the function using the variable.
fun greet(): Unit {
    println("Hello")
}

//Task 6.2: Define a function called multiply that takes two Int parameters and returns their product. Assign it to a variable of function type and call it with values 4 and 5.
fun multiply2(x: Int, y: Int): Int {
    return x * y
}

//Task 6.3: Write a function called subtract that takes two Int parameters and returns their difference. Create a variable that can hold either multiply or subtract, and switch between them. Show the result for both operations.
fun substract2(x: Int, y: Int): Int {
    return x - y
}

//Unit 7 - High Order Functions
//Task 7.1: Write a function called operate that takes two Int numbers and a function as parameters. The function parameter should take two Ints and return an Int. Use operate to add, subtract, and multiply numbers.
fun operate(x: Int, y: Int, function:(Int, Int) -> Int) {
    println(function(x, y))
}

fun add2(x: Int, y: Int): Int {
    return x + y
}

//Task 7.2: Create a function called chooseGreeting that returns a function. If you pass in true, it should return a function that prints "Good Morning". If you pass in false, it should return a function that prints "Good Night". Show how to call the returned function.)
fun chooseGreeting(message: Boolean) {
    if (message == true) {
        println("Good Morning")
        return
    }
    println("Good Night")
}


//Task 7.3: Write a function called repeatAction that takes a function with no parameters and repeats it 3 times.



//Unit 8 - Anonymous Functions
//Task 8.1: Create an anonymous function that adds two Int numbers. Assign it to a variable and call it with 7 and 3.

//Task 8.2: Pass an anonymous function to a function called doMath that multiplies two numbers. doMath should take two Ints and a function, and return the result.

//Task 8.3: Write a function called getAnonymous that returns an anonymous function which subtracts one number from another.



//Unit 9 - Lambda Expressions
//Task 9.1: Create a lambda that prints "Hello from Lambda!" and call it.

//Task 9.2: Write a lambda that takes a String and prints it in upper case. Call the lambda with the word "kotlin".

//Task 9.3: Write a function called applyOperation that takes two Ints and a lambda, and returns the result. Use this function to add, subtract, and multiply numbers with different lambdas.
