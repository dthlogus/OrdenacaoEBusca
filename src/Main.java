import controller.TxtController;
import service.TxtServiceImpl;
import service.OrdenadorNumeroImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            OrdenadorNumeroImpl ordenador = new OrdenadorNumeroImpl();
            TxtServiceImpl txtServiceImpl = new TxtServiceImpl(ordenador);
            TxtController txtController = new TxtController(txtServiceImpl, ordenador);
            txtController.escolhendoLingua();
        } catch (Exception e){
            System.out.println("Selecione uma opção valida");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            main(args);
        }
    }

}
