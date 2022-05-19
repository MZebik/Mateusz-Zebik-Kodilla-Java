package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD : Shape collector test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square1" ,2);

        //When
        shapeCollector.addFigure(square);

        //Then
        assertEquals(1,shapeCollector.getShapesQuantity());
    }
    @Nested
    @DisplayName("Tests for editing collection")
    class EditingCollectionTests{


        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square1",2);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            assertTrue(result);
            assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveFigureNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square1",2);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Test for Shape Collection usage")
    class CollectionUsageTests{

        @Test
        void testGetFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square1",2);
            shapeCollector.addFigure(square);

            //When
            Shape retrivedShape = shapeCollector.getFigure(0);

            //Then
            assertEquals(square, retrivedShape);
        }

        @Test
        void testGetFigureOutOfRange(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrivedShape = shapeCollector.getFigure(2);

            //Then
            assertNull(retrivedShape);
        }

        @Test
        void testGetFigureNegativeIndex(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrivedShape = shapeCollector.getFigure(-1);

            //Then
            assertNull(retrivedShape);
        }

        @Test
        void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square1",2);
            Circle circle = new Circle("circle1", 3);
            Triangle triangle = new Triangle("triangle1", 2,3);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);

            //When
            String expectedFigures = square.getShapeName() +"\n" + circle.getShapeName()+ "\n" + triangle.getShapeName();

            //Then
            assertEquals(expectedFigures, shapeCollector.showFigures());
        }
    }
}
