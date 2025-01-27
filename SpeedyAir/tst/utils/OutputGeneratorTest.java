package utils;

import models.Flight;
import models.FlightSchedule;
import models.Order;
import scheduler.OrderScheduler;
import utils.OutputGenerator;

import java.util.List;
import java.util.Arrays;

public class OutputGeneratorTest {

    // TODO: Refactor to use JUnit.

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("order-001", "YYZ"),
                new Order("order-002", "YYZ"),
                new Order("order-003", "YYC"),
                new Order("order-004", "YVR"),
                new Order("order-005", "YYZ"),
                new Order("order-006", "YYC"),
                new Order("order-007", "YVR")
        );

        // Create flight schedule
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addFlight(new Flight(1, "YUL", "YYZ", 1, 2)); // Flight to YYZ with capacity 2
        flightSchedule.addFlight(new Flight(2, "YUL", "YYC", 1, 2)); // Flight to YYC with capacity 2
        flightSchedule.addFlight(new Flight(3, "YUL", "YVR", 1, 1)); // Flight to YVR with capacity 1

        // Schedule orders
        OrderScheduler scheduler = new OrderScheduler();
        scheduler.scheduleOrders(orders, flightSchedule);

        // Print flight schedule
        OutputGenerator.printFlightSchedule(flightSchedule);

        // Print order assignments
        OutputGenerator.printOrderAssignments(orders, flightSchedule);
    }
}
