package com.example;

/**
 * StockItem
 */
public class StockItem {

    private Product product;
    private int quantity;

    public StockItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StockItem other = (StockItem) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }

    public void decrementQuantity(int count) {
        int newQuantity = quantity - count;
        if (newQuantity < 0) {
            System.out.println("Insufficient quantity in stock");
            return;
        }
        quantity = newQuantity;
    }

    public void incrementQuantity(int count) {
        quantity += count;
    }

}