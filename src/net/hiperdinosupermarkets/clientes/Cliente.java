package net.hiperdinosupermarkets.clientes;

public class Cliente {
    
    private String nombre;
    private String dni;
    private int numCola;    
    private int numProductos;

    public Cliente( String nombre, String dni, int numCola, int numProductos){
        this.nombre = nombre;
        this.dni = dni;
        this.numCola = numCola;
        this.numProductos = numProductos;
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

    public int getNumProductos() {
        return this.numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }


    @Override
    public String toString() {
        String mensaje;

        mensaje = "* Nombre: < " + this.nombre + " >\n";
        mensaje += "*Total de Productos: < " + this.numProductos + " >\n";
        return "Cliente [nombre=" + nombre + ", dni=" + dni + ", numCola=" + numCola + "]";
    }


    
}
