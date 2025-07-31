package Ejercicio_60;

/*
Ejercicio 60: Aeropuerto público (herencia)
Crea una clase AeropuertoPublico que herede de Aeropuerto y tenga atributos adicionales como:

Financiación pública
Número de trabajadores discapacitados
*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
        System.out.println(airport.toString());
        
    }

}
