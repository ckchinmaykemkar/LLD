public class SellOrder extends Order{
    public SellOrder(String orderId, Stock stock, Account account, OrderStatus orderStatus) {
        super(orderId, stock, account, orderStatus);
    }

    @Override
    public void execute() {
        double totalPrice = super.getStock().getPrice() * super.getStock().getQuantity();
        getAccount().deposit(totalPrice);
        Stock st =getAccount().getPortfolio().holdings.get(getStock().getStockId());
        if(getStock().getQuantity() < st.getQuantity()){
            st = new Stock(super.getStock().getStockId(),st.getQuantity() - getStock().getQuantity(), st.getPrice()-getStock().getPrice());

            getAccount().getPortfolio().holdings.put(super.getStock().getStockId(),st);

        }else{
            getAccount().getPortfolio().holdings.remove(getStock().getStockId());
        }
        orderStatus = OrderStatus.EXECUTED;

    }
}
