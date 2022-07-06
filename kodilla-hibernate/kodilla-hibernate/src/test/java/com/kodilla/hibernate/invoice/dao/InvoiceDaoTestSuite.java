package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product smartphone = new Product("Smartphone");
        Product laptop = new Product("Laptop");

        Item item1 = new Item(smartphone, new BigDecimal(2500), 1);
        Item item2 = new Item(smartphone, new BigDecimal(1500), 2);
        Item item3 = new Item(laptop, new BigDecimal(4500), 1);

        Invoice invoice = new Invoice("123");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);

    }
}
