package com.shapegames.course.module3.PracticeUnit1to5.Unit5Task3SecretRecipe

//Unit 5: Access Modifiers Practice Tasks
//Task 3: Secret Recipe

//In your main function, print the recipe name and call printIngredients().
fun main(){
    val recipeInfo = Recipe(listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan", "Pepper"),"Spaghetti Carbonara")
    println(recipeInfo.name)
    recipeInfo.callPrintIngredients()
}

//Create a class Recipe with:
class Recipe(
    //An internal property ingredients (List of String).
    internal val _ingredients: List<String>,
    //A public property name (String).
    public val name: String
){
    //A private function printIngredients() that prints all ingredients.
    private fun printIngredients() {
        val _allIngredients = _ingredients
        println(_allIngredients)
    }
    //I can
    fun callPrintIngredients() {
        return printIngredients()
    }
}