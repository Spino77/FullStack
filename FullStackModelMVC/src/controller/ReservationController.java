package controller;

import model.ReservationService;
import view.ConsoleView;

public class ReservationController {
    ReservationService rs;
    ConsoleView cv;

    public ReservationController(ReservationService rs, ConsoleView cv) {
        this.rs = rs;
        this.cv = cv;

    }

    public void start() {
        for (;;) {
            cv.printMenu();

            switch (cv.readOption()) {
                case 1 -> {
                    rs.reserve(cv.readReserve());
                }

                case 2 -> {
                    cv.printList(rs.getAllReservations());
                }
                case 0 -> {
                    System.out.println("Tancant aplicació...");
                    System.exit(1);
                }
            }
        }
    }
}