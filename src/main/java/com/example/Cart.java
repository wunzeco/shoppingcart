package com.example;

import java.util.HashMap;

/**
 * Cart
 */
public class Cart {

    private String name;
    private HashMap<Product, Integer> items;
    private Stock stock;

    public Cart(String name) {
        this.name = name;
        this.items = new HashMap<>();
    }
    
    public String getName() {
        return name;
    }

    public HashMap<Product, Integer> getItems() {
        return items;
    } 

    public void add(String productName, int quantity) {
        // check if product is a valid stockitem and exists
        if (stock.exists(productName)) {
            items.put(stock.getItem(productName).getProduct(), quantity);
        } else {
            System.out.println("Product not in stock");
        }
    }

    public void checkOut() {

    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Product get(String productName) {
        if (!stock.exists(productName)) {
            return new Product("None", 0.0);
        }
        return stock.getItem(productName).getProduct();
    }
}