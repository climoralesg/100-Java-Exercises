package Ejercicio_53;

/*
 * Ejercicio 53: Crear clase Avion
Crea una clase Avion con los siguientes atributos:

Modelo
Número de asientos
Velocidad máxima
Dos constructores:

Constructor vacío
Constructor completo
Métodos:

Getter y setter
toString()

 */

public class Main {
    public static void main(String args[]){
        Avion avion = new Avion();
        Avion avion2 = new Avion("Boeing", 23, 500);

        System.out.println(avion.toString());

        System.out.println(avion2.toString());

    }
    
}