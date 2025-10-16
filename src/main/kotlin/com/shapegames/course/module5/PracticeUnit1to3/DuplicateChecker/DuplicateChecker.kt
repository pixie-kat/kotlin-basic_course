package com.shapegames.course.module5.PracticeUnit1to3.DuplicateChecker

/*
2. Duplicate Checker
Create a class called DuplicateChecker.
Write a function that takes a set of numbers and a number to check, and returns true if the number is already in the set, otherwise false.
 */

var setOfNumbers = mutableListOf<Int>(1, 2, 3, 4)
var number = 99

fun main() {
    val checkedList = DuplicateChecker()
    checkedList.checkforDuplicates()
}

class DuplicateChecker {
    fun checkforDuplicates() : Boolean{
        val checkForDupes = setOfNumbers.contains(number)
        println(checkForDupes)
        return checkForDupes
    }
}