package org.example.com.shapegames.course.module1.`unit4-7`

fun main() {
    task2WHEN()
}
//IF expressions
/*Task 1 IF:
Write a program that checks if a number is positive, negative, or zero.
Print a message for each case.

val number = -3
 */
fun task1IF() {
    val number = -3
    if(number > 0) {
        println("The number $number is positive")
    }
    else if(number < 0) {
        println("The number $number is negative")
    }
    else {
        println("The number $number is zero")
    }
}

/* Task 2 IF:
Check if a number is even or odd. Print the result.

val number = 7
 */
fun task2IF() {
    val number = 4
    val isEven : Boolean = number % 2 == 0
    if(isEven){
        println("The number $number is an even number")
        }
    else{
        println("The number $number is an odd number")
    }

}
//when expressions
/*
Task 1:
Write a program that takes a variable grade (Int) from 1 to 5 and prints:

"Excellent" for 5
"Good" for 4
"Okay" for 3
"Bad" for 2
"Terrible" for 1
val grade = 4
*/

fun task1WHEN(){
    val grade = 4
    when (grade) {
        5 -> println("Excellent")
        4 -> println("Good")
        3 -> println("Okay")
        2 -> println("Bad")
        1 -> println("Terrible")
        else -> println("Grade unknown")
    }

}

/*
Task 2:
Take a variable month (Int) from 1 to 12 and print the season ("Winter", "Spring", "Summer", "Autumn").
Use when and ranges.

val month = 7
 */

fun task2WHEN(){
    val month = 7
    when (month){
        in 1 .. 3 -> println("Winter")
        in 4 ..6 -> println("Spring")
        in 7 .. 9 -> println("Summer")
        in 10 .. 12 -> println("Autumn")
    }
}