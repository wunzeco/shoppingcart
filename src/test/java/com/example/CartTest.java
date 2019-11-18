package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * CartTest
 */
public class CartTest {

    @Test
    public void testAdd() {
        Cart cart = new Cart("CustomerA");
        Stock stock = new Stock();
        stock.addItem(new StockItem(new Product("Dove Soap", 39.99), 10));
        stock.addItem(new StockItem(new Product("Beans", 5.45), 5));
        stock.addItem(new StockItem(new Product("Milk", 2.10), 25));
        cart.setStock(stock);
        cart.add("Dove Soap", 4);
        cart.add("Beans", 3);
        assertEquals(cart.getItems().size(), 2);
    }

    @Test
    public void testGet() {
        Cart cart = new Cart("CustomerA");
        Stock stock = new Stock();
        stock.addItem(new StockItem(new Product("Dove Soap", 39.99), 10));
        cart.setStock(stock);
        cart.add("Dove Soap", 4);
        assertEquals(cart.get("Dove Soap"), new Product("Dove Soap", 39.99));
    }


}