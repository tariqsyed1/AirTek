package models;

import java.util.ArrayList;
import java.util.List;

/*
 * Data class to represent a flight.
 * Flights are identified with a flight number, origin, destination, day, and a list of orders.
 * By default, flights are initialized with no orders. Flights have a default capacity of 20 orders.
 */
public class Flight {

    private final int flightNumber;
    private final String origin;
    private final String destination;
    private final int day;
    private final int capacity;
    private final List<Order> orders;

    // Constructor
    public Flight(int flightNumber, String origin, String destination, int day, int capacity) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.day = day;
        this.capacity = capacity;
        this.orders = new ArrayList<>();
    }

    // Getters
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getDay() {
        return day;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Order> getOrders() {
        return orders;
    }

    // Add order to flight
    public boolean addOrder(Order order) {
        if (orders.size() < capacity) {
            orders.add(order);
            order.setScheduled(true);
            return true;
        }
        return false; // Flight is at capacity
    }

    @Override
    public String toString() {
        return "Flight [flightNumber=" + flightNumber + ", origin=" + origin + ", destination=" + destination + ", day="
                + day + ", capacity=" + capacity + ", orders=" + orders + "]";
    }
}
