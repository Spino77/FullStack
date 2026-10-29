package application;

import domain.ReservationService;

import java.util.Scanner;

public class ControllerReservation {
    Scanner sc = new Scanner(System.in);

    public void start(ReservationService res) {
        for (;;) {
            printMenu();
            switch (readOption()) {
                case 1 -> {
                    res.reserve(readReserve());
                }

                case 2 -> {
                    res.getAllReservations().forEach(System.out::println);
                }
                case 0 -> {
                    closingApp();
                    System.exit(1);
                }
            }
        }
    }

    public void printMenu() {
        System.out.println("1. Nova reserva\n" +
                "2. Llista de reserves\n" +
                "0. Sortir\n");
    }

    public int readOption() {
        return sc.nextInt();
    }

    public void closingApp() {
        System.out.println("Tancant aplicació...");
    }

    public String[] readReserve() {
        String[] data = new String[2];
        System.out.println("Introdueix el nom:");
        sc.nextLine();
        data[0] = sc.nextLine();
        System.out.println("Introdueix el títol:");
        data[1] = sc.nextLine();
        System.out.println("Reserva realitzada: '" + data[0] + "' ha reservat '" + data[1] + "'");
        return data;
    }





}
