package com.example.opptasks

/**
 * Создайте класс Car с полями model, color, year и методом drive().
 * Создайте несколько объектов этого класса и вызовите их метод drive().
 */
class Car(private val model: String, private val color: String, private val year: String) {

    fun drive() {
        println("$color $model ($year) is driving!")
    }
}

fun driveCars() {
    val car1 = Car("BMW", "Black", "1999")
    val car2 = Car("BMW", "Blue", "2007")
    val car3 = Car("BMW", "Red", "2024")

    car1.drive()
    car2.drive()
    car3.drive()
}