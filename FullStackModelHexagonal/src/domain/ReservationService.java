package domain;

import application.ReservationRepository;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    ReservationRepository resRep;
    public ReservationService(ReservationRepository repository) {
        this.resRep = repository;
    }

    public void reserve(String[] data) {
        User user = new User(data[0]);
        Book book = new Book(data[1]);

        Reservation res = new Reservation(user.getName(), book.getTitle());

        resRep.save(res);
    }

    public List<Reservation> getAllReservations() {
        return resRep.findAll();
    }
}
