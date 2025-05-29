package com.example.opptasks.task8

/**
 * 8. Создайте абстрактный класс Shape с абстрактным методом area(),
 * затем создайте классы Circle и Rectangle, реализующие этот метод.
 * Создайте объекты Circle и Rectangle и выведите их площадь.
 */
abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() { // в конструкторе передается радиус
    override fun area(): Double {
        return radius * radius * Math.PI
    }
}

class Rectangle(val sideA: Double, val sideB: Double) : Shape() { // в конструкторе передаются стороны
    override fun area(): Double {
        return sideA * sideB
    }
}

fun oopTask8() {
    val circle = Circle(10.0)
    val rectangle = Rectangle(20.0, 5.0)

    println(circle.area()) // 314.1592653589793
    println(rectangle.area()) // 100.0
}

fun main() {
    oopTask8()
}

