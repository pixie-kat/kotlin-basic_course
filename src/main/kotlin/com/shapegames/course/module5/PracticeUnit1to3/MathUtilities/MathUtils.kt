package com.shapegames.course.module5.PracticeUnit1to3.MathUtilities

/*
2. Math Utilities
Create a class called MathUtils.
Add a function that takes a list of integers and returns the sum of all even numbers in the list.
 */
var listOfIntegers = mutableListOf<Int>(4, 100, 3, 99)

fun main(){
    var listOfNumbers = MathUtils()
    listOfNumbers.sumEvenNumbers()
}

class MathUtils {
    fun sumEvenNumbers(): List<Int> {
        val listEvenNumbers = listOfIntegers.filter { it % 2 == 0 }
        println(listEvenNumbers.sum())
        return listEvenNumbers
    }
}