import controller.TxtController;
import service.TxtServiceImpl;
import service.OrdenadorImpl;

public class Main {

    public static void main(String[] args) {
        try {
            OrdenadorImpl ordenador = new OrdenadorImpl();
            TxtServiceImpl txtServiceImpl = new TxtServiceImpl(ordenador);
            TxtController txtController = new TxtController(txtServiceImpl, ordenador);
            txtController.escolhendoLingua();
        } catch (Exception e){
            System.out.println("Selecione uma opção valida");
            main(args);
        }
    }

}
