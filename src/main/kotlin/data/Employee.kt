package ru.sk1ly.data

import java.time.Year

abstract class Employee(val name: String, val function: String, val startYear: Int) {

    val experience: Int
    get() = Year.now().value - startYear

    open fun work() = println("Работаю...")
}