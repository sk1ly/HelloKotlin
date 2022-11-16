package ru.sk1ly.data

class Seller(name: String, function: String, startYear: Int) : Employee(name, function, startYear), Cleaner {

    override fun work() {
        println("Продаю...")
    }
}