package org.example.com.shapegames.course.module1.unit1.task1

/*
Assignment 1: Immutable Variable (val)
Task:
Create a variable called daysInWeek with the value 7. Don't write the type — let Kotlin figure it out.
*/

fun main() {
    val daysInWeek = 7
    println("There are $daysInWeek days in a week.")
    println("The type of the variable daysInWeek is ${daysInWeek::class.simpleName}")
}