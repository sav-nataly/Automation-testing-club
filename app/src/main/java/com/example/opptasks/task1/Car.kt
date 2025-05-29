package com.example.opptasks.task1

/**
 * 1. Создайте класс Car с полями model, color, year и методом drive().
 * Создайте несколько объектов этого класса и вызовите их метод drive().
 */
class Car(private val model: String, private val color: String, private val year: String) {
    // все поля передаются в конструкторе
    fun drive() {
        println("$color $model ($year) is driving!")
    }
}

fun oopTask1() {
    val car1 = Car("Audi", "Black", "1999") // Black Audi (1999) is driving!
    val car2 = Car("Jaguar", "Blue", "2007") // Blue Jaguar (2007) is driving!
    val car3 = Car("BMW", "Red", "2024") // Red BMW (2024) is driving!

    car1.drive()
    car2.drive()
    car3.drive()
}