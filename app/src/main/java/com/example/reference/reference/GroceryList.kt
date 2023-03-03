package com.example.reference.reference

fun main() {
    val groceryList = ArrayList<String>()

    while (true) {
        println("\nWelcome to the Grocery Store!")
        println("Please choose an option:")
        println("1. Add an item and its price")
        println("2. Remove an item")
        println("3. Print the list")
        println("4. Exit")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("\nEnter the name of the item:")
                val item = readLine() ?: ""

                println("\nEnter the price of the item:")
                val price = readLine()?.toFloatOrNull() ?: 0.0f

                groceryList.add("$item - $${"%.2f".format(price)}")
                println("\nItem added successfully!")
            }
            2 -> {
                println("\nGrocery List:")
                groceryList.forEachIndexed { index, item -> println("${index + 1}. $item") }

                println("\nEnter the index of the item to remove:")
                val index = readLine()?.toIntOrNull()?.minus(1) ?: -1

                if (index in 0 until groceryList.size) {
                    groceryList.removeAt(index)
                    println("\nItem removed successfully!")
                } else {
                    println("\nInvalid index! Please try again.")
                }
            }
            3 -> {
                println("\nGrocery List:")
                groceryList.forEachIndexed { index, item -> println("${index + 1}. $item") }
            }
            4 -> {
                println("\nExiting program...")
                return
            }
            else -> {
                println("\nInvalid option! Please try again.")
            }
        }
    }
}