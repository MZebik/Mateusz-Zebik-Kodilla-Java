package com.kodilla.good.patterns.challenges;

public class OrderCreator {

    private User user;
    private Product product;
    private double quantity;

    public OrderCreator(User user, Product product, double quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}
