package org.example.secondLesson

const val TIME = 60

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457

    val departureTotalMinutes: Int = (departureHour * TIME) + departureMinute
    val arrivalTime: Int = departureTotalMinutes + travelTime

    val arrivalHour: Int = arrivalTime / TIME
    val arrivalMinute: Int = arrivalTime % TIME

    val formattedHour: String = String.format("%02d", arrivalHour)
    val formattedMinute: String = String.format("%02d", arrivalMinute)

    println("$formattedHour:$formattedMinute")
}