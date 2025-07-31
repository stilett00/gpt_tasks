package ru.mail.telo

fun main() {

    print("Enter the purchase amount: ")
    val amount = readLine()?.toDoubleOrNull()

    if (amount == null || amount <= 0) {
        println("Input error")
        return
    }

    val discount = calculateDiscountPrice(amount)
    val discountPrice = amount * (1 - discount)

    println("Your price after discount $discountPrice")


}

fun calculateDiscountPrice(amount: Double): Double = when {
    amount < 1000.0 -> 0.0
    amount <= 5000.0 -> 0.05
    amount <= 10000.0 -> 0.1
    else -> 0.15
}
