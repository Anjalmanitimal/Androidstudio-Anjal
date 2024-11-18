package com.example.week1
fun main() {
    var data = mapOf(
        "animal" to "This is animal",
        "book" to "read books",
    )
    print("Enter any word:")
    var word : String = readln()
    println("The meaning is ${data[word]}")

}



