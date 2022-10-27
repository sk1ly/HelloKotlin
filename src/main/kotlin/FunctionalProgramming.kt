package ru.sk1ly

val nullableList: MutableList<Int>? = mutableListOf()

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

//  Функции filter и map

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

//  Функция flatmap

    val data = mapOf(
        "file1" to listOf(1, 3, 45, 98, 2),
        "file2" to listOf(670000, 4, -3, 34, 43),
        "file3" to listOf(87, 2, 1, 22, 3)
    )
    val average = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average)

//  Контрольная работа по коллекциям

    val weeklyEarningsData = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(weeklyEarningsData)

//  Функции let и with

    nullableList?.let { // если nullableList == null, то блок в let не будет выполнен
        with(nullableList) { // nullableList можно не указывать в таком случае далее
            for (i in 1 until 1000) {
                add((0..1000).random())
            }
            println(filter { it % 2 == 0 }.take(100))
        }
    }

//  Свои функции

    operateWithIntCollection(listOf(4, 8, 15, 16, 23, 42)) { println(it.sum()) }

//  Extension функции

    val number9 = 9
    println(number9.isPrime())
    val number5 = 5
    println(number5.isPrime())
    val number1 = 1
    println(number1.isPrime())

    myWith("hehehe") {
        println(substring(1))
    }

}

private fun printInfo(weeklyEarningsData: Map<String, List<Int>>) {
    val validData = weeklyEarningsData.filter { it.value.all { it >= 0 } }

    println("Средняя выручка в неделю: " + validData
        .flatMap { it.value }
        .average())

    println("Средняя выручка в месяц: " + validData
        .map { it.value }
        .sumOf { earnings: List<Int> -> earnings.average() })

    println("Максимальная выручка в месяц: " + validData
        .map { it.value }
        .maxOf { earnings: List<Int> -> earnings.sum() })

    println("Минимальная выручка в месяц: " + validData
        .map { it.value }
        .minOf { earnings: List<Int> -> earnings.sum() })

    println("Ошибки произошли в следующих месяцах: " + weeklyEarningsData
        .filter { it.value.any { it < 0 } }
        .map { it.key })
}

private inline fun operateWithIntCollection(intCollection: List<Int>, operate: (List<Int>) -> Unit) { // inline - чтоб не создавался объект анонимного класса, лучше использовать для мелких функций
    return operate(intCollection)
}

private fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

private inline fun<T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}
