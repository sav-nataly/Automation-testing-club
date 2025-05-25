package com.example.opptasks.task4

/**
 * 4. Создайте класс com.example.opptasks.task5.Person с приватными свойствами name, age
 * и публичными методами getName() и getAge().
 * Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
 */
class Person {
    // приватные поля
    private var name: String = "John"
    private var age: Int = 23

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}

fun oopTask4() {
    val person = Person()

    // ошибка IDE: Cannot access 'name'/'age': it is private in 'com.example.opptasks.task5.Person'
    // println("Name: ${person.name}, age: ${person.age}")

    println("Name: ${person.getName()}, age: ${person.getAge()}") // ошибки нет
    // Name: John, age: 23
}