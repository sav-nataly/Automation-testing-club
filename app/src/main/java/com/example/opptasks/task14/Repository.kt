package com.example.opptasks.task14

import com.example.opptasks.task10.User

/**
 * 14. Создайте обобщенный интерфейс Repository<T>, который содержит методы для
 * сохранения (save(item: T)), удаления (delete(item: T))
 * и получения всех элементов (getAll(): List<T>).
 * Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.
 */
interface Repository<T> {
    fun save(item: T): Boolean
    fun delete(item: T): Boolean
    fun getAll(): List<T>
}

class UserRepository : Repository<User> { // используется класс User из таска 10
    private val userList = mutableListOf<User>()

    override fun save(item: User): Boolean {
        return userList.add(item)
    }

    override fun delete(item: User): Boolean {
        return userList.remove(item)
    }

    override fun getAll(): List<User> {
        return userList
    }
}

fun oopTask14() {
    val user1 = User(1, "John")
    val user2 = User(2, "Joan")
    val user3 = User(3, "Jane")
    val user4 = User(4, "Chloe")

    val userRepository = UserRepository() // создается репозиторий, в него добавляются пользователи
    userRepository.save(user1)
    userRepository.save(user2)
    userRepository.save(user3)
    userRepository.save(user4)

    println(userRepository.getAll()) // [User(id=1, name=John), User(id=2, name=Joan), User(id=3, name=Jane), User(id=4, name=Chloe)]

    userRepository.delete(user3) // удаляется третий пользователь

    println(userRepository.getAll()) // [User(id=1, name=John), User(id=2, name=Joan), User(id=4, name=Chloe)]
}