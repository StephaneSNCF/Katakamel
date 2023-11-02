package invoice
import fixtures.Fixtures.list1
import fixtures.Fixtures.list3
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class InvoiceCalculatingServiceTest {

    @Test
    fun testCalculateAmountTTC() {

        val service = InvoiceCalculatingService()
        val result = service.calculateAmountTTC(list1)

        assertEquals(29.83, result)
    }

    @Test
    fun testAddValueAddedTax() {
        val service = InvoiceCalculatingService()

        val product1 = list1[0]
        val product2 = list1[1]

        val tax1 = service.addValueAddedTax(product1)
        val tax2 = service.addValueAddedTax(product2)

        assertEquals(0.0, tax1)
        assertEquals(1.50, tax2)
    }

    @Test
    fun testAddAdditionalImportTax() {
        val service = InvoiceCalculatingService()

        val product1 = list3[0]
        val product2 = list3[1]

        val tax1 = service.addAdditionalImportTax(product1)
        val tax2 = service.addAdditionalImportTax(product2)

        assertEquals(1.50, tax1)
        assertEquals(0.0, tax2)
    }

    @Test
    fun testRoundTax() {
        val service = InvoiceCalculatingService()

        val tax1 = service.roundTax(1.6)
        val tax2 = service.roundTax(2.4)
        val tax3 = service.roundTax(3.0)

        assertEquals(2.0, tax1)
        assertEquals(2.5, tax2)
        assertEquals(3.0, tax3)
    }

}