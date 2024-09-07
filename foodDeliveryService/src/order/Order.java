package order;

import fooddelivery.Customer;
import fooddelivery.DeliveryAgent;
import fooddelivery.Restaurant;

import java.time.LocalDateTime;

public class Order {

    private final String orderId;

    private final LocalDateTime dateTime;

    private final OrderStatus orderStatus;

    private  DeliveryAgent agent;

    public DeliveryAgent getAgent() {
        return agent;
    }

    private final Customer customer;

    private final Restaurant restaurant;

    public Double totalPrice;

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setDeliveryAgent(DeliveryAgent agent){
        this.agent = agent;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Order(String orderId, LocalDateTime dateTime, OrderStatus orderStatus, Customer customer, Restaurant restaurant) {
        this.orderId = orderId;
        this.dateTime = dateTime;
        this.orderStatus = orderStatus;
        this.customer = customer;
        this.restaurant = restaurant;
    }
}
