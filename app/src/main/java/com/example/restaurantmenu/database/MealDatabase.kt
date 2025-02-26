package com.example.restaurantmenu.database

import com.example.restaurantmenu.models.MenuItem

object MealDatabase {

    val mealsList: List<MenuItem> = listOf(
        MenuItem(1, "Spaghetti Bolognese", "Massa com molho de carne tradicional", 25.90),
        MenuItem(2, "Frango Grelhado", "Peito de frango grelhado com legumes", 22.50),
        MenuItem(3, "Feijoada", "Feijão preto com carnes e acompanhamentos", 29.90),
        MenuItem(4, "Lasanha", "Camadas de massa, carne e queijo", 27.80),
        MenuItem(5, "Strogonoff de Carne", "Carne com creme de leite e arroz", 24.60),
        MenuItem(6, "Salmão Grelhado", "Filé de salmão com molho de ervas", 35.00),
        MenuItem(7, "Risoto de Funghi", "Arroz arbóreo com cogumelos", 28.90),
        MenuItem(8, "Parmegiana", "Filé à milanesa com molho e queijo", 26.50),
        MenuItem(9, "Moqueca de Peixe", "Peixe com leite de coco e dendê", 32.00),
        MenuItem(10, "Pizza Margherita", "Molho de tomate, muçarela e manjericão", 30.00)
    )

    fun findAll() = mealsList

    fun findById(id: Int) = mealsList.firstOrNull { it.id == id }
}