package net.hiperdinosupermarkets.generador;

import java.util.Random;

public class GeneradorNombres {
    private static String[] nombres = {
        "luison",
        "luisardo",
        "luisiño",
        "luisa",
        "luisongo",
        "luisardiño",
        "luisason",
        "pepe",
        "pepa",
        "pepesado",
        "pepon",
        "peprecoz",
        "treceado",
        "catoceado",
        "quinceado",
        "diezyseseado",
        "dienysieteado",
        "diezyochado",
        "diezynuevaod",
        "finalperson"

    };

    public static String obtenerProductoAleatorio() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(nombres.length);
        return nombres[indiceAleatorio];
    }

}