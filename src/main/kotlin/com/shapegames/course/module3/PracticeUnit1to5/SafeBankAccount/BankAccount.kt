package com.shapegames.course.module3.PracticeUnit1to5.SafeBankAccount

//Unit 5: Access Modifiers Practice Tasks
//Task 1: Safe Bank Account
//Create a class BankAccount with the following:

//A private property balance (Double) that stores the account balance.
//A public function deposit(amount: Double) that adds money to the balance.
//A public function getBalance() that returns the current balance.
//Try to access the balance directly from outside the class and see what happens.

fun main(){
    var myBankAccount = BankAccount(1.0)
    myBankAccount.deposit(5.5)
    println("This is my new balance ${myBankAccount.getBalance()} ")
}

class BankAccount(private var _balance: Double) {
    public fun deposit(amount: Double) {
       _balance = _balance + amount
    }
    public fun getBalance(): Double {
        return _balance
    }
}