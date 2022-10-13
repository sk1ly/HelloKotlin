package ru.sk1ly

fun main() {
    val sum = { a: Int, b: Int -> a + b }

    val squareV1 = { a: Int -> a * a }

    val squareV2: (Int) -> Int = { a -> a * a } // Тоже самое, что и выше

    val squareV3: (Int) -> Int = { it * it } // Тоже самое, что и выше

    val rectanglePerimeter = { a: Int, b: Int -> (a + b) * 2}

    val printName: (String) -> Unit = { println("Привет, $it!") }

    val descSort: (List<Int>) -> List<Int> = { it.sortedDescending()}

    println(sum(5, 3))
    println(squareV1(3))
    println(squareV2(3))
    println(squareV3(3))
    println(rectanglePerimeter(1, 2))
    printName("Ололоша")
    println(descSort(listOf(1, 3, -8, 2, 10, 0)))
}
