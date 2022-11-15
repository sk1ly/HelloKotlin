package ru.sk1ly

import java.time.Year

class Employee(val name: String, val function: String, val startYear: Int) {

    val experience: Int
    get() = Year.now().value - startYear

    fun work() = println("Работаю...")
}