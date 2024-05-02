package net.hiperdinosupermarkets.empleados;

import net.hiperdinosupermarkets.administradoresinformacion.Administrador;

public class Cajero {

    private int numCaja = 12;
    private boolean estadoCaja = false;
    Administrador admin = new Administrador();

    public Cajero(){
    }
    
    public Cajero(Administrador admin) {
        this.admin = admin;
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    public boolean isEstadoCaja() {
        return estadoCaja;
    }

    public void setEstadoCaja(boolean estadoCaja) {
        this.estadoCaja = estadoCaja;
    }

    @Override
    public String toString() {
        String mensaje = "* Numero de caja: " + this.numCaja + " > :";
        mensaje += " Total clientes: < " + admin.obtenerNumeroClientes() + " >";
        mensaje += " Clientes en fila: \n" + admin.mostrarClientesFila();
        return mensaje;
    }
    

}
