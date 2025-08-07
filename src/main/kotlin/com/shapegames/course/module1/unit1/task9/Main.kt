package org.example.com.shapegames.course.module1.unit1.task9

/*
Assignment 9: Comparison Operators
Task:
Check if myAge is enough to meet requiredAge.
*/
fun main(){
    val requiredAge = 21
    println("What is your age?")
    val myAge = readln()
    val isAgeGreater = myAge.toInt() >= requiredAge
    println ("Are you older than the required age? $isAgeGreater")
}