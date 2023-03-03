package com.example.reference.reference

class House {
    var color : String ="white"
    var numberOfWindows: Int = 2
    var isForSale: Boolean = false


    fun updateColor(newColor : String) {
        color = newColor
    }

    fun updateNumberOfWindows(number: Int) {
        numberOfWindows = number
    }

    init {
        color = "Black"
    }

}

fun main() {
    val myHouse = House()

//    myHouse.color = "yellow"
//    myHouse.numberOfWindows = 5
//    myHouse.isForSale = true


    println(myHouse.color)
    println(myHouse.numberOfWindows)
    println(!myHouse.isForSale)
}