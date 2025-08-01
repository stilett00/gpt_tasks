package ru.mail.telo

fun main() {

    print("Enter the purchase amount: ")
    val amount = readLine()?.toDoubleOrNull()

    if (amount == null || amount <= 0) {
        println("Ошибка ввода")
        return
    }

    val discount = calculateDiscountPrice(amount)
    val discountPrice = amount - (amount / 100 * discount)

    println("Ваша скидка %.2f%%, сумма после скидки: %.2f руб."
        .format(discount, discountPrice))


}

fun calculateDiscountPrice(amount: Double): Double = when {
    amount < 1000.0 -> 0.0
    amount <= 5000.0 -> 5.0
    amount <= 10000.0 -> 10.0
    else -> 15.0
}
