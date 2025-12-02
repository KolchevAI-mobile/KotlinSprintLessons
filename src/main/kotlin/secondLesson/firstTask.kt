package org.example.secondLesson

const val NUMBER_OF_MARKS = 4.0

fun main() {
    val firstMark: Int = 3
    val secondMark: Int = 4
    val thirdMark: Int = 3
    val fourthMark: Int = 5

    val average: Double = (firstMark + secondMark + thirdMark + fourthMark)/NUMBER_OF_MARKS

    println(String.format("%.2f", average))
}