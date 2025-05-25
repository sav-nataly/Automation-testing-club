package com.example.opptasks.task13

/**
 * 13. Создайте классы Engine и Tires. Затем создайте класс Car,
 * который получает Engine и Tires через конструктор (Dependency Injection).
 */
class Tires {
    fun checkTires() { // метод, добавленный для проверки, что все работает
        println("Tires ok!")
    }
}

class Engine {
    fun checkEngine() { // метод, добавленный для проверки, что все работает
        println("Engine ok!")
    }
}

class Car(val tires: Tires, val engine: Engine) { // объекты переданы в конструкторе
    fun checkCar() { // метод, добавленный для проверки, что все работает
        tires.checkTires()
        engine.checkEngine()
    }
}

fun oopTask13() {
    val car = Car(Tires(), Engine())
    car.checkCar() // Tires ok!\nEngine ok!
}