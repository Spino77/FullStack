package domain;

import application.ReservationRepository;

import java.util.ArrayList;

public class ReservationService {
    ReservationRepository resRep;
    public ReservationService(ReservationRepository repository) {
        this.resRep = repository;
    }

    public Reservation reserve(String[] data) {
        User user = new User(data[0]);
        Book book = new Book(data[1]);

        return new Reservation(user.getName(), book.getTitle());
    }

    public ArrayList<Reservation> getAllReservations(ArrayList<Reservation> reservationsList) {
        return reservationsList;
    }
}
