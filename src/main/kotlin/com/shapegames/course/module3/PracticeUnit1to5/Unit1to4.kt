package com.shapegames.course.module3.PracticeUnit1to5

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

/*
Unit 3: Packages and Import
Task 1:
Create a package called mathops. Inside it, make a function called add(a: Int, b: Int): Int that returns the sum of two numbers.

Task 2:
In another file, import your add function from mathops and use it to add two numbers. Print the result.

Task 3:
Create another package called stringops with a function called concat(a: String, b: String): String that joins two strings. Import both add and concat into a third file and use both functions.
*/

/*
Unit 4: Getters and Setters
Task 1:
Create a class called Student with a property age (Int). Add a setter that only allows age values between 5 and 100.

Task 2:
Add a computed property isAdult (Boolean) to the Student class. It should return true if age is 18 or older, else false.

Task 3:
Add a private field _name to Student and a public property name with custom getter and setter. The setter should not allow empty names. Try to set an empty name and print the result.
*/

/*
Unit 5: Access Modifiers Practice Tasks

Task 1: Safe Bank Account

Create a class BankAccount with the following:

A private property balance (Double) that stores the account balance.
A public function deposit(amount: Double) that adds money to the balance.
A public function getBalance() that returns the current balance.
Try to access the balance directly from outside the class and see what happens.

Task 2: Family Members

Create a class Person with:

A protected property lastName (String).
A public property firstName (String).
A public function showFullName() that prints the full name.
Then, create a class Child that inherits from Person and prints the last name using a function.

Try to access lastName from outside both classes.

Task 3: Secret Recipe

Create a class Recipe with:

An internal property ingredients (List of String).
A public property name (String).
A private function printIngredients() that prints all ingredients.
In your main function, print the recipe name and call printIngredients().

Try to access ingredients from another file in the same module and from a different module.


 */