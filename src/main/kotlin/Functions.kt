package ru.sk1ly

import kotlin.math.min

fun main() {
    println(max(1, 5))
    println(first5Symbols("абвгдеё"))
    println(sum(1, 2, 3))
    println(sort(mutableListOf(5, 3, 6, 9, 6, -1, 10)))
    println(sort(arrayOf(4, 2, 3, 2, 3, 1050)))
    println(sort(5, 1, 4, 9, 4, 1051))
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun first5Symbols(text: String) = text.substring(0, min(5, text.length))

fun sum(vararg numbers: Int) = numbers.sum()

fun sort(collection: MutableList<Int>): List<Int> {
    for (i in 1 until collection.size) {
        for (j in collection.size - 1 downTo i) {
            if (collection[j] < collection[j - 1]) {
                val temp = collection[j]
                collection[j] = collection[j - 1]
                collection[j - 1] = temp
            }
        }
    }
    return collection
}

fun sort(numbers: Array<Int>): List<Int> = sort(numbers.toMutableList())

fun sort(vararg numbers: Int): List<Int> = sort(numbers.toMutableList())
