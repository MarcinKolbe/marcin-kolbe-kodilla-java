package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assertions.assertEquals(5.5, average);
    }
}