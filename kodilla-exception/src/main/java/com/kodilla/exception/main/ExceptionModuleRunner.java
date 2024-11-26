package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.test.*;

public class ExceptionModuleRunner {
    
    public static void main(String[] args) {

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
        Flight flight1 = new Flight("Balice", "Heathrow");
        try {
            System.out.println(flightSearchEngine.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Brak podanego lotniska!");
        } finally {
            System.out.println("Wyszukiwanie zakończone.");
        }

//        FileReader fileReader = new FileReader();
//        String fileName = "";
//        try {
//            fileReader.readFile(fileName);
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading a file!");
//        }
    }
}