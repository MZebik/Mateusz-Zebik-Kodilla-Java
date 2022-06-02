package com.kodilla.good.patterns.challenges;

public class OrderRetriver {

    User user = new User("John Smith", "JSM1", "Warsaw, Poland", "Visa1234");
    Product product = new Product("iPhone 13 pro", "Smartphone");
    double quantity = 1.0;

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
