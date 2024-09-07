import java.util.HashMap;
import java.util.Map;

public class SockBrokerDemo {

    public static void run(){
        StockBroker stockBroker = StockBroker.getInstance();


        User user1 = new User("U001", "John Doe");

        Stock stock1 = new Stock("S001",1,100.0);
        Stock stock2 = new Stock("S002",2,250.0);

        Map<String,Stock> holdings = new HashMap<>();
        holdings.put(stock1.getStockId(),stock1);
        holdings.put(stock2.getStockId(),stock2);
        Portfolio portfolio = new Portfolio("P001",holdings);
        Account acc = new Account("A001",user1,1000.0,portfolio);

        Order sellOrder = new SellOrder(stockBroker.generateOrderid(),stock1,acc,OrderStatus.PENDING);
    }
}
