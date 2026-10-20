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
        data[0] = sc.next();
        System.out.println("Introdueix el títol:");
        data[1] = sc.next();
        return data;




    }

    public void printList(ArrayList<Reservation> allReservations) {
        allReservations.forEach(System.out::println);
    }
}
