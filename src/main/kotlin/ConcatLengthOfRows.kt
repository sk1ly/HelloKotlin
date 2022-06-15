package ru.sk1ly

private val row1: String? = null
private val row2: String? = "bbbb"
private val row3: String? = ""

fun main() {
    val result: Int = (row1?.length?:0) + (row2?.length?:0) + (row3?.length?:0)
    println(result)
}