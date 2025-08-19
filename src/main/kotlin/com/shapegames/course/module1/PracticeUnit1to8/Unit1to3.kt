package org.example.com.shapegames.course.module1.unit1

fun main() {
    task1()
}
/*
Assignment 1: Immutable Variable (val)
Task:
Create a variable called daysInWeek with the value 7. Don't write the type — let Kotlin figure it out.
*/
fun task1() {
    val daysInWeek = 7
    println("There are $daysInWeek days in a week.")
    println("The type of the variable daysInWeek is ${daysInWeek::class.simpleName}")
}

/*
Assignment 2: Mutable Variable (var)
Task:
Make a variable called userScore with a starting value of 0. Add 10 to it and print the result.
*/

fun task2() {
    var userScore: Int = 0
    userScore += 10
    println(userScore)
}

/*
Assignment 3: Arithmetic Operators
Task:
Create width and height variables. Find the area of a rectangle.
*/
fun task3() {
    val width = 3;
    val height = 6;
    val area = width * height
    println("The area of a rectangle is width x height. In this example it is $area")
}

/*
Assignment 4: Explicit Type Declaration
Task:
Make a variable pi with type Double and value 3.14159.
*/
fun task4() {
    val pi: Double = 3.14159;
    println(pi)
}

/*
Assignment 5: Single-Line Comment
Task:
Add a comment explaining a variable that stores a user's name.
*/

//Here we ask the user to enter their username and in the next step it gets saved as a variable.
//In the print line we print the user input out
fun task5() {
    println("Please enter your username")
    val userName = readln()
    println("$userName is the user's name")
}

/*
Assignment 6: Remainder Operator (%)
Task:
Check if the number 25 is even, and store the result in isEven.
*/
fun task6() {
    val number = 25
    val isEven : Boolean = number % 2 == 0
    println(isEven)
}

/*
Assignment 7: Template Strings
Task:
Combine firstName and lastName into one variable called fullName.
*/
fun task7() {
    val firstName: String = "Kathrin"
    val lastName: String = "Knudsen"
    val fullName: String = "My full name is $firstName $lastName"
    println(fullName)
}

/*
Assignment 8: val Reassignment Error
Task:
Why does this code not compile? Fix it and explain in a comment.

// Original code with error
fun main() {
    val balance = 100
    balance = 120 // Error here
    println(balance)
}
*/
//val cannot be reassigned. one way to fix it is to use a var instead, as that can get "overwritten"
fun task8() {
    var balance = 100
    balance = 120
    println(balance)
}
//Another option would be to create another new val with the old balance + the added value
//fun main(){
//    val balance = 100;
//    val newBalance = balance + 20
//    println(newBalance)
//}

/*
Assignment 9: Comparison Operators
Task:
Check if myAge is enough to meet requiredAge.
*/
fun task9(){
    val requiredAge = 21
    println("What is your age?")
    val myAge = readln()
    val isAgeGreater = myAge.toInt() >= requiredAge
    if (isAgeGreater) println("You are older than the required Age")
    else println("You are not old enough!")
}

/*
Assignment 10: Multi-line Comment
Task:
Describe the logic of code that calculates a price with a discount.
*/

/*
I would start with assigning a val to the price
val price = 10
And then decide what the discount value should be
val discount = 0.2
and then calculate the new price, as it is as a discount we need to substract it from 1. Taxes would be added to 1
val newPrice = price * (1 - discount)
And to have it also visible we print it out
println(newPrice)
 */
fun task10() {
    val price = 10
    val discount = 0.2
    val newPrice = price * (1 - discount)
    println(newPrice)
}

/*
Assignment 11: Choosing the Right Data Type
Task:
Store whether a user is active. Pick the best type and assign true.
*/
fun task11() {
    val isUserActive : Boolean = true
    println(isUserActive)
}

/*
Assignment 12: Expression in a Template String
Task:
Print a message about the temperature. If it's over 20, say "It is warm", otherwise say "It is cold".
*/
fun task12() {
    println("What is the temperature at the moment?")
    val temp = readln()
    println(if(temp.toInt() > 20)("It is warm")else("It is cold"))
}

/*
Assignment 13: Combination of Operators
Task:
Count apples in baskets and some extra apples.
*/
fun task13() {
    println("How many apples are in the basket?")
    val applesInBasket = readln().toInt()
    println("There are ${applesInBasket} apples in the basket")
    println("Do you want more apples? y/n")
    val moreApples = readln()
    if (moreApples == "y")  {
        println ("How many more apples do you want?")
        val furtherApples = readln().toInt()
        println("There are in total ${applesInBasket + furtherApples} apples")
    }
    else println("There are in total $applesInBasket apples")
}

/*
Assignment 14: Logical && (AND) Operator
Task:
See if the door can be opened: you need both a key and the password.
*/
fun task14() {
    println("Do you have the key? y/n")
    val key = readln()
    if (key == "n")println("You do not have the key, please come back when you found it.")
    else {
        println("What is the password?")
        val password = readln()
        if (key == "y" && password == "password") {
            println("You have the key and know the password, the door can be opened")
        }
        else println("You do not know the password, please come back when you know it.")
    }
}

/*
Assignment 15: Increment Operator
Task:
Increase messageCount by 1 and print the result.
 */
fun task15() {
    var messageCount = 1
    println(++messageCount)
}

