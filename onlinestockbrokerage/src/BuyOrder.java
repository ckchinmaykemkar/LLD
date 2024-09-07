
public class BuyOrder extends Order{


    public BuyOrder(String orderId, Stock stock, Account account, OrderStatus orderStatus) {
        super(orderId, stock, account, orderStatus);
    }

    @Override
    public void execute() {

        double totalCost = getStock().getQuantity() * getStock().getPrice();
        if (getAccount().getBalance() >= totalCost) {
            getAccount().withdraw(totalCost);
            // Update portfolio and perform necessary actions
            orderStatus=OrderStatus.EXECUTED;
        } else {
            orderStatus = OrderStatus.REJECTED;
            throw new InsufficientFundsException("Insufficient funds to execute the buy order.");
        }

    }

}
