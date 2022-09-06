package com.kodilla.patterns2.decorator.pizza;

public class Ham extends AbstractPizzaOrderDecorator{
    protected Ham(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public double getCost() {
        return super.getCost()+7.00;
    }
    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with ham";
    }
}
