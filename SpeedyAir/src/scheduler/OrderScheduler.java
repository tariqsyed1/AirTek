package scheduler;

import models.Flight;
import models.FlightSchedule;
import models.Order;

import java.util.List;

/*
 * Class to schedule orders into flights.
 */
public class OrderScheduler {

    /*
     * Method to schedule orders into flights by tying together the Order, Flight, and FlightSchedule classes.
     * @param orders: List of orders to fill
     * @param Flights: List of flights available to fulfil orders
     */
    public void scheduleOrders(List<Order> orders, FlightSchedule flightSchedule) {
        for (Order order : orders) {
            boolean isScheduled = false;

            // Find flights for the order's destination
            List<Flight> flights = flightSchedule.findFlightsByDestination(order.getDestination());

            // Try assigning the order to the first available flight with capacity
            for (Flight flight : flights) {
                if (flight.addOrder(order)) {
                    isScheduled = true;
                    break;
                }
            }

            // Mark order as not scheduled if no flight is available
            if (!isScheduled) {
                order.setScheduled(false);
            }
        }

    }
}
