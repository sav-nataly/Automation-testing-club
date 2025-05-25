package com.example.opptasks.task5

/**
 * 5. В классе Person добавьте custom геттеры и сеттеры для свойств name и age.
 * Убедитесь, что вы можете управлять доступом к этим свойствам извне класса.
 * Например, вы можете реализовать проверку возраста в сеттере,
 * чтобы убедиться, что возраст неотрицательный.
 */
class Person {
    var name: String = "Default name"
        set(value) {
            if (value.isNotEmpty() && value != field) // проверка, что имя не пустая строка и изменилось относительно текущего
                field = value
        }
        get() = field

    var age: Int = 0
        set(value) {
            if (value > 0) // проверка, что возраст неотрицательный
                field = value
        }
        get() = field

    override fun toString(): String {
        return "Person: name = $name, age = $age"
    }
}

fun oopTask5() {
    val person = Person()
    person.name = ""
    person.age = -23
    println(person) // Person: name = Default name, age = 0

    person.name = "John Doe"
    person.age = 23
    println(person) // Person: name = John Doe, age = 23
}