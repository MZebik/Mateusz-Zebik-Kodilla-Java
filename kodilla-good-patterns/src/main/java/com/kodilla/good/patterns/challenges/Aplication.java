package com.kodilla.good.patterns.challenges;

public class Aplication {
    public static void main(String[] args){
        OrderRetriver orderRetriver = new OrderRetriver();
        OrderCreator order = new OrderCreator(orderRetriver.getUser(),orderRetriver.getProduct(),orderRetriver.getQuantity());
        ProductOrderService productOrderService = new ProductOrderService(new MailService(),order, new Storage());
        productOrderService.process(order).getUser().getName();
    }
}
