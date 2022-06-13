package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {

    public double displayValue(double val){
        return val;
    }
}
