package domain;

public class Reservation {
    private String name;
    private String title;

    public Reservation(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Nom: " + name + " | " + " Titol: " + title;
    }
}