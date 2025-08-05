package Ejercicio_63;

/*
Ejercicio 63: Aeropuerto abstracto
Convierte la clase Aeropuerto en abstracta y agrega el método abstracto calcularGananciasTotales(), que debe ser implementado por las clases hijas.

*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new AirportPrivate("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000, 0);
               
        Airport airport1 = new AirportPrivate("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000, 0);
         
        System.out.println(airport.compareTo(airport1));

    }

}
