package com.example.restaurantmenu.database

import com.example.restaurantmenu.models.MenuItem

object DrinkDatabase {

    val drinkList: List<MenuItem> = listOf(
        MenuItem(1, "Caipirinha", "Cachaça, limão e açúcar", 15.00),
        MenuItem(2, "Suco de Laranja", "Suco natural de laranja", 8.50),
        MenuItem(3, "Cerveja Artesanal", "IPA 600ml", 18.90),
        MenuItem(4, "Mojito", "Rum, hortelã, limão e soda", 16.50),
        MenuItem(5, "Água de Coco", "Água de coco natural gelada", 7.00),
        MenuItem(6, "Margarita", "Tequila, limão e licor de laranja", 19.00),
        MenuItem(7, "Refrigerante", "Coca-Cola 350ml", 6.50),
        MenuItem(8, "Vinho Tinto", "Taça de vinho tinto seco", 22.00),
        MenuItem(9, "Milkshake de Chocolate", "Leite, chocolate e sorvete", 14.90),
        MenuItem(10, "Chá Gelado", "Chá preto com limão e gelo", 9.80)
    )

    fun findAll() = drinkList

    fun findById(id: Int) = drinkList.firstOrNull { it.id == id }
}