package com.example.opptasks

/**
 * Создайте объект Singleton с методом printMessage(),
 * который выводит любое сообщение. Вызовите этот метод.
 */
object Singleton {
    fun printMessage(message: String) {
        println("Message: $message")
    }
}

fun callSingletonMethod() {
    Singleton.printMessage("message")
}