package net.hiperdinosupermarkets.administradoresinformacion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import net.hiperdinosupermarkets.clientes.Cliente;
import net.hiperdinosupermarkets.empleados.Cajero;

public class Administrador {

    private Queue<Cliente> colaClientes = new LinkedList<>();

    public void añadirClienteCola() {

        Cliente cliente = new Cliente();

        Random rand = new Random();
        int numeroAleatorio = (rand.nextInt(1,12));

        for (int i = 0; i < numeroAleatorio; i++) {
            cliente.añadirProductoCesta();

        }
        colaClientes.add(cliente);
        System.out.println(cliente.toString());
    }

    public void atenderCliente() {

        System.out.println(colaClientes.remove());
    }

    public int obtenerNumeroClientes() {
        int numClientes = colaClientes.size();
        return numClientes;
    }

    public String mostrarClientesFila() {

        String mensaje = "";

        for (Cliente cliente : colaClientes) {
            mensaje += "- " + cliente + "\n";

        }

        return mensaje;
    }

    public boolean cerrarSuper(Cajero cajero) {

        if (colaClientes.size() == 0) {
            cajero.setEstadoCaja(false);
            System.out.println("Cerrando el super");
            return cajero.isEstadoCaja();
            
        } else {
            cajero.setEstadoCaja(true);
            System.out.println("Priemro debe atender a todos pa cerrar");
        }
        return cajero.isEstadoCaja();
    }

}
