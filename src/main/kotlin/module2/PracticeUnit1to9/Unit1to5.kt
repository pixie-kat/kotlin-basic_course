package module2.PracticeUnit1to9

import kotlin.math.pow

fun main() {
//    greet("Jim")
//    displayUser("Jim", 21)
//    showMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
//    showMessage("Live long and prosper")
//    showMessage("May the force be with you")
//    printNumbers(1, 3, 5, 7, 9, 1051, 9999999)
//    concatStrings("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit,", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua.")
//    addToGroup("The Beatles","John", "Paul", "George", "Ringo")
//    println(multiply(3,5))
//    println(isEven(17))
//    printIfPositive(1)
//    println(cube(3))
//    checkAndPrint(1)
//    compare(1,-100)
//    show("yolo")
//    show(10)
//    max(1, 3)
//    max(9001, 9000)
//    println(sum(5, 3))
//    println(sum(13, 10, 2025))
}

//Unit 1. Functions and Their Parameters
//Unit 1.1 - Write a function called greet that takes a name (String) as a parameter and prints "Hello, [name]!".
//possible val greet("Jim")
fun greet(name: String) {
    println("Hello, $name")
}

//Unit 1.2 - Write a function called displayUser that takes two parameters: a name (String) and an age (Int), and prints "Name: [name], Age: [age]".
//possible usage: displayUser("Jim", 21)
fun displayUser(name: String, age: Int) {
    println("Name: [$name], Age: [$age]")
}

//Unit 1.3 - Write a function called showMessage that takes a message (String) and prints it. Try calling it with different messages.
// possible message to use: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." or "Live long and prosper" or "May the force be with you"
//not done!
fun showMessage(message: String) {
    println(message)
}

//Unit 2. Vararg Parameters
//Unit 2.1 - Write a function called printNumbers that takes a variable number of integers and prints each one on a new line.
fun printNumbers(vararg number: Int) {
    for (n in number) {
        println(n)
    }
}

//Unit 2.2 - Write a function called concatStrings that takes a variable number of strings and prints them as a single line separated by spaces.
//possible string to use: concatStrings("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit,", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua.")
fun concatStrings(vararg Strings: String) {
    for (s in Strings) {
        print(s.plus(" "))
    }
}

//Unit 2.3 - Write a function called addToGroup that takes a group name (String), any number of user names (String), and prints the group name and all users.
//groupName = "The Beatles", userNames = "John", "Paul", "George", "Ringo")
fun addToGroup(groupName: String, vararg userNames: String) {
    println("Group: $groupName")
    for (user in userNames) {
        println("Users: $user")
    }
}


/*
Unit 3. Returning Results

Write a function called multiply that takes two Int parameters and returns their product.
Write a function called isEven that takes an Int and returns true if the number is even, false otherwise.
Write a function called printIfPositive that takes an Int and prints the number only if it is positive (use return to exit early).
*/
fun multiply(x: Int, y: Int): Int {
    return x * y
}

fun isEven(x: Int): Boolean {
    if (x % 2 == 0) {
        return true
    }
    return false
}

//how programmers would actually do it :D
//fun isEvenShorter(x: Int): Boolean {
//    return x % 2 == 0
//}

fun printIfPositive(x: Int) {
    if (x <= 0){
        return
    }
    println(x)
}

/*
Unit 4. Single-Expression and Local Functions

Write a single-expression function called cube that returns the cube of a given Int.
Write a function called checkAndPrint that takes an Int, defines a local function isValid to check if the number is positive, and prints "Valid" or "Invalid".
Write a function compare that takes two Ints and a local function that returns true if both are less than 10. Print "Both less than 10" or "Not both less than 10".
*/
fun cube(x: Int): Int {
    return x * x * x
}

fun checkAndPrint(x: Int) {
    fun isValid(): Boolean {
      return x > 0
    }
    when {
        isValid() == true -> println ("Valid")
        isValid() == false -> println("Invalid")
    }
}

fun compare(x: Int, y: Int) {
    fun isLessThan10(): Boolean {
        return x < 10 && y < 10
    }
    when {
        isLessThan10() == true -> println("Both less than 10")
        isLessThan10() == false -> println("Not both less than 10")
    }
}

/*
Unit 5. Function Overloading

Write two functions with the same name show — one that takes a String and prints it, another that takes an Int and prints it.
Write two functions called max: one that takes two Ints and returns the larger, another that takes two Doubles and returns the larger.
Write two functions named sum: one that takes two Ints, and one that takes three Ints, and both return the sum.
 */
fun show(x: String) {
    println(x)
}
fun show(y: Int) {
    println(y)
}

fun max(x: Int, y: Int) {
    if (x > y) {
        println(x)
    }
    else if (y > x){
        println(y)
    }
}

fun sum(x: Int, y:Int) = x + y
fun sum(x: Int, y: Int, z: Int) = x + y + z