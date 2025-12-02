package org.example.secondLesson

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffBonus: Float = 0.2f

    val crystalBonus: Int = (crystalOre * buffBonus).toInt()
    val ironBonus: Int = (ironOre * buffBonus).toInt()

    println(crystalBonus)
    println(ironBonus)
}