package com.shapegames.course.module3.PracticeUnit1to7

fun main() {

// task 1
//    val dog = Dog("Lassie", 5)
//    val dog1 = Dog("Aslan", 13)
//    val dog2 = Dog("Nellie", 10)
//    val dog3 = Dog("Bella", 7)
//    for (d in listOf(dog, dog1, dog2, dog3)){
//        d.dogInfo()
//        d.bark()
//    }

// task 2
    val book = Book("The Lord of the Rings", "J.R.R. Tolkien")
    val book1 = Book("The Silmarillion")
    //to print the properties of the two books
    book.bookRelease()
    book1.bookRelease()
}

//Unit 1: Classes and Objects
//Task 1:
//Create a class called Dog with two properties: name (String) and age (Int). Make a new object of this class and print its properties.
class Dog(
    var name: String,
    var age: Int
) {
    fun dogInfo() {
        println("Name: $name,age: $age")
    }
//Task 2:
//Add a function to the Dog class called bark(). Make it print "Woof! My name is {name}". Call this function for your object.
    fun bark(){
        println("Woof! My name is $name")
    }
}
//Task 3:
//Create three different objects of the Dog class with different names and ages. Print their properties using a function in the class.
// see in the main function

//Unit 2: Constructors
//Task 1:
//Create a class called Book with a primary constructor that takes two parameters: title (String) and author (String). Make an object and print the book's title and author.
class Book(
    var title: String,
    var author: String
) {
//Task 2:
//Add a secondary constructor to Book that only takes a title and sets the author to "Unknown". Create an object using this constructor and print its properties.
    constructor(title: String) : this(title, author = "unknown")
//Task 3:
//Add an initializer block (init) to the Book class that prints "Book created: {title} by {author}" when a new book is made. Test it with both constructors.
    init {
        println("Book created: $title by $author")
    }
    //part of task 1 to print the properties of the book
    fun bookRelease(){
        println("Title: $title, author: $author")
    }
}