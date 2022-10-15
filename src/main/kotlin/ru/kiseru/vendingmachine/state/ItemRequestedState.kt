package ru.kiseru.vendingmachine.state

import ru.kiseru.vendingmachine.VendingMachine

class ItemRequestedState(
    private val vendingMachine: VendingMachine,
) : State {

    override fun addItem(count: Int) {
        throw UnsupportedOperationException("Item Dispense in progress")
    }

    override fun requestItem() {
        throw UnsupportedOperationException("Item already requested")
    }

    override fun insertMoney(money: Int) {
        val itemPrice = vendingMachine.itemPrice
        require(money >= itemPrice) { "Inserted money is less. Please insert $itemPrice" }
        println("Money entered is ok")
        vendingMachine.setCurrentState(vendingMachine.hasMoney)
    }

    override fun dispenseItem() {
        throw UnsupportedOperationException("Please insert money first")
    }
}