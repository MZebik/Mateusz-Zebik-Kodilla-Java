package com.kodilla.good.patterns.challenges;

public class OrderCreator {

    User user;
    Product product;
    double quantity;

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
