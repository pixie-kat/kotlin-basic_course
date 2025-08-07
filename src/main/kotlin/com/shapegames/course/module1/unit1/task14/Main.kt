package org.example.com.shapegames.course.module1.unit1.task14

/*
Assignment 14: Logical && (AND) Operator
Task:
See if the door can be opened: you need both a key and the password.
*/
fun main() {
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