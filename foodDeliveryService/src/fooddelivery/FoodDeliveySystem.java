package fooddelivery;

import order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoodDeliveySystem {

    private static FoodDeliveySystem systemInstance;

    public Map<String,Order> orderMap = new HashMap<>();

    public Map<String,DeliveryAgent> deliveryAgents =new HashMap<>();


    private final Map<String, Order> map;

    public FoodDeliveySystem() {
        this.map = new HashMap<>();
    }

    private static FoodDeliveySystem getInstance(){
        if(systemInstance==null){
            systemInstance = new FoodDeliveySystem();
        }

        return systemInstance;
    }

    public void placeOrder(Order order){
        orderMap.put(order.getOrderId(), order);
    }

    public void assignDeliveryAgent(){
        List<Order> unassignedOrders = orderMap.values().stream().filter(it->
                it.getAgent() ==null).toList();

       unassignedOrders.forEach(it->
               {
                   DeliveryAgent agent = deliveryAgents.values().stream().filter(a-> a.isAvailable).findFirst().get();
                   agent.isAvailable=false;
                   deliveryAgents.put(agent.getId(),agent);
                   it.setDeliveryAgent(agent);
               }

               );
    }


}
