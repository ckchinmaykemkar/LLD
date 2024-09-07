package fooddelivery;

public class MenuItem {

    private final String itemId;

    private final String price;

    private final String itemName;

    private final int quantity;

    public String getItemId() {
        return itemId;
    }

    public String getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public MenuItem(String itemId, String price, String itemName, int quantity) {
        this.itemId = itemId;
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
    }
}
