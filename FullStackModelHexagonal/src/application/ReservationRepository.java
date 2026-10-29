package application;

import domain.Reservation;
import infrastructureAdapter.InMemoryReservationRepositoryAdapter;

import java.util.ArrayList;
import java.util.List;

public interface ReservationRepository {
    void save(Reservation res);
    List<Reservation> findAll();
}