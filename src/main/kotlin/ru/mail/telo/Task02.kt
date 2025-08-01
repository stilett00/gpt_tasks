package ru.mail.telo

fun main() {
    print("Введите час: ")
    val userHour = readLine()?.toIntOrNull()
    if (userHour == null || userHour !in 0..24) {
        println("Неверный диапазон!")
        return
    }
    println(greet(hour = userHour))
}

fun greet(hour: Int = 12): String = when (hour) {
        in 5..11 -> "Доброе утро!"
        in 12..17 -> "Добрый день!"
        in 18..21 -> "Добрый вечер!"
        else -> "Спокойной ночи!"

}