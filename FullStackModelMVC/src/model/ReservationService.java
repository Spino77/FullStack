package model;

import java.util.ArrayList;

public class ReservationService {

    ArrayList<Reservation> reservationsList = new ArrayList<>();

    public void reserve(String[] data) {
        User user = new User(data[0]);
        Book book = new Book(data[1]);
        Reservation reservation = new Reservation(user.getName(), book.getTitle());
        reservationsList.add(reservation);
    }

    public ArrayList<Reservation> getAllReservations() {
        return reservationsList;
    }
}
