import java.util.Scanner;

import net.hiperdinosupermarkets.clientes.Cliente;
import net.hiperdinosupermarkets.empleados.Cajero;
import net.hiperdinosupermarkets.utilidades.Menu;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cajero cajero = new Cajero();

        while (true) {
            System.out.println(Menu.menu());

            String opcionMenuString = scanner.nextLine();
            int opcionMenu = Integer.parseInt(opcionMenuString);

            switch (opcionMenu) {
                case 1:
                    if (!cajero.isEstadoCaja()) {
                        cajero.setEstadoCaja(true);
                        System.out.println("Caja abierta");
                    }
                    break;
                case 2:
                    cajero.añadirClienteCola();
                    break;
                case 3:
                    

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
