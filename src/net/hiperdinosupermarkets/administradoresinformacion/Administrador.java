package net.hiperdinosupermarkets.administradoresinformacion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import net.hiperdinosupermarkets.clientes.Cliente;

public class Administrador {

    private Queue<Cliente> colaClientes = new LinkedList<>();

    public void añadirClienteCola() {

        Cliente cliente = new Cliente();

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(12) + 1;

        for (int i = 1; i < numeroAleatorio; i++) {
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
}
