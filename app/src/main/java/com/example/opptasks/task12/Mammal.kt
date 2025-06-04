package com.example.opptasks.task12

/**
 * 12. Создайте два класса: Mammal и CanFly.
 * В классе Mammal определите метод breastfeed(), а в классе CanFly - метод fly().
 * Затем создайте класс Bat, который сочетает в себе оба этих поведения (с помощью композиции)
 */
class Mammal {
    fun breastFeed() {
        println("A Mammal can breastfeed")
    }
}

class CanFly() {
    fun fly() {
        println("A CanFly can fly")
    }
}

class Bat() {
    private val mammal = Mammal()
    private val canFly = CanFly()

    fun breastFeed() {
        mammal.breastFeed()
    }

    fun fly() {
        canFly.fly()
    }
}

fun oopTask12() {
    val bat = Bat()
    bat.fly() // A CanFly can fly
    bat.breastFeed() // A Mammal can breastfeed
}
