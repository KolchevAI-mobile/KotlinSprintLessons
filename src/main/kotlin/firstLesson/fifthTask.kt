package org.example.firstLesson

fun main() {
    val seconds: Int = 6480
    val minutes: Int = seconds / 60
    val remainingSeconds: Int = seconds % 60
    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    val hoursFormatted = hours.toString().padStart(2, '0')
    val minutesFormatted = remainingMinutes.toString().padStart(2, '0')
    val secondsFormatted = remainingSeconds.toString().padStart(2, '0')

    println("$hoursFormatted:$minutesFormatted:$secondsFormatted")
}