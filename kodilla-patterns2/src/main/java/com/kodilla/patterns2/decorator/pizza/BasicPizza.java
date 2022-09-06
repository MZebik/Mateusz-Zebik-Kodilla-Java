package com.kodilla.patterns2.decorator.pizza;

public class BasicPizza implements PizzaOrder{
    @Override
    public double getCost() {
        return 15.00;
    }

    @Override
    public String getPizzaDescription() {
        return "Order a pizza";
    }
}
