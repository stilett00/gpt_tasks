package ru.mail.telo

fun main() {
    print("Введите вес: ")
    val incomingWeihgt = readLine()?.toDoubleOrNull()
    print("Введите зону (1-3): ")
    val incomingZone = readLine()?.toIntOrNull()

    if (incomingWeihgt == null || incomingZone == null) {
        println("Ошибка ввода")
        return
    }
    if (incomingWeihgt < 0 || incomingZone !in 1..3) {
        println("Ошибка ввода")
        return
    }

    val deliveryCost = calculateDeliveryCost(
        weight = incomingWeihgt,
        zone = incomingZone)

    println("Вес посылки $incomingWeihgt кг, стоимость доставки $deliveryCost руб")
}

fun calculateDeliveryCost(weight: Double, zone: Int = 1): Double = when (zone) {
    1 -> if (weight < 1.00) 300.0 else 500.0 // зона 1: 300₽, если вес до 1 кг, иначе 500₽
    2 -> if (weight < 1.00) 500.0 else 700.0 // зона 2: 500₽, если вес до 1 кг, иначе 700₽
    else -> 1000.0 // зона 3: всегда 1000₽
}