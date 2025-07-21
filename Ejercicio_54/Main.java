package Ejercicio_54;
/*

Ejercicio 54: Crear clase Aeropuerto
Crea una clase Aeropuerto con los siguientes atributos:

Nombre
País
Calle
Número
Ciudad
Año de inauguración
Capacidad
Dos constructores:

Constructor vacío
Constructor completo
Métodos:

Getter y setter
aniosAbierto() que devuelve el número de años que ha estado abierto.
toString()

*/

public class Main {
    public static void main(String args[]) {

        Aeropuerto aeropuerto = new Aeropuerto("Benitez", "Chile", "Calle angosta", 1058, "Santiago", 2002, 10000000);

        System.out.println(aeropuerto.getYearsOpen());
        System.out.println(aeropuerto.toString());
      
    }
}