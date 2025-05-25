package com.example.opptasks.task11

/**
 * 11. Создайте sealed class MathOperation и несколько объектов,
 * представляющих различные математические операции (например, Add, Subtract, Multiply, Divide).
 * Создайте функцию, которая принимает MathOperation и два числа,
 * и выполняет соответствующую операцию.
 */
sealed class MathOperation

class Add() : MathOperation()
class Subtract() : MathOperation()
class Multiply() : MathOperation()
class Divide() : MathOperation()

fun applyOperation(operation: MathOperation, a: Double, b: Double): Double {
    return when (operation) { // проверяется тип переданного объекта и по нему определяется операция
        is Add -> a + b
        is Subtract -> a - b
        is Multiply -> a * b
        is Divide -> a / b
    }
}

fun oopTask11() {
    println(applyOperation(Add(), 1.0, 2.0)) // 3.0
    println(applyOperation(Subtract(), 1.0, 2.0)) // -1.0
    println(applyOperation(Multiply(), 1.0, 2.0)) // 2.0
    println(applyOperation(Divide(), 1.0, 2.0)) // 0.5
}