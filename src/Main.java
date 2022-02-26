import controller.TxtController;
import service.TxtService;
import service.OrdenadorImpl;

public class Main {

    public static void main(String[] args) {
        OrdenadorImpl ordenador = new OrdenadorImpl();
        TxtService txtService = new TxtService(ordenador);
        TxtController txtController = new TxtController(txtService);

        txtController.arrayComPortugues();

    }

}
