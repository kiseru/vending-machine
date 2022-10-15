package ru.kiseru.vendingmachine.state

interface State {

    fun addItem(count: Int)

    fun requestItem()

    fun insertMoney(money: Int)

    fun dispenseItem()
}