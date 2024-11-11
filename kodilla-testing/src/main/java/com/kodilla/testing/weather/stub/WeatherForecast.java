package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double averageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        double sum = 0.0;
        resultMap.putAll(temperatures.getTemperatures());

        for (Map.Entry<String, Double> temperatures : resultMap.entrySet()) {
            double temp = temperatures.getValue();
            sum += temp;
        }
        return sum / resultMap.size();
    }
    public double medianTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        double result = 0.0;
        resultMap.putAll(temperatures.getTemperatures());
        Object[] tempArray = resultMap.values().toArray();
        Arrays.sort(tempArray);

        if ((tempArray.length % 2) > 0) {
            result = (double) tempArray[((tempArray.length + 1) / 2)-1];
        } else {
            result = ((double) tempArray[(tempArray.length / 2)-1] + (double) tempArray[(tempArray.length / 2)]) / 2;
        }
        return result;
    }
}