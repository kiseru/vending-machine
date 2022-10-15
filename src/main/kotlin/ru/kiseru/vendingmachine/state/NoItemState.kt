package ru.kiseru.vendingmachine.state

import ru.kiseru.vendingmachine.VendingMachine

class NoItemState(
    private val vendingMachine: VendingMachine,
) : State {

    override fun addItem(count: Int) {
        vendingMachine.incrementItemCount(count)
        vendingMachine.setCurrentState(vendingMachine.hasItem)
    }

    override fun requestItem() {
        throw UnsupportedOperationException("Item out of stock")
    }

    override fun insertMoney(money: Int) {
        throw UnsupportedOperationException("Item out of stock")
    }

    override fun dispenseItem() {
        throw UnsupportedOperationException("Item out of stock")
    }
}