public class Room {

    private final String roomId;
    private final String features;
    private final Double price;
    private boolean isSelected;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    private final RoomType type;

    public RoomType getType() {
        return type;
    }

    private boolean isAvailable;

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getFeatures() {
        return features;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Room(String roomId, String features, Double price, boolean isAvailable,RoomType type) {
        this.roomId = roomId;
        this.features = features;
        this.price = price;
        this.isAvailable = isAvailable;
        this.type = type;
    }
}
