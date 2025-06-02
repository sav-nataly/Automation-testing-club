package com.example.myapplication.lambdas

import kotlin.math.pow

/**
 * Создайте список чисел от 1 до 10,
 * затем используйте метод filter чтобы оставить только четные числа.
 * После этого используйте метод map чтобы умножить каждое число на 2.
 */
fun lambdasTask1() {
    val intList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenList = intList.filter { it % 2 == 0 }

    val doubleList = evenList.map { it * 2 }

    println(evenList)
    println(doubleList)
}


/**
 * Создайте список строк ["один", "два", "три", "четыре", "пять"].
 * Используйте map чтобы получить длину каждого элемента списка.
 */
fun lambdasTask2() {
    val stringList = listOf("один", "два", "три", "четыре", "пять")

    val lengthList = stringList.map { it.length }

    println(lengthList)
}

/**
 * Напишите функцию высшего порядка, которая принимает два параметра:
 * целое число и функцию, принимающую целое число и возвращающую строку.
 * Эта функция должна преобразовывать число в строку с помощью переданной функции
 * и возвращать результат.
 */
fun lambdasTask3() {
    println(task3Fun(123) { a: Int -> a.toString() })
}

fun task3Fun(i: Int, operation: (Int) -> String): String {
    return operation(i)
}

/**
 * Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
 * Используйте эту лямбда-функцию в другой функции, которая принимает число и возвращает строку,
 * состоящую из числа и его квадрата (например, “5 и его квадрат равен 25”).
 */
val task4Lambda = { a: Double -> a.pow(2)}
val task41Lambda = { a: Double -> "$a и его квадрат равен ${task4Lambda(a)}"}

fun lambdasTask4() {
    println(task41Lambda(5.9))
}


/**
 * Создайте объект класса Person со свойствами name и age.
 * Создайте список из нескольких таких объектов.
 * Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 */
class Person(val name: String, val age: Int) {}

fun lambdasTask5() {
    val people = listOf(
        Person("John", 12),
        Person("Noah", 23),
        Person("Jack", 34),
        Person("James", 45),
        Person("George", 9),
    )

    val adults = people.filter { it.age > 18 }.map { it.name }

    println(adults)
}

/**
 * Используя ленивые операции, создайте последовательность чисел от 1 до 1000,
 * затем используйте filter чтобы оставить только числа, делящиеся на 5,
 * затем map чтобы умножить каждое число на 2,
 * и take чтобы взять первые 20 элементов этой последовательности.
 */
fun lambdasTask6() {
    val sequence = sequence {
        var num = 1
        while (num <= 100) {
            yield(num++) // TODO узнать что такое yield
        }
    }.filter { it % 5 == 0 }.map { it * 2 }

    println(sequence.take(20).toList())
}

/**
 * Создайте класс Car с полями make, model и year.
 * Создайте коллекцию из нескольких объектов этого класса
 * и используйте groupBy чтобы сгруппировать машины по году выпуска.
 */
class Car(val make: String, val model: String, val year: String)

fun lambdasTask7() {
    val cars = listOf(
        Car("Toyota", "Corolla", "2001"),
        Car("Tesla", "Model Y", "2003"),
        Car("Toyota", "RAV4", "2001"),
        Car("Ford", "F-Series", "2001"),
        Car("Honda", "CR-V", "2005"),
    )

    println(cars.groupBy { it.year })
}

/**
 * Создайте переменную lazyValue типа String, инициализируемую лениво.
 * Проверьте, что инициализация действительно происходит только при первом обращении к переменной.
 */
fun lambdasTask8() {
    val lazyValue: String by lazy {
        println("Initialization")
        "value"
    }

    println(lazyValue)
    println(lazyValue)
}

/**
 * Создайте функцию высшего порядка calculate, которая принимает два целых числа и функцию операции.
 * Продемонстрируйте использование calculate с разными операциями (сложение, вычитание, умножение).
 *
 */

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val sum = {a: Int, b: Int -> a + b}
val sub = {a: Int, b: Int -> a - b}
val mul = {a: Int, b: Int -> a * b}

fun lambdasTask9() {
    println(calculate(1, 2, sum))
    println(calculate(1, 2, sub))
    println(calculate(1, 20, mul))
}

/**
 * Создайте коллекцию чисел и используйте fold или reduce
 * чтобы посчитать их сумму, минимальное и максимальное значения.
 */
fun lambdasTask10() {
    val intList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listSum = intList.fold(0) { acc, i -> acc + i}
    val listMax = intList.reduce { acc, i -> if (i > acc) i else acc}
    val listMin = intList.reduce { acc, i -> if (i < acc) i else acc}

    println(listSum)
    println(listMax)
    println(listMin)
}