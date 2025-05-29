package com.example.opptasks.task7

/**
 * 7. Создайте класс MathUtils и перегрузите функцию add(),
 * чтобы она могла принимать два или три целых числа.
 */
class MathUtils {
    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }

        fun add(a: Int, b: Int, c: Int): Int {
            return a + b + c
        }
    }
}

fun oopTask7() {
    println(MathUtils.add(1, 2)) // 3
    println(MathUtils.add(1, 2, 3)) //6
}