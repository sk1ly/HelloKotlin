package ru.sk1ly

class MyRandom {

    companion object {
        private const val SUNDAY = "SUNDAY"
        private const val MONDAY = "MONDAY"
        private const val TUESDAY = "TUESDAY"
        private const val WEDNESDAY = "WEDNESDAY"
        private const val THURSDAY = "THURSDAY"
        private const val FRIDAY = "FRIDAY"
        private const val SATURDAY = "SATURDAY"

        fun randomInt(range: IntRange) = range.random()
        fun randomBoolean() = (0..1).random() == 1
        fun randomDayOfWeek() = arrayOf(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY).random()
    }
}