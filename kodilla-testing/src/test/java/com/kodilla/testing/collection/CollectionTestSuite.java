package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
        public void before() {
            System.out.println("Test Case begin");
        }
    @AfterEach
        public void after() {
            System.out.println("Test Case end");
        }
    @BeforeAll
        public static void beforeAll() {
            System.out.println("Collection Test Suite begin");
        }
    @AfterAll
        public static void afterAll() {
            System.out.println("Collection Test Suite end");
        }
    @DisplayName("Checks if the class behaves correctly when the list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        //When
        oddNumbersExterminator.exterminate(numbers);
        //Then
        Assertions.assertTrue(numbers.isEmpty());
    }
    @DisplayName("Checks if the class behaves correctly when the list contains even and odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 10; i++) numbers.add(i);
        //When
        oddNumbersExterminator.exterminate(numbers);
        //Then
        Assertions.assertEquals(Arrays.asList(0,2,4,6,8,10), numbers);
        //Assertions.assertArrayEquals(new Integer[]{0, 2, 4, 6, 8, 10}, numbers.toArray());
    }
}
