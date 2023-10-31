package invoice

import product.Category
import product.Product

class InvoiceCalculatingService {

    fun calculateAmountTTC(products: List<Product>): Double{
        var res = DEFAULT
        for(product in products){
            product.price += addValueAddedTax(product) + addAdditionalImportTax(product)
            res += product.price
        }
        return res
    }

    private fun addValueAddedTax(product: Product): Double {
        return if(product.category == Category.OTHER) {
            roundTax(VALUE_ADDED_TAX_RATE * product.price)
        } else DEFAULT
    }

    private fun addAdditionalImportTax(product: Product): Double{
        return if(product.import){
            roundTax(ADDITIONAL_IMPORT_TAX_RATE * product.price)
        } else DEFAULT
    }

    private fun roundTax(calculatedTax: Double): Double {
        val tax = when {
            calculatedTax % 1 == 0.0 -> calculatedTax
            else -> {
                val decimalPart = calculatedTax % 1
                if (decimalPart > 0.0 && decimalPart < HALF) {
                    return calculatedTax.toInt() + HALF
                } else {
                    return calculatedTax.toInt() + 1.0
                }
            }
        }
        return tax
    }

    companion object {
        private const val VALUE_ADDED_TAX_RATE = 0.10
        private const val ADDITIONAL_IMPORT_TAX_RATE = 0.05
        private const val DEFAULT = 0.0
        private const val HALF = 0.5
    }

}