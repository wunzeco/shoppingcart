package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * StockItemTest
 */
public class StockItemTest {

    @Test
    public void testGetQuantity() {
        StockItem item = new StockItem(new Product("Dove Soap", 39.99), 10);
        assertEquals(item.getQuantity(), 10, "quantity does not match");
    }

    @Test
    public void testStockItemsEqual() {
        StockItem item = new StockItem(new Product("Dove Soap", 39.99), 10);
        StockItem anotherItem = new StockItem(new Product("Dove Soap", 39.99), 5);
        assertEquals(item, anotherItem, "stock items are not equal");
    }

    @Test
    public void testStockItemsNotEqual() {
        StockItem item = new StockItem(new Product("Dove Soap", 39.99), 10);
        StockItem anotherItem = new StockItem(new Product("Dove Soap", 9.99), 5);
        assertNotEquals(item, anotherItem, "stock items should not be equal");
    }
}