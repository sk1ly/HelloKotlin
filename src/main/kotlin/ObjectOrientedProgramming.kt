package ru.sk1ly

fun main() {

// Геттеры и сеттеры

    val dog = Dog()
    dog.name = "тузик"
    dog.age = 3
    dog.weight = -5
    println("Имя: ${dog.name}; Возраст:${dog.age} ; Вес: ${dog.weight}")

// Конструкторы

    val book1 = Book("Книга 1", 1994, 499)
    val book2 = Book("Книга 2")

    val employee1 = Employee("Иван", "Middle QA", 2020)
    employee1.printInfo()

// Data-классы сразу предоставляют:

    val address1 = Address("Москва", "Кековная", 15)
    val address2 = Address("Москва", "Кековная", 15)

    println(address1) // метод toString

    println(address1.hashCode()) // метод hashCode
    println(address2.hashCode())

    println(address1 == address2) // метод equals

    val (name: String, street: String, numberOfHouse: Int) = address1 // деструктивные методы
    println("Имя $name; Улица $street ; Номер дома $numberOfHouse")

    val address3 = address1.copy() // метод copy
    println(address3)
}

fun Employee.printInfo() = println("Опыт работы у $name (должность $function) - $experience года/лет")