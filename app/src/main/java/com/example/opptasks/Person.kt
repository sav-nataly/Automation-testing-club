package com.example.opptasks

/**
 * Создайте класс Person с приватными свойствами name, age
 * и публичными методами getName() и getAge().
 * Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 */
class Person {
    private var name: String = "John"

    private var age: Int = 23

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}

fun fieldAccessTest() {
    val person = Person()

    // ошибка IDE: Cannot access 'name'/'age': it is private in 'Person'
    // println("Name: ${person.name}, age: ${person.age}")
    println("Name: ${person.getName()}, age: ${person.getAge()}")
}