package Ejercicio_64;

/*
Ejercicio 64: Método final en Aeropuerto
Haz que el método calcularAnio() de la clase Aeropuerto sea final, de forma que no pueda ser sobrescrito por las clases hijas.

*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
        System.out.println(airport.toString());
        
    }

}
