package ru.sk1ly

val array1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
val array2 = arrayOfNulls<Int>(101)
val array3 = arrayOfNulls<Int>(301)

fun main() {

    for (i in array2.indices) { // Аналог "i in 0 until array2.size"
        array2[i] = i
    }

    println("От 0 до 100")
    for (i in array2) {
        println(i)
    }

    println("От 100 до 0 с шагом 2")
    for (i in 100 downTo 1 step 2) {
        println(i)
    }

    println("От 0 до 100 умножив каждый элемент на 3")
    for ((index, i) in array2.withIndex()) {
        array2[index] = i?.times(3)
    }
    for (i in array2) {
        println(i)
    }

    for ((index, i) in (300..600).withIndex()) {
        array3[index] = i
    }
    println("От 600 до 300 все числа, которые без остатка делятся на 5")
    for (i in array3.size - 1 downTo 0 step 5) {
        println(i)
    }

}
