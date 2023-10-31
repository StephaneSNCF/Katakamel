import fixtures.Fixtures.list1
import fixtures.Fixtures.list2
import fixtures.Fixtures.list3
import invoice.InvoiceCalculatingService
import product.Product

class Result(
    private val invoiceCalculatingService: InvoiceCalculatingService
){

    private fun printResult(list: List<Product>): Double{
        return invoiceCalculatingService.calculateAmountTTC(list)
    }
}

fun main(){

    PrintResult(list1)
    printResult(list2)
    printResult(list3)
}