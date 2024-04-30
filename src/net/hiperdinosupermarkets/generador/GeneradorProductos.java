package net.hiperdinosupermarkets.generador;

import java.util.Random;

public class GeneradorProductos {
    private static String[] productos = {
        "ATUN",
        "MERLUSA",
        "BANANO",
        "MANZANA",
        "DESODORANTE",
        "LECHUGA",
        "SALMON",
        "CARNE RES",
        "POLLO",
        "COCA-CULO",
        "CARNE DE PANDA",
        "CHOCOLATINA"
    };

    public static String obtenerProductoAleatorio() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(productos.length);
        return productos[indiceAleatorio];
    }

}
