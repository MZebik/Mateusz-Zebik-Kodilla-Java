package com.kodilla.patterns2.decorator.pizza;

public class BigSize extends AbstractPizzaOrderDecorator{
    protected BigSize(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public double getCost() {
        return super.getCost()+10.00;
    }
    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " in BIG size";
    }
}
