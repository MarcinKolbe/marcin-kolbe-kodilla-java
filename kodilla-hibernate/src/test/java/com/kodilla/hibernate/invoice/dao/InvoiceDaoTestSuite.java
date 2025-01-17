package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Iron");
        Product product2 = new Product("Gold");

        Item item = new Item(product, new BigDecimal(115), 2, new BigDecimal(230));
        Item item2 = new Item(product2, new BigDecimal(1500), 3, new BigDecimal(4500));

        List<Item> items = Arrays.asList(item, item2);

        Invoice invoice = new Invoice("123456", items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assertions.assertEquals(4, invoiceId);

        //CleanUp
        invoiceDao.delete(invoice);
    }
}
