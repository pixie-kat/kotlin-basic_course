package org.example.com.shapegames.course.module1.`unit4-7`

fun main() {
    task1If()
}

//IF expressions
/*Task 1 IF:
Write a program that checks if a number is positive, negative, or zero.
Print a message for each case.

val number = -3
 */
fun task1If() {
    val number = -3
    if (number > 0) {
        println("The number $number is positive")
    } else if (number < 0) {
        println("The number $number is negative")
    } else {
        println("The number $number is zero")
    }
}

/* Task 2 IF:
Check if a number is even or odd. Print the result.

val number = 7
 */
fun task2If() {
    val number = 4
    val isEven: Boolean = number % 2 == 0
    if (isEven) {
        println("The number $number is an even number")
    } else {
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

fun task1When() {
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

fun task2When() {
    val month = 7
    when (month) {
        in 1..3 -> println("Winter")
        in 4..6 -> println("Spring")
        in 7..9 -> println("Summer")
        in 10..12 -> println("Autumn")
    }
}

//Loops and for loops
/*Task 1:
Print all numbers from 1 to 10 using a for loop.
*/
fun task1Loop() {
    for (i in 1..10) {
        print("$i \t")
    }
}

/*
Task 2:
Print the multiplication table for 5 (from 1 to 10), like:

5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

fun task2Loop() {
    val number = 5
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}

//Ranges
/*Task 1:
Print all even numbers from 2 to 20 using a range and a loop.
*/
fun task1Range() {
    for (number in 1..20) {
        val isEven = number % 2 == 0
        if (isEven) {
            print("$number \t")
        }
    }
}

/*
Task 2:
Print numbers from 10 down to 1 using a reversed range.
 */
fun task2Range() {
    val range = 10 downTo 1
    for (number in range)
        print("$number \t")
}

//Arrays
/*
Task 1:
Create an array of names ("Tom", "Sam", "Bob").
Print each name on a new line using a loop.
*/

fun task1Array() {
    val names = arrayOf("Tom", "Sam", "Bob")
    for (name in names) {
        println(name)
    }
}

/*
Task 2:
Create an array of 5 numbers.
Print the sum of all numbers in the array.
 */

fun task2Array() {
    val numbers = arrayOf(1, 3, 5, 7, 8985)
    // here the option with using the kotlin specific sum expression to make my life easy
    println(numbers.sum())
    //here using a for loop and calculating the sum
    var sum = 0
    for (n in numbers) {
        sum = sum + n
    }
    print(sum)
}

//Extra Practice
//If/Else
/*
Task 1:
Given a variable age, print "Adult" if age is 18 or older, otherwise print "Minor".

val age = 17
*/

fun task1ExtraIf() {
    val age = 17
    if (age < 18) {
        println("Minor")
    } else {
        println("Adult")
    }
}

/*
Task 2:
Given two variables a and b, print the larger number.

val a = 15
val b = 20
 */
fun task2ExtraIf() {
    val a = 15
    val b = 20
    if (a > b) {
        print(a)
    } else if (b > a) {
        print(b)
    } else {
        print(("The numbers are equal"))
    }
}

//When
/*
Task 1:
Given a variable day (1–7), print the name of the day (1–Monday, 2–Tuesday, ..., 7–Sunday).

val day = 3
*/
fun task1ExtraWhen() {
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Not a valid weekday")
    }
}

/*
Task 2:
Given a variable score (0–100), print:

"A" if score >= 90
"B" if score >= 80
"C" if score >= 70
"D" if score >= 60
"F" otherwise
val score = 85
 */

fun task2ExtraWhen() {
    val score = 85
    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}

//Loops
/*Task 1:
Print all odd numbers from 1 to 15.
*/
fun task1ExtraLoop() {
    for (numbers in 1..15) {
        val isOdd = numbers % 2 == 1
        if (isOdd) {
            print("$numbers \t")
        }
    }
}

/*
Task 2:
Print the sum of all numbers from 1 to 5.
 */
fun task2ExtraLoop() {
    var sum = 0
    for (number in 1..5) {
        sum = sum + number
    }
    print(sum)
}


//Ranges
/*
Task 1:
Print all numbers from 5 to 15.
*/
fun task1ExtraRange() {
    for (number in 5..15) {
        print("$number \t")
    }
}

/*
Task 2:
Print all numbers from 20 down to 10.
 */
fun task2ExtraRange() {
    for (number in 20 downTo 10) {
        print("$number \t")
    }
}