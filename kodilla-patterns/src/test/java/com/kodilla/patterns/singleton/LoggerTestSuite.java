package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void getLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("log testing");
        //When
        String result = logger.getLastLog();
        //Then
        Assertions.assertEquals("log testing", result);
    }

}
