package com.example.myapplication

import kotlin.math.pow

/**
 * 1. Создайте список чисел от 1 до 10,
 * затем используйте метод filter чтобы оставить только четные числа.
 * После этого используйте метод map чтобы умножить каждое число на 2.
 */
fun lambdasTask1() {
    val intList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val resultList = intList.filter { it % 2 == 0 }.map { it * 2 }

    println(resultList) // [4, 8, 12, 16, 20]
}

/**
 * 2. Создайте список строк ["один", "два", "три", "четыре", "пять"].
 * Используйте map чтобы получить длину каждого элемента списка.
 */
fun lambdasTask2() {
    val stringList = listOf("один", "два", "три", "четыре", "пять")
    val lengthList = stringList.map { it.length }

    println(lengthList) // [4, 3, 3, 6, 4]
}

/**
 * 3. Напишите функцию высшего порядка, которая принимает два параметра:
 * целое число и функцию, принимающую целое число и возвращающую строку.
 * Эта функция должна преобразовывать число в строку с помощью переданной функции
 * и возвращать результат.
 */
fun lambdasTask3() {
    println(task3HigherOrderFun(123) { it.toString() }) // 123
}

fun task3HigherOrderFun(i: Int, operation: (Int) -> String): String { // функция высшего порядка
    return operation(i)
}

/**
 * 4. Создайте лямбда-функцию, которая принимает число и возвращает его квадрат.
 * Используйте эту лямбда-функцию в другой функции, которая принимает число и возвращает строку,
 * состоящую из числа и его квадрата (например, “5 и его квадрат равен 25”).
 */
val task4SquareLambda = { a: Double -> a.pow(2) } // лямбда, возвращающая квадрат
val task4StringLambda =
    { a: Double -> "$a и его квадрат равен ${task4SquareLambda(a)}" } // лямбда, возвращающая строку

fun lambdasTask4() {
    println(task4StringLambda(5.9)) // 5.9 и его квадрат равен 34.81
}

/**
 * 5. Создайте объект класса Person со свойствами name и age.
 * Создайте список из нескольких таких объектов.
 * Используйте filter и map чтобы получить список имен тех людей, которым больше 18 лет.
 */
class Person(val name: String, val age: Int) // объявление класса Person

fun lambdasTask5() {
    val people = listOf(
        Person("John", 12),
        Person("Noah", 23),
        Person("Jack", 34),
        Person("James", 45),
        Person("George", 9),
    )
    val adults = people.filter { it.age > 18 }.map { it.name }

    println(adults) // [Noah, Jack, James]
}

/**
 * 6. Используя ленивые операции, создайте последовательность чисел от 1 до 1000,
 * затем используйте filter чтобы оставить только числа, делящиеся на 5,
 * затем map чтобы умножить каждое число на 2,
 * и take чтобы взять первые 20 элементов этой последовательности.
 */
fun lambdasTask6() {
    val sequence = sequence {
        var num = 1
        while (num <= 1000) {
            yield(num++)
            // сначала возвращается num
            // при следующем вызове уже num увеличивается и возвращается num + 1
        }
    }
        .filter { it % 5 == 0 }
        .map { it * 2 }
    /**
     * filter и map применяются к каждому элементу последовательности
     * т.е получили элемент -> он прошел через filter и map -> получили следующий элемент
     * если бы был список (не последовательность), то filter и map применялись ко всему списку сразу
     */
    println(
        sequence.take(20).toList()
    ) // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200]
}

/**
 * 7. Создайте класс Car с полями make, model и year.
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
    // it.year аналогично car: Car -> car.year, получаем мапу Map<String, List<Car>>
    // в мапе 2001 -> [Corolla, Rav4, F-Series], 2003 -> [Model Y], 2005 -> [CR-V]
}

/**
 * 8. Создайте переменную lazyValue типа String, инициализируемую лениво.
 * Проверьте, что инициализация действительно происходит только при первом обращении к переменной.
 */
fun lambdasTask8() {
    val lazyValue: String by lazy {
        println("Initialization") // для проверки ленивой инициализации
        "value"
    }

    println(lazyValue) // Initialization\nvalue
    println(lazyValue) // value
}

/**
 * 9. Создайте функцию высшего порядка calculate, которая принимает два целых числа и функцию операции.
 * Продемонстрируйте использование calculate с разными операциями (сложение, вычитание, умножение).
 */
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

val sum = { a: Int, b: Int -> a + b }
val sub = { a: Int, b: Int -> a - b }
val mul = { a: Int, b: Int -> a * b }

fun lambdasTask9() {
    println(calculate(1, 2, sum)) // 3
    println(calculate(1, 2, sub)) // -1
    println(calculate(1, 20, mul)) // 20
}

/**
 * 10. Создайте коллекцию чисел и используйте fold или reduce
 * чтобы посчитать их сумму, минимальное и максимальное значения.
 */
fun lambdasTask10() {
    val intList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val listSum =
        intList.fold(0) { acc, i -> acc + i } // к acc добавляется каждый i, начальное значение 0
    val listMax =
        intList.reduce { acc, i -> if (i > acc) i else acc } // в acc хранится наибольшее число, с ним сравнивается каждый следующий и записывается в acc, если i > acc
    val listMin =
        intList.reduce { acc, i -> if (i < acc) i else acc } // в acc хранится наименьшее число, с ним сравнивается каждый следующий и записывается в acc, если i < acc

    println(listSum) // 55
    println(listMax) // 10
    println(listMin) // 1
}