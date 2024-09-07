public class Stock {

    private final String stockId;

    private final int quantity;

    private final double price;

    public String getStockId() {
        return stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Stock(String stockId, int quantity, double price) {
        this.stockId = stockId;
        this.quantity = quantity;
        this.price = price;
    }
}
