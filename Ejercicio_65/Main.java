package Ejercicio_65;

/*
Ejercicio 65: Interfaces en Avión
Crea la interfaz Activable para la clase Avión que permita saber si un avión está preparado para volar. La interfaz tendrá un método isReadyToFly().

*/

public class Main {

    public static void main(String args[]) {
        Airport airport = new Airport("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);
        Activable airplane = new Airplane("Boeing 207", 207, 1070);
        System.out.println(airplane.toString());

        airplane.isReadyToFly();
        System.out.println(airplane.toString());
    }

}
