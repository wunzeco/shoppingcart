
package com.example;

import java.util.HashMap;

/**
 * Stock
 */
public class Stock {

    private HashMap<String, StockItem> items = new HashMap<>();

    public StockItem getItem(String productName) {
        return items.get(productName);
    }

    public HashMap<String, StockItem> getItems () {
        return items;
    }

    public int addItem(StockItem item) {
        if (exists(item.getProduct().getName())) {
            System.out.println("stock item already exists");
            return -1;
        }
        
        items.put(item.getProduct().getName(), item);
        return 0;
    }

    public int removeItem(String productName) {
        if (!exists(productName)) {
            System.out.println("stock item does not exists");
            return -1;
        }

        items.remove(productName);
        return 0;
    }

    public boolean exists(String productName) {
        if (!items.containsKey(productName)) {
            return false;
        }

        return true;
    }

}