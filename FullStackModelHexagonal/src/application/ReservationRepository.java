package application;

import domain.Reservation;

import java.util.ArrayList;

public class ReservationRepository {
    static ArrayList<Reservation> reservationsList = new ArrayList<>();

    public static void save(Reservation reservation) {
        reservationsList.add(reservation);
    }

    public static ArrayList<Reservation> findAll() {
        return reservationsList;
    }
}