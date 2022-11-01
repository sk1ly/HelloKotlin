package ru.sk1ly

fun main() {

    val dog = Dog()
    dog.name = "тузик"
    dog.age = 3
    dog.weight = -5

    println("Имя: ${dog.name}; Возраст:${dog.age} ; Вес: ${dog.weight}")
}