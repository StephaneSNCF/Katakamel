import fixtures.Fixtures.list1
import fixtures.Fixtures.list2
import fixtures.Fixtures.list3
import invoice.InvoiceCalculatingService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ResultTest {

    @Test
    fun testPrintResult() {
        val invoiceCalculatingService = InvoiceCalculatingService()
        val result = Result(invoiceCalculatingService)

        val result1 = result.printResult(list1)
        val result2 = result.printResult(list2)
        val result3 = result.printResult(list3)

        assertEquals(29.83, result1, 0.01)
        assertEquals(66.0, result2, 0.01)
        assertEquals(75.48, result3, 0.01)
    }


}