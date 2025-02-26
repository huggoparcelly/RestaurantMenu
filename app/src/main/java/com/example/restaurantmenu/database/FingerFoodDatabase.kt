package com.example.restaurantmenu.database

import com.example.restaurantmenu.models.MenuItem

object FingerFoodDatabase {

    val fingerFoodList = listOf(
        MenuItem(1, "Batata Frita", "Porção de batatas crocantes", 12.00),
        MenuItem(2, "Coxinha", "Coxinha de frango com catupiry", 5.50),
        MenuItem(3, "Onion Rings", "Anéis de cebola empanados", 14.90),
        MenuItem(4, "Bolinho de Bacalhau", "Bolinho frito de bacalhau", 6.80),
        MenuItem(5, "Frango a Passarinho", "Porção de frango frito", 18.00),
        MenuItem(6, "Calabresa Acebolada", "Linguiça frita com cebola", 16.50),
        MenuItem(7, "Pastel de Carne", "Pastel frito recheado com carne", 4.90),
        MenuItem(8, "Bruschetta", "Pão com tomate e manjericão", 10.00),
        MenuItem(9, "Isca de Peixe", "Peixe empanado com molho tártaro", 19.90),
        MenuItem(10, "Mini Hambúrguer", "Hambúrguer pequeno com cheddar", 8.50)
    )

    fun findAll() = fingerFoodList

    fun findById(id: Int) = fingerFoodList.firstOrNull { it.id == id }
}