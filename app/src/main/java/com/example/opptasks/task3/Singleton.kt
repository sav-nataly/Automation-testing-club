package com.example.opptasks.task3

/**
 * 3. Создайте объект Singleton с методом printMessage(),
 * который выводит любое сообщение. Вызовите этот метод.
 */
object Singleton {
    fun printMessage(message: String) {
        println("Message: $message") // выводит переданное сообщение
    }
}

fun oopTask3() {
    Singleton.printMessage("Some message") // Some message
}