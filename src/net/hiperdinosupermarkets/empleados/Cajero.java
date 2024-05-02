package net.hiperdinosupermarkets.empleados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import net.hiperdinosupermarkets.clientes.Cliente;

public class Cajero {

    private int numCaja;
    private int numClientes;
    private boolean estadoCaja = false;
    private Queue<Cliente> colaClientes = new LinkedList<>();

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public boolean isEstadoCaja() {
        return estadoCaja;
    }

    public void setEstadoCaja(boolean estadoCaja) {
        this.estadoCaja = estadoCaja;
    }

    public void añadirClienteCola() {

        Cliente cliente = new Cliente();

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(12);

        for (int i = 0; i < numeroAleatorio; i++) {
            cliente.añadirProductoCesta();

        }
        colaClientes.add(cliente);
    }

    @Override
    public String toString() {

        String mensaje = "*Numero de caja: " + this.numCaja + " > :";
        mensaje += "total clientes: < " + colaClientes.size() + " >";
        mensaje += "Clientes en fila: ";
        for (Cliente cliente : colaClientes) {
            mensaje += "- " + cliente + "\n";
        }

        return mensaje;
    }

}
