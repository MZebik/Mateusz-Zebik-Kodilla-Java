package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main ( String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator simpleCalculator = new Calculator(3,2);

        int expectedAdd = 5;

        if(expectedAdd == simpleCalculator.add()) {
            System.out.println("Addition test OK");
        } else {
            System.out.println("Addition test error!");
        }

        int expectedSub = 1;

        if(expectedSub == simpleCalculator.subtract()){
            System.out.println("Subtraction test OK");
        } else {
            System.out.println("Subtraction test error!");
        }
    }
}
