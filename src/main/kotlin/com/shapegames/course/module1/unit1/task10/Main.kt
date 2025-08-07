package org.example.com.shapegames.course.module1.unit1.task10

/*
Assignment 10: Multi-line Comment
Task:
Describe the logic of code that calculates a price with a discount.
*/

/*
I would start with assigning a val to the price
val price = 10
And then decide what the discount value should be
val discount = 0.2
and then calculate the new price, as it is as a discount we need to substract it from 1. Taxes would be added to 1
val newPrice = price * (1 - discount)
And to have it also visible we print it out
println(newPrice)
 */

fun main() {
    val price = 10
    val discount = 0.2
    val newPrice = price * (1 - discount)
    println(newPrice)
}