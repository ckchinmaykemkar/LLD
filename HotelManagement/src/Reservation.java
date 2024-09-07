import java.util.List;

public class Reservation {

    private final String id;
    private final List<Customer> list;
    private final Hotel hotel;
    private final ReservationStatus reservationStatus;
    private Double totalPrice;

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public List<Customer> getList() {
        return list;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public Reservation(String id, List<Customer> list, Hotel hotel, ReservationStatus reservationStatus) {
        this.id = id;
        this.list = list;
        this.hotel = hotel;
        this.reservationStatus = reservationStatus;
    }
}
