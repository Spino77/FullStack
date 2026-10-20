package view;

import model.Reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleView {
    Scanner sc = new Scanner(System.in);

    public void printMenu() {
        System.out.println("1. Nova reserva\n" +
                "2. Llista de reserves\n" +
                "0. Sortir\n");
    }

    public int readOption() {
        return sc.nextInt();
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

    public void closingApp() {
        System.out.println("Tancant aplicació...");
    }

    public void printList(ArrayList<Reservation> allReservations) {
        allReservations.forEach(System.out::println);
    }
}
