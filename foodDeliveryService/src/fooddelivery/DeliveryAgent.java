package fooddelivery;

import order.Order;

import java.util.ArrayList;
import java.util.List;

public class DeliveryAgent {

    private final String id;

    public String getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    private final String name;

    boolean isAvailable;

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public DeliveryAgent(String id, String name) {
        this.id = id;
        this.name = name;

        orders = new ArrayList<>();
    }

    public List<Order> orders;


}
