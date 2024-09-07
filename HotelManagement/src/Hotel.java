import java.util.List;

public class Hotel {

    private final String hotelId;

    private final String name;

    private final String address;

    private final String checkInTime;

    private final String checkeOutTime;

    public List<Room> roomList;

    public String getHotelId() {
        return hotelId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public String getCheckeOutTime() {
        return checkeOutTime;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public Hotel(String hotelId, String name, String address, String checkInTime, String checkeOutTime, List<Room> roomList) {
        this.hotelId = hotelId;
        this.name = name;
        this.address = address;
        this.checkInTime = checkInTime;
        this.checkeOutTime = checkeOutTime;
        this.roomList = roomList;
    }
}
