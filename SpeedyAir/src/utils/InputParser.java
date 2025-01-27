package utils;

import models.Order;
import models.Flight;
import models.FlightSchedule;
import org.json.JSONArray;
import org.json.JSONObject;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
        JSONObject jsonObject = new JSONObject(content);

        // Parse orders
        for (String key : jsonObject.keySet()) {
            JSONObject orderObject = jsonObject.getJSONObject(key);
            String destination = orderObject.getString("destination");
            orders.add(new Order(key, destination));
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
