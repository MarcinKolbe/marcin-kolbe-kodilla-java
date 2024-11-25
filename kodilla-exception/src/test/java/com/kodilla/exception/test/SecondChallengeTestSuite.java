package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowExceptionWithProperValues(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,1.6));
    }
    @Test
    void testProbablyIWillThrowExceptionWithEdgeValues() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() ->secondChallenge.probablyIWillThrowException(1,1.8)),
                () -> assertThrows(Exception.class,() ->secondChallenge.probablyIWillThrowException(2,1.8)),
                () -> assertThrows(Exception.class, () ->secondChallenge.probablyIWillThrowException(1.5,1.5))

        );
    }
}