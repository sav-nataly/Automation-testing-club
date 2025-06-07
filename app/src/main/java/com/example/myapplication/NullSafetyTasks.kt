package com.example.myapplication

/**
 * Вам дан код: var s: String? = null.
 * Преобразуйте его в ненулевое значение с помощью оператора elvis,
 * чтобы вместо null было значение "empty".
 */
fun nullSafetyTask3() {
    var s: String? = null ?: "empty"
    println(s) // empty
}

/**
 * Создайте функцию, которая принимает nullable параметр
 * и использует оператор !! для преобразования его в ненулевое значение.
 * Что произойдет, если вы вызовете эту функцию с null?
 */
fun nullSafetyTask4(arg: String?): String {
    return arg!! // если вызвать с null, будет NPE
}

/**
 * Создайте пользовательское исключение InvalidUserInputException,
 * которое выбрасывается, когда пользователь вводит что-то неверное.
 * Покажите, как его можно перехватить и обработать.
 */
class InvalidUserInputException(message: String) : Exception(message)

fun validateInput(input: String) {
    if (input.length > 10) // ограничение на длину строки, если строка длиннее 10 символов, выбрасывается исключение
        throw InvalidUserInputException("String is too long!")
}

fun nullSafetyTask5() {
    println("Input string (max 10 characters): ")

    val input = readln()
    try {
        validateInput(input)
    } catch (e: InvalidUserInputException) {
        e.printStackTrace() // если получено исключение, выводится стэктрейс
    } finally {
        println("String length: ${input.length}")
    }
}