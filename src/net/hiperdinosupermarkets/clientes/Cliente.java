package net.hiperdinosupermarkets.clientes;

import java.util.Stack;

import net.hiperdinosupermarkets.generador.GeneradorNombres;
import net.hiperdinosupermarkets.generador.GeneradorProductos;

public class Cliente {
    
    private String nombre;
    private int numProductos;
    Stack<String> cestaCompra = new Stack<>();

    public Cliente(){
        this.nombre = GeneradorNombres.obtenerNombreAleatorio();
        this.numProductos = cestaCompra.size();
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumProductos() {
        return this.numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public void añadirProductoCesta(){
        String nuevoProducto = GeneradorProductos.obtenerProductoAleatorio();
        cestaCompra.push(nuevoProducto);
    }

    @Override
    public String toString() {
        String mensaje;

        mensaje = "* Nombre: < " + this.nombre + " >\n";
        mensaje += "*Total de Productos: < " + cestaCompra.size() + " >\n";
        mensaje += "Lista de articulos en la lista: \n";

        for (String producto : cestaCompra) {
            mensaje += "- " + producto + "\n";
        }

        return mensaje;
    }


    
}
