package fixtures

import product.Category
import product.Product

object Fixtures {

    private val product1 = Product("Le temps des chimères - Bernard Werber", Category.BOOK, false, 12.49)
    private val product2 = Product("The Rolling Stones - Hackney Diamonds - CD", Category.OTHER, false, 14.99)
    private val product3 = Product("Barre au chocolat", Category.FOOD, false, 0.85)
    val list1 = listOf(product1, product2, product3)

    private val product4 = Product("Boîte de chocolats Kinder", Category.FOOD, true, 10.0)
    private val product5 = Product("One Million - PACO RABANE", Category.OTHER, true, 47.50)
    val list2 = listOf(product4, product5)

    private val product6 = Product("AZZARO - WANTED", Category.OTHER, true, 27.99)
    private val product7 = Product("CHANNEL - BLUE", Category.OTHER, false, 18.99)
    private val product8 = Product("Pillules migraine apaise", Category.MEDICATION, false, 9.75)
    private val product9 = Product("Boîte de chocolats Ferrero", Category.FOOD, true, 11.25)
    val list3 = listOf(product6, product7, product8, product9)
}