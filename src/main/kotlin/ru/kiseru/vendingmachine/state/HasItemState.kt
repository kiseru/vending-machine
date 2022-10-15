package ru.kiseru.vendingmachine.state

import ru.kiseru.vendingmachine.VendingMachine

class HasItemState(
    private val vendingMachine: VendingMachine,
) : State {

    override fun addItem(count: Int) {
        println("$count items added")
        vendingMachine.incrementItemCount(count)
    }

    override fun requestItem() {
        if (vendingMachine.itemCount == 0) {
            vendingMachine.setCurrentState(vendingMachine.noItem)
            throw IllegalStateException("No item present")
        }
        println("Item requested")
        vendingMachine.setCurrentState(vendingMachine.itemRequested)
    }

    override fun insertMoney(money: Int) {
        throw UnsupportedOperationException("Please select item first")
    }

    override fun dispenseItem() {
        throw UnsupportedOperationException("Please select item first")
    }
}