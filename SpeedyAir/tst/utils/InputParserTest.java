package utils;

import models.FlightSchedule;
import models.Order;
import utils.InputParser;

import java.util.List;

public class InputParserTest {

    // TODO: Refactor this class to use JUnit.

    public static void main(String[] args) {
        try {
            // Test parsing orders from JSON
            System.out.println("Testing Order Parsing");
            String ordersFilePath = "src/data/coding-assigment-orders.json";
            List<Order> orders = InputParser.parseOrders(ordersFilePath.toString());
            for (Order order : orders) {
                System.out.printf("Order ID: %s, Destination %s%n", order.getOrderId(), order.getDestination());
            }

            System.out.printf("Total Orders Parsed: %d%n", orders.size());

            // Test loading default flight schedule
            System.out.println("Testing Default Flight Schedule: ");
            FlightSchedule flightSchedule = InputParser.loadDefaultFlightSchedule();
            System.out.println(flightSchedule);

        } catch (Exception e) {
            e.printStackTrace();;
        }
    }
}
