package com.kodilla.patterns2.decorator.pizza;

public class ExtraChees extends AbstractPizzaOrderDecorator{
    protected ExtraChees(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public double getCost() {
        return super.getCost()+5.00;
    }
    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " with extra chees";
    }
}
