package com.shapegames.course.module3.PracticeUnit1to7.Unit5Task3SecretRecipeDifferentPackage

//Try to access ingredients from a different module.
import com.shapegames.course.module3.PracticeUnit1to7.Unit5Task3SecretRecipe.*

fun main(){
    val recipeInfo = Recipe(listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan", "Pepper"),"Spaghetti Carbonara")
    //println(recipeInfo.name)
    recipeInfo.callPrintIngredients()
}