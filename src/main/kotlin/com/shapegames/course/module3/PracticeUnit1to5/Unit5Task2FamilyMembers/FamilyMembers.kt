package com.shapegames.course.module3.PracticeUnit1to5.Unit5Task2FamilyMembers

//Unit 5: Access Modifiers Practice Tasks
//Task 2: Family Members

//Try to access lastName from outside both classes.
fun main(){
    //printing the full Name of the Person
    val personsName = Person("Bond", "James")
    personsName.showFullName()

//    The next line does not work as the variable _lastName is protected
//    println(personsName._lastName)

    //Printing only the last name of the Child
    val myObj = Child("Moneypenny", "Mis" )
    myObj.printFunction()
}

//Create a class Person with:
open class Person(
    //A protected property lastName (String).
    protected var _lastName: String,
    //A public property firstName (String).
    public var _firstName: String,
){
    //A public function showFullName() that prints the full name.
    public fun showFullName() {
        var _fullname = _firstName.plus(" ").plus(_lastName)
        println(_fullname)
    }
}
//Then, create a class Child that inherits from Person and prints the last name using a function.
class Child(_lastName: String, _firstName: String) : Person(_lastName, _firstName){
    fun printFunction(){
        println(_lastName)
    }
}



