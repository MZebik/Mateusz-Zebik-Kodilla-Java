package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpresionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args){

        ExpresionExecutor expresionExecutor = new ExpresionExecutor();
        System.out.println("calculating expressions with lambdas");
        expresionExecutor.executeExpression(10,5, (a , b) -> a + b);
        expresionExecutor.executeExpression(10,5, (a , b) -> a - b);
        expresionExecutor.executeExpression(10,5, (a , b) -> a * b);
        expresionExecutor.executeExpression(10,5, (a , b) -> a / b);

        System.out.println("calculating expressions with method references");
        expresionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expresionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expresionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expresionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String text1 = poemBeautifier.beautify("text to beautify", (text) -> text.toUpperCase());
        String text2 = poemBeautifier.beautify("test", (text) -> "ABC " + text + " ABC");
        String text3 = poemBeautifier.beautify("TesT", (text) -> text.repeat(3));
        String text4 = poemBeautifier.beautify("Test text", (text) -> " :) " + text + " (: ");


        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
    }
}
