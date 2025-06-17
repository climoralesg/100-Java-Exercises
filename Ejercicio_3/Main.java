/*
 * 3.Suma, resta, multiplicación, división y módulo
Pide dos números por consola y muestra su suma, resta, multiplicación y división.
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola! Ingresa un numero");
        int firstNumber = sc.nextInt();
        System.out.println("Ahora ingresa el segundo");
        int secondNumber = sc.nextInt();

        int suma = firstNumber + secondNumber;
        int resta = firstNumber - secondNumber;
        int multiplicación = firstNumber * secondNumber;
        float division = (float)firstNumber / (float)secondNumber;

        System.out.printf("Suma: %d\n", suma);
        System.out.printf("Resta %d\n", resta);
        System.out.printf("Multiplicacion %d\n", multiplicación);
        System.out.printf("Division %.2f \n", division);


    }
}
