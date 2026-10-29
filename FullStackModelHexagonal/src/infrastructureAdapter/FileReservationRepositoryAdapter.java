package infrastructureAdapter;

import application.ReservationRepository;
import domain.Reservation;

import java.util.List;

public class FileReservationRepositoryAdapter implements ReservationRepository {
    @Override
    public void save(Reservation res) {

    }

    @Override
    public List<Reservation> findAll() {
        return List.of();
    }
}
