package Ejercicio_57;

/*
    Ejercicio 57: Atributo estático en Aeropuerto
    Añade un atributo estático id en la clase Aeropuerto que se incrementa cada vez que se crea un nuevo objeto de Aeropuerto.
*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);

        System.out.println(airport.getId());
        Airport airport1 = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
        System.out.println(airport1.getId());
    }

}
