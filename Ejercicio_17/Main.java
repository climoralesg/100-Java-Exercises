package Ejercicio_17;
/*
 * Ejercicio 17: Mini-calculadora
Pide dos números por consola y crea un pequeño menú con las siguientes opciones:

Sumar
Restar
Multiplicar
Dividir
Módulo
Al final, debemos preguntar si queremos realizar otra operación. En caso afirmativo, el programa vuelve a empezar.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el primer numero");
            int firstNumber = sc.nextInt();

            System.out.println("Ingrese el segundo numero");
            int secondNumber = sc.nextInt();

            System.out.println("Seleccione una opcion");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Modulo");

            int option = sc.nextInt();
       
            switch (option) {
                case 1:
                    int resultSum = firstNumber + secondNumber;
                    System.out.println("El resultado es " + resultSum);
                    break;
                case 2:
                    int resultRes = firstNumber - secondNumber;
                    System.out.println("El resultado es "+ resultRes);
                    break;
                case 3:
                    int resultMul = firstNumber * secondNumber;
                    System.out.println("El resultado es "+resultMul);
                    break;
                case 4:
                    float resultDiv = (float) firstNumber / (float) secondNumber;
                    System.out.printf("El resultado es %.2f\n", resultDiv);
                    break;
                case 5:
                    int resultMod = firstNumber % secondNumber;

                    System.out.println("El resultado es "+resultMod);
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
                    break;
            }
        }

    }
}
