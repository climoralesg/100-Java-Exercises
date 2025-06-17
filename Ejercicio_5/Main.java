package Ejercicio_5;

/*
 *  Ejercicio 5: Pares entre 1 y 10
    Mostrar los números pares que hay entre el 1 y 10 (utilizando while y for).
 */

public class Main {
    public static void main(String[] args) {
        int number = 10 ;

        for (int i = 1; i <= number; i++ ){
            if(i%2==0){
                System.out.printf("El numero %d es par\n",i);
            }
        }
    }
}
