package org.example.secondLesson

fun main() {
    val workersSalary = 30000
    val internSalary = 20000
    val workersCount = 50
    val internCount = 30

    val employeeExpenses: Int = workersCount * workersSalary
    val totalExpenses: Int = employeeExpenses + (internSalary * internCount)
    val averageSalary: Int = totalExpenses / (workersCount + internCount)

    println(employeeExpenses)
    println(totalExpenses)
    println(averageSalary)
}