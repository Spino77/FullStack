package infrastructureAdapter;

import application.ReservationRepository;
import domain.Reservation;

import java.util.ArrayList;
import java.util.List;

public class InMemoryReservationRepositoryAdapter implements ReservationRepository {
    static ArrayList<Reservation> reservationsList = new ArrayList<>();

    @Override
    public void save(Reservation reservation) {
        reservationsList.add(reservation);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationsList;
    }
}