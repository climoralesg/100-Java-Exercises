package Ejercicio_58;

/*
Ejercicio 58: Equals y compareTo en Aeropuerto
Implementa los métodos equals() y compareTo() en la clase Aeropuerto para que puedan compararse aeropuertos por nombre y año de inauguración.

*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
       
        Airport airport1 = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
         
        System.out.println(airport.compareTo(airport1));

        System.out.println(airport.equals(airport1));
    }

}
