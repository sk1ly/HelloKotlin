package ru.sk1ly.data

class Director(name: String, function: String, startYear: Int) : Employee(name, function, startYear) {

    override fun work() {
        println("Управляю компанией...")
    }
}