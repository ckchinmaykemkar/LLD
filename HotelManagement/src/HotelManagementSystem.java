import Payment.Payment;

import java.util.*;

public class HotelManagementSystem {

    public Payment payment;

    public static HotelManagementSystem instance;
    Map<String,Customer> customerMap = new HashMap<>();
    Map<String,Hotel> hotelMap = new HashMap<>();
    List<Reservation> reservationList = new ArrayList<>();


    public static synchronized HotelManagementSystem getInstance(){

            if (instance == null){
                instance = new HotelManagementSystem();
            }
            return instance;

    }

    public void addCustomer(Customer customer){
        customerMap.put(customer.getCustomerId(), customer);
    }

    public void addHotel(Hotel hotel){
        hotelMap.put(hotel.getHotelId(), hotel);
    }

    public List<Hotel> getHotelsList(){
        List<Hotel> hotelsList = new ArrayList<>();
        for(Map.Entry<String,Hotel> entry:hotelMap.entrySet()){
            hotelsList.add(entry.getValue());
        }
        return hotelsList;
    }

    public List<Hotel> getAvailableRoomsInHotel(){
        List<Hotel> hotelsList = new ArrayList();
        for(Map.Entry<String,Hotel> entry:hotelMap.entrySet()){
            entry.getValue().roomList.stream().filter(it->it.isAvailable()==true && it.isSelected()==false);
            hotelsList.add(entry.getValue());
        }

        return hotelsList;

    }

    public Reservation placeReservation(List<Customer> customer, Hotel hotel){

        Reservation reservation = new Reservation(generateReservationId(),customer,hotel,ReservationStatus.BOOKED);
        return reservation;
    }

    private String generateReservationId() {
        return "RES" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }


}
