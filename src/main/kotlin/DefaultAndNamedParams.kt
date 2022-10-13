package ru.sk1ly

/**
 * Создать метод, который возвращает объем параллелепипеда. К качестве параметра можно передать от 1 до 3 сторон.
 * Если передана 1 сторона, то считается, что все стороны равны (куб).
 * Если переданы 2 стороны, то считается, что 1-ая и 3-ая стороны равны.
 * Метод должен быть 1 (без перегрузок).
 * Метод должен быть записан в одну строчку, без слова return.
 */

fun main() {
    println(getParallelepipedVolume(3)) // 27
    println(getParallelepipedVolume(3, 2)) // 18
    println(getParallelepipedVolume(1, 3, 5)) // 15
    println(getParallelepipedVolume(b = 2, h = 3, a = 4)) // 24
}

fun getParallelepipedVolume(a: Int, b: Int = a, h: Int = a) = a * b * h