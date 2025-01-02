package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculatorAddition() {
        //Given

        //When
        double result = calculator.add(1, 2);
        //Then
        Assertions.assertEquals(3.0, result);
    }

    @Test
    void testCalculatorSubtraction() {
        //Given

        //When
        double result = calculator.sub(3,1);
        //Then
        Assertions.assertEquals(2.0, result);
    }

    @Test
    void testCalculatorMultiplication() {
        //Given

        //When
        double result = calculator.mul(5,5);
        //Then
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void testCalculatorDivision() {
        //Given

        //When
        double result = calculator.div(64,8);
        //Then
        Assertions.assertEquals(8.0, result);
    }
}
