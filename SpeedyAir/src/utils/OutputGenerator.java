package utils;

import models.Flight;
import models.FlightSchedule;
import models.Order;

import java.util.List;

public class OutputGenerator {

    // Print flight schedule
    public static void printFlightSchedule(FlightSchedule flightSchedule) {
        for (Flight flight : flightSchedule.getFlights()) {
            System.out.printf("Flight: %d, departure: %s, arrival: %s, day: %d%n",
                    flight.getFlightNumber(),
                    flight.getOrigin(),
                    flight.getDestination(),
                    flight.getDay());
        }
    }

    // Print order assignments
    public static void printOrderAssignments(List<Order> orders, FlightSchedule flightSchedule) {
        for (Order order : orders) {
            if (order.isScheduled()) {
                // Find the flight that contains the order
                for (Flight flight : flightSchedule.getFlights()) {
                    if (flight.getOrders().contains(order)) {
                        System.out.printf("order: %s, flightNumber: %d, departure: %s, arrival: %s, day: %d%n",
                                order.getOrderId(),
                                flight.getFlightNumber(),
                                flight.getOrigin(),
                                flight.getDestination(),
                                flight.getDay());
                        break;
                    }
                }
            } else {
                System.out.printf("order: %s, flightNumber: not scheduled%n",
                        order.getOrderId());
            }
        }
        System.out.println();
    }

}
