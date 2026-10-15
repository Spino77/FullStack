import controller.ReservationController;
import model.ReservationService;
import view.ConsoleView;

public class mainMVC {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        ReservationService model = new ReservationService();
        ReservationController controller = new ReservationController(model, view);

        controller.start();
    }
}