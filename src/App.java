import net.hiperdinosupermarkets.clientes.Cliente;
import net.hiperdinosupermarkets.generador.GeneradorProductos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(GeneradorProductos.obtenerProductoAleatorio());

        Cliente cliente = new Cliente();
        cliente.añadirProductoCesta();
        cliente.añadirProductoCesta();
        cliente.añadirProductoCesta();
        System.out.println(cliente.toString());
    }
}
