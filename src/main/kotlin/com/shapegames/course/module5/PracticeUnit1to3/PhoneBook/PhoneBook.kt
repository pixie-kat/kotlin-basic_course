package com.shapegames.course.module5.PracticeUnit1to3.PhoneBook

/*
1. Phone Book
Create a class called PhoneBook.
Add a function to add a contact (name and phone number) to the phone book (use a map).
Also, add a function to find a phone number by name.
 */

var mapOfPhoneBook = mutableMapOf<String, Int>("Jones" to 1234, "Bob" to 2345, "Jim" to 3456)

fun main() {
    val phoneBookEntries = PhoneBook()
    phoneBookEntries.addContact()
    phoneBookEntries.findPhoneNumber()
}


class PhoneBook {
    fun addContact(): MutableMap<String, Int> {
        mapOfPhoneBook.put("Eve", 9870)
        println(mapOfPhoneBook)
        return mapOfPhoneBook
    }
    fun findPhoneNumber(): Int? {
        println("Input name")
        val searchName = readln()
        val foundPhoneNumber = mapOfPhoneBook.get(searchName)
        println(foundPhoneNumber)
        return foundPhoneNumber
    }
}