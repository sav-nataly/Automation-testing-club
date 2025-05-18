package com.example.opptasks

/**
 * Создайте enum class DayOfWeek, содержащий все дни недели.
 * Выведите все дни недели, используя свойства values и name этого enum.
 */
enum class DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun printDays() {
    for (day in DayOfWeek.entries) { // в Kotlin 1.9.0 values() заменено на entries
        println(day.name)
    }
}