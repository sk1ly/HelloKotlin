package ru.sk1ly.data

class Programmer(name: String, function: String, startYear: Int, val programLanguage: String) : Employee(name, function, startYear), Cleaner {

    override fun work() {
        println("Пишу на $programLanguage...")
    }
}