package com.example.reference.reference

//Exercise 2: Create a program that reads in a list of words from the user, and then
// uses an iterator to iterate over the list and count the number of words that
// contain a particular letter.
fun main() {
    println("Enter a list of words, separated by commas")
    val input = readLine()
    val words = input?.split(" ")?.map { it.trim() }

    // Search of letter
    println("Enter a letter to search for:")
    val letter = readLine()?.trim()?.getOrNull(0)

    if (letter == null) {
        println("Invalid input")
        return
    }

    //Iterator
    var count = 0
    val iterator = words?.iterator()

    while (iterator?.hasNext() == true) {
        val word = iterator.next()

        if (word.contains(letter, ignoreCase = true)) {
            count++
        }
    }

    //Print result
    println("The number of words that $letter: $count")


}