package com.kodilla.testing.collection;

import com.kodilla.testing.forum.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("When numbers list is empty, then should return new empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        Integer a[] = new Integer[]{};
        List<Integer> numbers = Arrays.asList(a);

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertTrue(result.isEmpty());
    }

    @DisplayName("When number list is not empty, then should return even numbers list")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator testExterminator = new OddNumbersExterminator();
        Integer test[] = new Integer[]{3, 4, 5, 6, 7, 9, 12};
        List<Integer> numbers = Arrays.asList(test);

        //When
        List<Integer> result = testExterminator.exterminate(numbers);

        Integer expectedArrays[] = new Integer[]{4,6,12};
        List<Integer> expectedList = Arrays.asList(expectedArrays);

        //Then
        Assertions.assertEquals(expectedList, result);
    }
}
