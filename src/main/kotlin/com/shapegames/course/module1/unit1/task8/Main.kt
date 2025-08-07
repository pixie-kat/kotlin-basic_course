package org.example.com.shapegames.course.module1.unit1.task8

/*
Assignment 8: val Reassignment Error
Task:
Why does this code not compile? Fix it and explain in a comment.

// Original code with error
fun main() {
    val balance = 100
    balance = 120 // Error here
    println(balance)
}
*/

//val cannot be reassigned. one way to fix it is to use a var instead, as that can get "overwritten"
fun main() {
    var balance = 100
    balance = 120
    println(balance)
}


//Another option would be to create another new val with the old balance + the added value
//fun main(){
//    val balance = 100;
//    val newBalance = balance + 20
//    println(newBalance)
//}
