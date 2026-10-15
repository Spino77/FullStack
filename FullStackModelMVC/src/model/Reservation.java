package model;

public class Reservation {
    private String name;
    private String title;

    public Reservation(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Reserva realitzada: " + name + " ha reservat " + title;
    }
}
