package Ejercicio_61;

/*
Ejercicio 61: Aeropuerto privado (herencia)
Crea una clase AeropuertoPrivado que herede de Aeropuerto y tenga atributos como:

Número de socios.
*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
        System.out.println(airport.toString());
        
    }

}
