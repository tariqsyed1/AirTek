package models;

import java.util.ArrayList;
import java.util.List;

/*
 * Data class to represent a flight schedule, used for managing and interacting with the list of flights.
 */
public class FlightSchedule {

    private final List<Flight> flights;

    // Constructor
    public FlightSchedule() {
        this.flights = new ArrayList<>();
    }

    // Add a flight to the schedule
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    // Retrieve all flights
    public List<Flight> getFlights() {
        return flights;
    }

    // Find flights by destination. Useful for scheduling orders based on their destination
    public List<Flight> findFlightsByDestination(String destination) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDestination().equals(destination)) {
                result.add(flight);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "FlightSchedule [flights=" + flights + "]";
    }

}
