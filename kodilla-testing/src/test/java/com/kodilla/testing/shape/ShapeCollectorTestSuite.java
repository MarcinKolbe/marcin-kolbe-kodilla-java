package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Test of adding and removing figure")
    class AddingAndRemovingTest {
        @Test
        void addFigure() {
            //Given
            Triangle triangle = new Triangle("trójkąt", 15.20);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(triangle);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }
        @Test
        void removeFigure() {
            //Given
            Triangle triangle = new Triangle("trójkąt", 15.20);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapes.size());
        }
    }
    @Nested
    @DisplayName("Test of showing and getting figure")
    class ShowingAndGettingFigureTest {
        @Test
        void showFigures() {
            //Given
            Triangle triangle = new Triangle("trójkąt", 15.20);
            Circle circle = new Circle("koło", 7.20);
            Square square = new Square("kwadrat", 10.20);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            String expected = (triangle.getShapeName() + circle.getShapeName() + square.getShapeName());
            //When
            String retrieved = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(expected, retrieved);
        }
        @Test
        void getFigure() {
            //Given
            Triangle triangle = new Triangle("trójkąt", 15.20);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(triangle);
            //When
            Shape shape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, shape);

        }
    }
}
