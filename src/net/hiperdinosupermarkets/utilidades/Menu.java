package net.hiperdinosupermarkets.utilidades;

public class Menu {
    
    public static String menu(){

        String menu = "Eliga la opcion que quiere.\n**************************************************\n";
        menu += "\n\t1. Abrir caja\n\t2. Añadir nuevo cliente a la cola";
        menu += "\n\t3. Atender un cliente\n\t4. Ver clientes pendientes";
        menu += "\n\t5. Cerrar supermecado\n";
        menu += "\n**************************************************";
        return menu;
    }
}
