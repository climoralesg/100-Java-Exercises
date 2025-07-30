package Ejercicio_59;

/*
Ejercicio 59: Mejorar llamada a constructores
En la clase Aeropuerto, mejora la llamada a los constructores usando this().
*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
        System.out.println(airport.toString());
        
    }

}
