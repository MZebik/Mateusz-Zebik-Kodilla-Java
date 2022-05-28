package com.kodilla.exception.test;

import java.awt.*;
import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args){
        FirstChallenge firstChallenge = new FirstChallenge();
        double result;

        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e){
            result = 0.0;
            System.out.println("Can't divided by 0");
        } finally {
            System.out.println("Divided is done");
        }

        System.out.println(result);
    }
}
