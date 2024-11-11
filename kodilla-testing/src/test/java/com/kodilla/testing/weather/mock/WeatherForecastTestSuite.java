package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@DisplayName("Weather Forecast Test Suite")
@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    void beforeEach() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }
    @Mock
    private Temperatures temperaturesMock;
    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.averageTemperature();
        //Then
        Assertions.assertEquals(25.56, average);
    }
    @Test
    void testMedianTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.medianTemperature();
        //Then
        Assertions.assertEquals(25.5, median);
    }
}