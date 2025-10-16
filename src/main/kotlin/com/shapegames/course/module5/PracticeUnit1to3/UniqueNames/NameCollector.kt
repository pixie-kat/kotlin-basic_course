package com.shapegames.course.module5.PracticeUnit1to3.UniqueNames

/*
1. Unique Names
Create a class called NameCollector.
Add a function that takes a list of names (String) and returns a set with only unique names.
 */

var listOfNames = mutableListOf<String>("Bob", "Jim", "Bob", "Alex", "Bob2")

fun main() {
    var setOfNames = NameCollector()
    setOfNames.setUniqueNames()
}

class NameCollector {
    fun setUniqueNames(): List<String> {
        val uniqueNames = listOfNames.distinct()
        println(uniqueNames)
        return uniqueNames

    }
}