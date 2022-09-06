package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    void testPizzaWithEverything() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new Mushrooms(theOrder);
        theOrder = new Ham(theOrder);
        theOrder = new ExtraChees(theOrder);
        theOrder = new BigSize(theOrder);
        //When
        double cost = theOrder.getCost();
        // Then
        assertEquals(42, cost);
        assertEquals("Order a pizza with mushrooms with ham with extra chees in BIG size", theOrder.getPizzaDescription());
    }

    @Test
    void testPizzaWithExtraCheesInBigSize() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraChees(theOrder);
        theOrder = new BigSize(theOrder);
        // When
        double cost = theOrder.getCost();
        // Then
        assertEquals(30, theOrder.getCost());
        assertEquals("Order a pizza with extra chees in BIG size", theOrder.getPizzaDescription());
    }
}
