package com.kodilla.exception.test;

import java.util.*;

public class FlightSearchEngine {
    private Map<String, Boolean> flightDestination = new HashMap<>();

    public FlightSearchEngine() {
        flightDestination.put("Okęcie", Boolean.TRUE);
        flightDestination.put("Balice", Boolean.FALSE);
        flightDestination.put("Szymany", Boolean.TRUE);
        flightDestination.put("Frankfurt", Boolean.FALSE);
        flightDestination.put("Heathrow", Boolean.TRUE);
    }

    public String findFlight(Flight flight) throws RouteNotFoundException{
      if (!flightDestination.containsKey(flight.getArrivalAirport())) {
        throw new RouteNotFoundException();
      } else if (flightDestination.get(flight.getArrivalAirport())) {
         return "Połączenie dostępne";
      } else {
          return "Połączenie niedostępne";
      }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FlightSearchEngine that = (FlightSearchEngine) o;
        return Objects.equals(flightDestination, that.flightDestination);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(flightDestination);
    }
}
