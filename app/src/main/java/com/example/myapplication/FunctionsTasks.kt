package com.example.myapplication

/**
 * Задание 1: Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов
 * и возвращает наибольшее число.
 * Затем, используйте эту функцию для поиска максимального числа из двух разных пар чисел.
 */
fun maxOfTwo(a: Int, b: Int): Int {
    return if (a >= b) a else b
}

fun functionsTask1() {
    println( // вызов функции maxOfTwo, параметрами которой являются результаты двух других вызовов
        maxOfTwo(
            maxOfTwo(1, 2), maxOfTwo(3, 4)
        )
    )
}

/**
 * Задание 2: Создайте функцию sayHello, которая принимает строковый аргумент name и
 * возвращает приветственное сообщение. Функция должна иметь параметр по умолчанию "мир".
 * Затем вызовите функцию дважды: с именем и без имени.
 */
fun sayHello(name: String = "мир"): String {
    return "Привет, $name!"
}

fun functionsTask2() {
    println(sayHello())
    println(sayHello("Наталья"))
}

/**
 * Задание 3: Создайте инфиксную функцию isGreater , которая принимает два числа и возвращает true,
 * если первое число больше второго, и false в противном случае.
 * Затем используйте эту функцию, сравнив две пары чисел.
 */
infix fun Int.isGreater(other: Int): Boolean {
    return this > other
}

fun functionsTask3() {
    println(2 isGreater 3)
    println(5 isGreater -3)
}

/**
 *
 *  Задание 4: Создайте рекурсивную функцию generateSequence,
 *  которая принимает целое число n и генерирует последовательность чисел от 1 до n.
 *  Используйте аннотацию tailrec для оптимизации.
 */
tailrec fun generateSequence(n: Int, list: MutableList<Int> = mutableListOf()): MutableList<Int> {
    // пока n не стало меньше 1, добавляем текущее n в начало списка и вызываем рекурсивно функцию
    if (n > 0) {
        list.add(0, n)
        return generateSequence(n - 1, list)
    }
    // как только n == 0, возвращаем список (последний вызов функции)
    return list
}

fun functionsTask4() {
    println(generateSequence(5))
}

/**
 *  Задание 5: Создайте список имен и используйте функции let, run, also, apply и with
 *  для выполнения различных операций над этим списком
 *  (например, добавьте имя, удалите имя, переверните список и т. д.).
 */
fun functionsTask5() {
    val list = mutableListOf(
        "Arnbjorn",
        "Astrid",
        "Babette",
        "Cicero",
        "Festus",
        "Gabriella",
        "Lis",
        "Lucien",
        "Nazir",
        "Shadowmere",
        "Veezara"
    )

    // использование let: первые 5 элементов списка переворачиваются и выводятся в консоль
    list.subList(0, 5).let {
        it.reverse()
        println(it)
    }

    // использование run: удаляется второй элемент списка (индекс 1), список выводится в консоль
    list.run {
        removeAt(1)
        println(this)
    }

    // использование also: к списку добавляется элемент (по индексу), удаляется другой элемент, выводится в консоль
    list.also {
        it.add(4, "Dragonborn")
        it.remove("Lis")
        println(it)
    }

    // использование apply: список очищается, потом в список добавляются новые элементы
    println(list.apply { // так как apply возвращает объект, вызов apply происходит внутри println()
        clear()
        addAll(mutableListOf("Lucien", "Shadowmere", "Arquen", "Mathieu", "J'Ghasta", "Teinaava"))
    })

    // использование with: в список добавляются два новых элемента, и список паереворачивается
    with(list) {
        add("Ocheeva")
        add("Vicente")
        reverse()
        println(this)
    }
}