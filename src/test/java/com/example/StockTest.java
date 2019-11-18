
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * StockITest
 */
public class StockTest {

    @Test
    public void testAddStockItem() {
        Stock stock = new Stock();
        StockItem doveSoap = new StockItem(new Product("Dove Soap", 39.99), 10);
        StockItem bread = new StockItem(new Product("Bread", 1.50), 15);
        stock.addItem(doveSoap);
        stock.addItem(bread);

        assertEquals(stock.getItem("Dove Soap"), doveSoap, "item does not exist");
        assertEquals(stock.getItem("Bread"), bread, "item does not exist");
    }

    @Test
    public void testRemoveStockItem() {
        Stock stock = new Stock();
        StockItem doveSoap = new StockItem(new Product("Dove Soap", 39.99), 10);
        StockItem bread = new StockItem(new Product("Bread", 1.50), 15);
        stock.addItem(doveSoap);
        stock.addItem(bread);
        assertEquals(stock.getItems().size(), 2);

        int expected = stock.removeItem("Dove Soap");
        assertEquals(expected, 0);
        assertEquals(stock.getItems().size(), 1);
    }
}