package utils;

import models.Order;
import models.Flight;
import models.FlightSchedule;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import java.util.Map;

/*
 * Parse incoming orders from the coding-assignment-orders.json file, and load the default flight schedule.
 */
public class InputParser {

    /* Method responsible for parsing orders from JSON file.
     * @param filePath: File path pointing to coding-assignment-orders.json
     */
    public static List<Order> parseOrders(String filePath) throws Exception {
        List<Order> orders = new ArrayList<>();

        // Read JSON File
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        // Parse JSON into a Map
        Gson gson = new Gson();
        Map<String, Map<String, String>> jsonMap = gson.fromJson(content, Map.class);

        // Convert map into a list of orders
        for (Map.Entry<String, Map<String, String>> entry : jsonMap.entrySet()) {
            String orderId = entry.getKey();
            String destination = entry.getValue().get("destination");
            orders.add(new Order(orderId, destination));
        }

        return orders;
    }

    /* Method responsible for loading default flight schedule.
     * By default, we load two days worth of flights, where each day has three flights from YUL -> YYZ/YYC/YVR
     */
    public static FlightSchedule loadDefaultFlightSchedule() {
        FlightSchedule flightSchedule = new FlightSchedule();

        // Day 1 Flights
        flightSchedule.addFlight(new Flight(1, "YUL", "YYZ", 1, 20));
        flightSchedule.addFlight(new Flight(2, "YUL", "YYC", 1, 20));
        flightSchedule.addFlight(new Flight(3, "YUL", "YVR", 1, 20));

        // Day 2 Flights
        flightSchedule.addFlight(new Flight(4, "YUL", "YYZ", 2, 20));
        flightSchedule.addFlight(new Flight(5, "YUL", "YYC", 2, 20));
        flightSchedule.addFlight(new Flight(6, "YUL", "YVR", 2, 20));

        return flightSchedule;
    }

}
