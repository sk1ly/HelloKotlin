package ru.sk1ly

import ru.sk1ly.data.*

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

    val employee1 = Seller("Иван", "Middle QA", 2020)
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

// Наследование

    val employees = mutableListOf<Employee>()
    employees.add(Seller("Василий", "Senior QA", 2022))
    employees.add(Programmer("Михаил", "Middle Programmer", 2015, "Java"))
    employees.add(Seller("Анна", "Бухгалтер", 2019))
    employees.add(Director("Михал Палыч", "Директор", 2010))
    for (e in employees) {
        e.work()
        if (e is Cleaner) {
            e.clean() // smart-cast
        }
    }

    var cleanerEmployees = mutableListOf<Cleaner>()
    cleanerEmployees = employees.filter { it is Cleaner }.map { it as Cleaner }.toMutableList() // Делаем всех работников уборщиками (кого возможно)

// Статика

    println(MyRandom.randomInt(0..1000))
    println(MyRandom.randomBoolean())
    println(MyRandom.randomDayOfWeek())

}

fun Employee.printInfo() = println("Опыт работы у $name (должность $function) - $experience года/лет")