package com.example.opptasks.task10

/**
 * 10. Создайте data class User с двумя свойствами и методом printInfo(),
 * который выводит информацию о пользователе. Создайте объект User и вызовите его метод printInfo().
 */
data class User(val id: Int, val name: String) {
    fun printInfo() {
        println("User: id: $id, name: $name")
    }
}

fun oopTask10() {
    val user = User(1234, "John Doe")
    user.printInfo() // User: id: 1234, name: John Doe
}