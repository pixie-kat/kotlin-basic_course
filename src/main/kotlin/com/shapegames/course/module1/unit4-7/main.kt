package org.example.com.shapegames.course.module1.`unit4-7`

fun main() {
 task1IF()
}
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