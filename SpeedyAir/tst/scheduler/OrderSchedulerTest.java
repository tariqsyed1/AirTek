package scheduler;

import models.Flight;
import models.FlightSchedule;
import models.Order;
import scheduler.OrderScheduler;

import java.util.Arrays;
import java.util.List;

public class OrderSchedulerTest {

    // TODO: Refactor to use JUnit for more robust testing.

    public static void main(String[] args) {
        // Create orders
        List<Order> orders = Arrays.asList(
            new Order("order-001", "YYZ"),
            new Order("order-002", "YYZ"),
            new Order("order-003", "YYC"),
            new Order("order-004", "YVR"),
            new Order("order-005", "YYZ"),
            new Order("order-006", "YYC"),
            new Order("order-007", "YVR"),
            new Order("order-008", "YYC"),
            new Order("order-009", "YYZ"),
            new Order("order-010", "YVR")
        );

        // Create flight schedule
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addFlight(new Flight(1, "YUL", "YYZ", 1, 3)); // Flight with capacity 3
        flightSchedule.addFlight(new Flight(2, "YUL", "YYC", 1, 2)); // Flight with capacity 2
        flightSchedule.addFlight(new Flight(3, "YUL", "YVR", 1, 2)); // Flight with capacity 2

        // Create scheduler
        OrderScheduler scheduler = new OrderScheduler();

        // Schedule orders
        scheduler.scheduleOrders(orders, flightSchedule);

        System.out.println("Flight Schedule: ");
        System.out.println(flightSchedule);

        System.out.println("Order Assignments:");
        for (Order order : orders) {
            String status = order.isScheduled() ? "Scheduled" : "Not Scheduled";
            System.out.printf("Order ID: %s, Destination: %s, Status: %s", order.getOrderId(), order.getDestination(), status);
        }

    }

}
