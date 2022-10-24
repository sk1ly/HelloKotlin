package ru.sk1ly

fun main() {

//  Базовые вещи

    val sum = { a: Int, b: Int -> a + b }

    val squareV1 = { a: Int -> a * a }

    val squareV2: (Int) -> Int = { a -> a * a } // Тоже самое, что и выше

    val squareV3: (Int) -> Int = { it * it } // Тоже самое, что и выше

    val rectanglePerimeter = { a: Int, b: Int -> (a + b) * 2 }

    val printName: (String) -> Unit = { println("Привет, $it!") }

    val descSort: (List<Int>) -> List<Int> = { it.sortedDescending() }

    println(sum(5, 3))
    println(squareV1(3))
    println(squareV2(3))
    println(squareV3(3))
    println(rectanglePerimeter(1, 2))
    printName("Ололоша")
    println(descSort(listOf(1, 3, -8, 2, 10, 0)))

//  Функции высшего порядка - filter и map

    val texts = mutableListOf("Алло", "Картоха", "Акула")
    val textsStartsWithA = texts.filter { it.startsWith("А") }
    println(textsStartsWithA)

    val numbers = (0..15).toList()
    val employees = numbers.map { "Сотрудник #$it" }
    println(employees)
    val first5Employees = employees.take(5)
    println(first5Employees)
    val last10Employees = employees.drop(5)
    println(last10Employees)

    val thousandRandomNumbers = (0..999).map { (0..1000).random() }
    println("Тысяча рандомных чисел от 0 до 1000: $thousandRandomNumbers")
    val modifiedThousandRandomNumbers = thousandRandomNumbers
        .filter { it % 5 == 0 || it % 3 == 0 }
        .map { it * it }
        .sortedDescending()
        .map { it.toString() }
    println("Модифицированная коллекция: $modifiedThousandRandomNumbers")

//  Бесконечные последовательности

    val sequence = generateSequence("Сотрудник #1") {
        val index = it.substring(11).toInt()
        "Сотрудник #${index + 1}"
    }
    val first10Employees = sequence.take(10)
    for (employee in first10Employees) {
        println(employee)
    }

//  Функция zip

    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Имя №$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Имя: ${user.first}; Телефон: ${user.second}")
    }
}
