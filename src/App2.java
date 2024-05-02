import java.util.Scanner;

import net.hiperdinosupermarkets.clientes.Cliente;
import net.hiperdinosupermarkets.empleados.Cajero;
import net.hiperdinosupermarkets.utilidades.Menu;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Menu.menu());

        String opcionMenuString = scanner.nextLine();

        int opcionMenu = Integer.parseInt(opcionMenuString);

        boolean seguirPreguntando = true;

        Cajero cajero = new Cajero();

        while (seguirPreguntando) {

            switch (opcionMenu) {

                case 1:

                    if (cajero.isEstadoCaja() == false) {
                        cajero.setEstadoCaja(true);
                        System.out.println("Caja abierta");
                    }
                    break;
                case 2:
                    
                    break;
                default:
                    break;
            }
        }
    }
}