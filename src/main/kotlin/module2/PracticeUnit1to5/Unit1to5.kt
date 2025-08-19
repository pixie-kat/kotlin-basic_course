package module2.PracticeUnit1to5

fun main() {
   addToGroup("The Beatles","John", "Paul", "George", "Ringo")
}

//Unit 1. Functions and Their Parameters
//Unit 1.1 - Write a function called greet that takes a name (String) as a parameter and prints "Hello, [name]!".
//possible val greet("Jim")
fun greet(name: String) {
    println("Hello, $name")
}

//Unit 1.2 - Write a function called displayUser that takes two parameters: a name (String) and an age (Int), and prints "Name: [name], Age: [age]".
//possible usage: displayUser("Jim", 21)
fun displayUser(name: String, age: Int) {
    println("Name: [$name], Age: [$age]")
}

//Unit 1.3 - Write a function called showMessage that takes a message (String) and prints it. Try calling it with different messages.
// possible message to use: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
//not done!
fun showMessage(message: String) {
    println(message)
}

//Unit 2. Vararg Parameters
//Unit 2.1 - Write a function called printNumbers that takes a variable number of integers and prints each one on a new line.
fun printNumbers(vararg number: Int) {
    for (n in number) {
        println(n)
    }
}

//Unit 2.2 - Write a function called concatStrings that takes a variable number of strings and prints them as a single line separated by spaces.
//possible string to use: concatStrings("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit,", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua.")
fun concatStrings(vararg Strings: String) {
    for (s in Strings) {
        print(s.plus(" "))
    }
}

//Unit 2.3 - Write a function called addToGroup that takes a group name (String), any number of user names (String), and prints the group name and all users.
//groupName = "The Beatles", userNames = "John", "Paul", "George", "Ringo")
fun addToGroup(groupName: String, vararg userNames: String) {
    println("Group: $groupName")
    for (user in userNames) {
        println("Users: $user")
    }
}


/*
Unit 3. Returning Results

Write a function called multiply that takes two Int parameters and returns their product.
Write a function called isEven that takes an Int and returns true if the number is even, false otherwise.
Write a function called printIfPositive that takes an Int and prints the number only if it is positive (use return to exit early).
*/

/*
Unit 4. Single-Expression and Local Functions

Write a single-expression function called cube that returns the cube of a given Int.
Write a function called checkAndPrint that takes an Int, defines a local function isValid to check if the number is positive, and prints "Valid" or "Invalid".
Write a function compare that takes two Ints and a local function that returns true if both are less than 10. Print "Both less than 10" or "Not both less than 10".
*/

/*
Unit 5. Function Overloading

Write two functions with the same name show — one that takes a String and prints it, another that takes an Int and prints it.
Write two functions called max: one that takes two Ints and returns the larger, another that takes two Doubles and returns the larger.
Write two functions named sum: one that takes two Ints, and one that takes three Ints, and both return the sum.
 */