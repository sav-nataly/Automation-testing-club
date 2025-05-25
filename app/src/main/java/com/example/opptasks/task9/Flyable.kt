package com.example.opptasks.task9

/**
 * 9. Создайте интерфейс Flyable с методом fly() и интерфейс Navigable  с методом navigate(),
 * затем создайте классы Bird и Airplane, реализующие эти интерфейсы.
 * Создайте объекты Bird и Airplane и вызовите их методы fly() и navigate().
 */
interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird() : Flyable, Navigable {
    override fun fly() {
        println("Bird flies")
    }

    override fun navigate() {
        println("Bird navigates")
    }
}

class Airplane() : Flyable, Navigable {
    override fun fly() {
        println("Airplane flies")
    }

    override fun navigate() {
        println("Airplane navigates")
    }
}

fun oopTask9() {
    val bird = Bird()

    bird.fly() // Bird flies
    bird.navigate() // Bird navigates

    val airplane = Airplane()

    airplane.fly() // Airplane flies
    airplane.navigate() // Airplane navigates
}