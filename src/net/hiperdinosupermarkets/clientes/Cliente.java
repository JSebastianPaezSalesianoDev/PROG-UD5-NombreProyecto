package net.hiperdinosupermarkets.clientes;

public class Cliente {
    
    private String nombre;
    private String dni;
    private int numCola;    

    public Cliente( String nombre, String dni, int numCola){
        this.nombre = nombre;
        this.dni = dni;
        this.numCola = numCola;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumCola() {
        return numCola;
    }

    public void setNumCola(int numCola) {
        this.numCola = numCola;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + ", numCola=" + numCola + "]";
    }

    
}
