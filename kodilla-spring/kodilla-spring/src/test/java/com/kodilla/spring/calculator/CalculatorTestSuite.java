package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

@Autowired
private Calculator calculator;
    @Test
    void testCalculations(){
        //Given
        //When
        double Add = calculator.add(2,2);
        double Sub = calculator.sub(4,2);
        double Mul = calculator.mul(2,2);
        double Div = calculator.div(4,2);

        //Then
        assertEquals(4, Add);
        assertEquals(2, Sub);
        assertEquals(4, Mul);
        assertEquals(2, Div);
    }
}
