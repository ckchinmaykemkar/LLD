public abstract class Order {
    private final String orderId;

    private final Stock stock;

    private final Account account;

    protected OrderStatus orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public Stock getStock() {
        return stock;
    }

    public Account getAccount() {
        return account;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Order(String orderId, Stock stock, Account account, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.stock = stock;
        this.account = account;
        this.orderStatus = OrderStatus.PENDING;
    }

    public abstract void execute();
}
