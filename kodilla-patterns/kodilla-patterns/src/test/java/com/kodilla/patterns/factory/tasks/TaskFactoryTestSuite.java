package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        assertEquals("Next shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.PAINTING);
        shopping.executeTask();

        //Then
        assertEquals("Kitchen painting", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }
    @Test
    void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.DRIVING);
        shopping.executeTask();

        //Then
        assertEquals("Milk transport", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }
}
