package com.example.opptasks.task6

/**
 * 6. Создайте класс Animal с методом makeSound(),
 * затем создайте классы Dog и Cat, наследующие от Animal,
 * и переопределите метод makeSound(). Создайте объекты Dog и Cat и вызовите их методы makeSound().
 */
open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Cat meows")
    }
}

fun oopTask6() {
    val dog = Dog()
    val cat = Cat()

    dog.makeSound() // Dog barks
    cat.makeSound() // Cat meows
}