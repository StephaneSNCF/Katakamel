import fixtures.Fixtures.list1
import fixtures.Fixtures.list2
import fixtures.Fixtures.list3
import invoice.InvoiceCalculatingService
import product.Product

class Result(
    private val invoiceCalculatingService: InvoiceCalculatingService
){

    fun printResult(list: List<Product>): Double{
        return invoiceCalculatingService.calculateAmountTTC(list)
    }
}

fun printResult(result: Result, list: List<Product>): Double {
    return result.printResult(list)
}

fun main(){

    val invoiceCalculatingService = InvoiceCalculatingService()
    val result = Result(invoiceCalculatingService)

    val result1 = printResult(result, list1)
    val result2 = printResult(result, list2)
    val result3 = printResult(result, list3)

    println(result1)
    println(result2)
    println(result3)
}