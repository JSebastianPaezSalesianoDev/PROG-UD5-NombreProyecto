import java.util.Scanner;

import net.hiperdinosupermarkets.administradoresinformacion.Administrador;
import net.hiperdinosupermarkets.empleados.Cajero;
import net.hiperdinosupermarkets.utilidades.Menu;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Administrador admin = new Administrador();
        Cajero cajero = new Cajero(admin);

        while (true) {
            System.out.println("\n" + Menu.menu());

            String opcionMenuString = scanner.nextLine();
            int opcionMenu = Integer.parseInt(opcionMenuString);

            switch (opcionMenu) {
                case 1:
                    if (!cajero.isEstadoCaja()) {
                        cajero.setEstadoCaja(true);
                        System.out.println("\n\n\t****Caja abierta****");
                    }
                    break;
                case 2:

                    if (cajero.isEstadoCaja() == false) {
                        System.out.println("\n\n\t****La caja esta cerrada****");
                    } else {

                        System.out.println("Cliente añadido:\n");
                        admin.añadirClienteCola();
                    }
                    break;
                case 3:
                    if (admin.obtenerNumeroClientes() == 0) {
                        System.out.println("Ya no hay clientes que atender");
                    } else if (admin.obtenerNumeroClientes() > 0) {
                        admin.atenderCliente();
                    }
                    break;
                case 4:
                    System.out.println(cajero.toString());
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
