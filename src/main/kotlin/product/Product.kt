package product

data class Product (
    var name: String,
    var category: Category,
    var import: Boolean,
    var price: Double
)

enum class Category{
    BOOK,
    FOOD,
    MEDICATION,
    OTHER
}