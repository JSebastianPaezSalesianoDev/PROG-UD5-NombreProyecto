import net.hiperdinosupermarkets.clientes.Cliente;
import net.hiperdinosupermarkets.generador.GeneradorProductos;
import net.hiperdinosupermarkets.utilidades.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(GeneradorProductos.obtenerProductoAleatorio());

        Cliente cliente = new Cliente();
        cliente.añadirProductoCesta();
        cliente.añadirProductoCesta();
        cliente.añadirProductoCesta();
        System.out.println(cliente.toString());

        System.out.println(Menu.menu());
    }
}
