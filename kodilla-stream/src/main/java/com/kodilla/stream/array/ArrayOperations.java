package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        OptionalDouble averageOfNumbers = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
        double result = averageOfNumbers.getAsDouble();
        return result;
    }
}
