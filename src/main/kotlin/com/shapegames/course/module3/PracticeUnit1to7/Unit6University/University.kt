package com.shapegames.course.module3.PracticeUnit1to7.Unit6University


fun main(){
    val universityAccountInfo = UniversityAccount("Kathrin", "kathrin@shapegames.com")
    universityAccountInfo.showInfo()
    val studentAccountInfo = StudentAccount("Kathrin", "kathrin@shapegames.com", 4711)
    studentAccountInfo.showStudentInfo()
}
//Unit 6: Inheritance Practice Task

//Task 1: University Accounts
//
//Imagine you are building a system for a university.
//
//Create a base class UniversityAccount with properties: username (String) and email (String).
open class UniversityAccount (val _username: String, val _email: String){
    //Add a function showInfo() that prints the username and email.
    fun showInfo(){
        println("My user is ${_username} with email address ${_email}.")
    }
}
//Create a class StudentAccount that inherits from UniversityAccount and adds a property studentId (Int).
class StudentAccount(_username: String, _email: String, val _studentID: Int) : UniversityAccount(_username, _email){
//In StudentAccount, add a function showStudentInfo() that prints all account info plus the student ID.
    fun showStudentInfo(){
        println("The user ${_username} with ${_email} has the student ID ${_studentID}.")
    }
}