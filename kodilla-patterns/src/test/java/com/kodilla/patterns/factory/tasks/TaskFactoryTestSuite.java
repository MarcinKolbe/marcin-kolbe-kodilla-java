package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask("Shopping");
        shopping.executeTask();
        //Then
        Assertions.assertEquals("shopping list", shopping.getTaskName());
        Assertions.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask("Painting");
        painting.executeTask();
        //Then
        Assertions.assertEquals("painting the kitchen", painting.getTaskName());
        Assertions.assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask("Driving");
        driving.executeTask();
        //Then
        Assertions.assertEquals("driving Mrs. Daisy", driving.getTaskName());
        Assertions.assertTrue(driving.isTaskExecuted());
    }
}
