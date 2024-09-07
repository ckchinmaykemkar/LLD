import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StockBroker {

    private static StockBroker instance;

    private Map<String,Stock> stocksMap = new HashMap<>();

    private Map<String,User> userMap = new HashMap<>();

    private Map<String,Account> accounts = new HashMap<>();


    public static synchronized StockBroker getInstance(){
        if(instance==null){
            instance = new StockBroker();
        }

        return instance;
    }

    public void buyStock(Stock stock,Account account,OrderStatus status){
        String orderId = generateOrderid();
        Order order = new BuyOrder(orderId,stock,account,status);
        order.execute();
    }

    public void sellStock(Stock stock,Account account,OrderStatus status){
        String orderId = generateOrderid();
        Order order = new SellOrder(orderId,stock,account,status);
        order.execute();
    }

    public void addUser(User user){
        userMap.put(user.getUserId(),user);
    }


    public String generateOrderid() {
        return "OL" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }


}
