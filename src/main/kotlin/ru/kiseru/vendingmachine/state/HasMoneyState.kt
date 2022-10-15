package ru.kiseru.vendingmachine.state

import ru.kiseru.vendingmachine.VendingMachine

class HasMoneyState(
    private val vendingMachine: VendingMachine,
) : State {

    override fun addItem(count: Int) {
        throw UnsupportedOperationException("Item dispense in progress")
    }

    override fun requestItem() {
        throw UnsupportedOperationException("Item dispense in progress")
    }

    override fun insertMoney(money: Int) {
        throw UnsupportedOperationException("Item out of stock")
    }

    override fun dispenseItem() {
        println("Dispensing Item")
        vendingMachine.itemCount = vendingMachine.itemCount - 1
        if (vendingMachine.itemCount == 0) {
            vendingMachine.setCurrentState(vendingMachine.noItem)
        } else {
            vendingMachine.setCurrentState(vendingMachine.hasItem)
        }
    }
}