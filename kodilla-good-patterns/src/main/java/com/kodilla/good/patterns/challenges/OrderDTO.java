package com.kodilla.good.patterns.challenges;

public class OrderDTO {

    private User user;
    private OrderCreator order;
    private boolean productIsAvailable;

    public OrderDTO(User user, OrderCreator order, boolean productIsAvailable) {
        this.user = user;
        this.order = order;
        this.productIsAvailable = productIsAvailable;
    }

    public User getUser() {
        return user;
    }

    public OrderCreator getOrder() {
        return order;
    }

    public boolean isProductIsAvailable() {
        return productIsAvailable;
    }
}
