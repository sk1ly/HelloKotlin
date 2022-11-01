package ru.sk1ly

fun main() {

    val dog = Dog()
    dog.name = "тузик"
    dog.age = 3
    dog.weight = -5
    println("Имя: ${dog.name}; Возраст:${dog.age} ; Вес: ${dog.weight}")

    val book1 = Book("Книга 1", 1994, 499)
    val book2 = Book("Книга 2")
}