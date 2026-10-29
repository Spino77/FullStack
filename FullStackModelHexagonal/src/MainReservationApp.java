import application.ControllerReservation;
import application.ReservationRepository;
import domain.ReservationService;
import infrastructureAdapter.FileReservationRepositoryAdapter;
import infrastructureAdapter.InMemoryReservationRepositoryAdapter;

public class MainReservationApp {
    public static void main(String[] args) {
        ReservationRepository resRepMemory = new InMemoryReservationRepositoryAdapter();
        ControllerReservation c = new ControllerReservation();
        ReservationService resSer = new ReservationService(resRepMemory);

        //Per passar de memoria a fitxer.
        //ReservationRepository resRepFile = new FileReservationRepositoryAdapter();
        //ReservationService resSer = new ReservationService(resRepFile);

        c.start(resSer);
    }
}