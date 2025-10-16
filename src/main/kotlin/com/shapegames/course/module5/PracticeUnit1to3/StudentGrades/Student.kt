package com.shapegames.course.module5.PracticeUnit1to3.StudentGrades

/*
1. Student Grades
Create a class called Student.
Each student has a name and a list of grades (Int).
Write a function inside the class that calculates the average grade of the student.
 */

var name = "Bob"
var listofGrades = mutableListOf<Int>(1, 5, 7)

fun  main() {
    var student = Student(name, mutableListOf<Int>(1, 5, 7))
    student.averageGrade()
}

class Student(name: String, listOfGrades: List<Int>) {
    var sumOfGrades = 0
    var count = 0
    fun averageGrade(): Double {
        for (grade in listofGrades) {
            count++
            sumOfGrades = sumOfGrades + grade
        }
        var average = sumOfGrades / count.toDouble()
        println(average)
        return average
    }
}