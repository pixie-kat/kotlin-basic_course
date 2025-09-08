package com.shapegames.course.module3.PracticeUnit1to5.Unit5Task3SecretRecipe

//Try to access ingredients from another file in the same module
fun main(){
    val recipeInfo = Recipe(listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan", "Pepper"),"Spaghetti Carbonara")
    //println(recipeInfo.name)
    recipeInfo.callPrintIngredients()
}



