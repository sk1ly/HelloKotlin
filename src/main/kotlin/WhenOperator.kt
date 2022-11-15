package ru.sk1ly

import ru.sk1ly.Month.*
import ru.sk1ly.Season.*

fun main() {
    printSeasonFromTextMonth()
    printSeasonFromEnumMonth()
    printSeasonFromNumberMonth()
    printWhatINeedToDo()
}

private fun printSeasonFromTextMonth() {
    val nameOfMonth = "Март"

    val season = when (nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> "Зима"
        "Март", "Апрель", "Май" -> "Весна"
        "Июнь", "Июль", "Август" -> "Лето"
        "Сентябрь", "Октябрь", "Ноябрь" -> "Осень"
        else -> "Не найдено"
    }
    println("Текущее время года - $season")
}

private fun printSeasonFromEnumMonth() {
    val month = JANUARY
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUAURY  -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println("Текущее время года - ${season.rusName}")
}

private fun printSeasonFromNumberMonth() {
    val numberOfMonth = 6

    val season = when (numberOfMonth) {
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Не найдено"
    }
    println("Текущее время года - $season")
}

private fun printWhatINeedToDo() {
    val currentHour = 10;
    val currentWeather = "Хорошая"

    val action = when {
        currentHour in 10..18 && currentWeather == "Хорошая" -> "Гулять"
        currentHour in 10..18 && currentWeather == "Плохая" -> "Читать книгу"
        else -> "Спать"
    }
    println(action)
}