package ru.kiseru.vendingmachine

import ru.kiseru.vendingmachine.state.*

class VendingMachine(
    var itemCount: Int,
    val itemPrice: Int,
) {

    val hasItem: State = HasItemState(this)

    val itemRequested: State = ItemRequestedState(this)

    val hasMoney: State = HasMoneyState(this)

    val noItem: State = NoItemState(this)

    private var currentState = hasItem

    fun requestItem() {
        currentState.requestItem()
    }

    fun addItem(count: Int) {
        currentState.addItem(count)
    }

    fun insertMoney(money: Int) {
        currentState.insertMoney(money)
    }

    fun dispenseItem() {
        currentState.dispenseItem()
    }

    fun incrementItemCount(count: Int) {
        println("Adding $count items")
        itemCount += count
    }

    fun setCurrentState(currentState: State) {
        this.currentState = currentState
    }
}