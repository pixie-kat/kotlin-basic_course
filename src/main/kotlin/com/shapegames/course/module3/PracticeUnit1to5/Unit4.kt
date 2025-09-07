package com.shapegames.course.module3.PracticeUnit1to5

fun main() {
    val student = Student(25, "Steve")
    student.name=" "
    println("${student.name} is ${student.age} years old. He is a ${student.isAdult} adult")
}

//Unit 4: Getters and Setters
//Task 1:
//Create a class called Student with a property age (Int). Add a setter that only allows age values between 5 and 100.

class Student(_age: Int, _name: String) {
    var age: Int = _age
        set(value) {
            if (value in 5..100) {
                field = value
            }
        }
//Task 2:
//Add a computed property isAdult (Boolean) to the Student class. It should return true if age is 18 or older, else false.
    val isAdult: Boolean
        get() {
            return age >= 18
        }
//Task 3:
//Add a private field _name to Student and a public property name with custom getter and setter. The setter should not allow empty names. Try to set an empty name and print the result.
    var name: String = _name
        set(value) {
            if(value != " ") {
                field = value
            }
        }
}


