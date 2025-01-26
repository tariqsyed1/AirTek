package models;

/*
 * Data class to represent an Order.
 * orderId: The ID representing an order.
 * destination: The airport code representing the destination of the order.
 * isScheduled: Boolean representing if an order is scheduled or not. False by default.
 */
public class Order {

    private final String orderId;
    private final String destination;
    private boolean isScheduled;

    // Constructor
    public Order(String orderId, String destination) {
        this.orderId = orderId;
        this.destination = destination;
        this.isScheduled = false;
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public String getDestination() {
        return destination;
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    // Setter for scheduling status
    public void setScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", destination=" + destination + ", isScheduled=" + isScheduled + "]";
    }


}
