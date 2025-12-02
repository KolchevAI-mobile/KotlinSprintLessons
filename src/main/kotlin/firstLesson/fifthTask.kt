package org.example.firstLesson

const val TIME = 60

fun main() {

    val seconds: Int = 6480
    val minutes: Int = seconds / TIME
    val remainingSeconds: Int = seconds % TIME
    val hours = minutes / TIME
    val remainingMinutes = minutes % TIME

    val hoursFormatted = String.format("%02d", hours)
    val minutesFormatted = String.format("%02d", remainingMinutes)
    val secondsFormatted = String.format("%02d", remainingSeconds)

    println("$hoursFormatted:$minutesFormatted:$secondsFormatted")
}