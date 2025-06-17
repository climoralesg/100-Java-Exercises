package Ejercicio_14;

/*
 * Ejercicio 14: Generar números aleatorios
Genera 10 números aleatorios entre 1 y 10.

 */

public class Main {
    public static void main(String[] args) {
        
        int i = 10;

        for(int j = 0; j <= i; j++){
            int numero = (int) (Math.random() * i ) + 1;
            System.out.println(numero); 
        }        
    }
}
