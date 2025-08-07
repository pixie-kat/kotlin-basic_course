package org.example.com.shapegames.course.module1.unit1.task13

/*
Assignment 13: Combination of Operators
Task:
Count apples in baskets and some extra apples.
*/
fun main() {
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