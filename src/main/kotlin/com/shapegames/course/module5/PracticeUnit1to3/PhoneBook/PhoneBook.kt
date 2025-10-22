package com.shapegames.course.module5.PracticeUnit1to3.PhoneBook

import com.shapegames.course.module5.PracticeUnit1to3.StudentGrades.name

/*
1. Phone Book
Create a class called PhoneBook.
Add a function to add a contact (name and phone number) to the phone book (use a map).
Also, add a function to find a phone number by name.
 */

var mapOfPhoneBook = mutableMapOf<String, Int>("Jones" to 1234, "Bob" to 2345, "Jim" to 3456)

fun main() {
    val phoneBookEntries = PhoneBook()
    phoneBookEntries.addContact("Eve", 9870)
    phoneBookEntries.findPhoneNumber("Eve")
}


class PhoneBook {
    fun addContact(name: String, phoneNumber: Int): MutableMap<String, Int> {
        mapOfPhoneBook.put(name, phoneNumber)
        println(mapOfPhoneBook)
        return mapOfPhoneBook
    }
    fun findPhoneNumber(name: String): Int? {
        val foundPhoneNumber = mapOfPhoneBook.get(name)
        println(foundPhoneNumber)
        return foundPhoneNumber
    }
}