/**
 * Функция main для вызова функций всех заданий
 */
fun main() {
    task2()
    task3()
    task4()
    task5()
}

/**
 * Задание 2: “Hello world”
 * Создайте первую программу на Kotlin, которая выводит “Hello, world!” в консоль.
 */
fun task2() {
    println("Hello, World!") // Вывод строки в консоль
}

/**
 * Задание 3: Работа с переменными
 * Создайте несколько переменных разных типов (например, Int, String, Boolean).
 * Присвойте им значения и выведите результаты на экран.
 * Попробуйте изменить значения этих переменных и снова выведите результаты.
 */
fun task3() {
    // создание переменных нескольких типов
    var intVariable = 1
    var booleanVariable: Boolean = true
    var stringVariable = "This is string."
    var floatVariable = 1f

    // вывод значений переменных в консоль
    println("--- Original ---")
    println("Integer variable: $intVariable")
    println("Boolean variable: $booleanVariable")
    println("String variable: $stringVariable")
    println("Float variable: $floatVariable")

    // присвоение новых значений переменным
    intVariable = 2
    booleanVariable = !booleanVariable
    stringVariable = "This is also a string."
    floatVariable = 3.4f

    // вывод новых значений в консоль
    println("--- Changed ---")
    println("Integer variable: $intVariable")
    println("Boolean variable: $booleanVariable")
    println("String variable: $stringVariable")
    println("Float variable: $floatVariable")
}

/**
 * Задание 4: Работа с операторами
 * Напишите простые выражения с использованием различных операторов Kotlin
 * (арифметические, сравнения, логические).
 * Выведите результаты на экран.
 */
fun task4() {
    // создание переменных
    var a = 10
    val b = 20
    val c = 30
    val d = 40
    val e = 50

    // Операторы присваивания
    a += b
    a %= c

    // Арифметические операторы
    val equation = a + b - c * d / e;
    //Операторы сравнения и Логические операторы
    val booleanEquation = (equation > b) || ((c <= d) && !(a == b))

    // вывод значений переменных в консоль
    println("a: $a")
    println("Equation: $equation")
    println("Boolean equation: $booleanEquation")
}

/**
 * Задание 5: Комментарии и стандартный ввод/вывод
 * Добавьте комментарии к коду в ваших предыдущих заданиях.
 * Используйте и однострочные, и комментарии документации.
 *
 * Создайте новую программу, которая запрашивает у пользователя ввод из консоли,
 * сохраняет его в переменную и затем выводит эту переменную на экран.
 */
fun task5() {
    println("Input string:")
    val input = readLine() // получение строки из стандартного ввода
    println("String: $input")
}