import models.FlightSchedule;
import models.Order;
import scheduler.OrderScheduler;
import utils.InputParser;
import utils.OutputGenerator;

import java.util.List;
import java.util.ArrayList;

/*
 * Main driver class for scheduling orders and printing the output to console.
 * Using a constant of 2 days worth of flights, with three flights each, as defined in InputParser.java
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Parse the orders from the JSON file
            String filePath = "src/data/coding-assigment-orders.json";
            List<Order> orders = InputParser.parseOrders(filePath);

            // Step 2: Load default flight schedule
            FlightSchedule flightSchedule = InputParser.loadDefaultFlightSchedule();

            // Step 3: Schedule the orders
            OrderScheduler scheduler = new OrderScheduler();
            scheduler.scheduleOrders(orders, flightSchedule);

            // Step 4: Output the results to the console
            System.out.println("User Story #1: \n");
            OutputGenerator.printFlightSchedule(flightSchedule);
            System.out.println("User Story #2: \n");
            OutputGenerator.printOrderAssignments(orders, flightSchedule);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }



    }
}