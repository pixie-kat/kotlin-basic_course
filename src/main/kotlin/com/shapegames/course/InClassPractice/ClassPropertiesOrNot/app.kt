package com.shapegames.course.InClassPractice.ClassPropertiesOrNot

fun main(){
    val book1Info = Book1("LOTR", "The Lord of the Rings")
    book1Info.printBook1()
    val book2Info = Book2("LOTR", "The Lord of the Rings")
    book2Info.printBook2()
}

class Book1 (_title: String, val accessibleTitle : String){
    fun printBook1(){
        //title is not a property here! It is a field that we want to use in the class for e.g. a getter/setter setup
        //and then we need assign to it to a variable
        //using _ here is just a naming convention to indicate that it is private to this class
        println("Title: none and accessibleTitle: ${accessibleTitle}")
    }
}

class Book2 (val title: String, val accessibleTitle: String){
    fun printBook2(){
        println("Title: ${title} and accessibleTitle: ${accessibleTitle}")
    }
}