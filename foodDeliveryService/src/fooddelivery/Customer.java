package fooddelivery;

import order.Order;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private final String customerId;
  private final String customerName;
  private final Address address;

  private List<Order> orders;

    public Customer(String customerId, String customerName, Address address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        orders = new ArrayList<>();
    }
}
