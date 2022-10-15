package ru.kiseru.vendingmachine

fun main() {
    val vendingMachine = VendingMachine(1, 10)
    vendingMachine.requestItem()
    vendingMachine.insertMoney(10)
    vendingMachine.dispenseItem()

    println()

    vendingMachine.addItem(2)

    println()

    vendingMachine.requestItem()
    vendingMachine.insertMoney(10)
    vendingMachine.dispenseItem()
}
