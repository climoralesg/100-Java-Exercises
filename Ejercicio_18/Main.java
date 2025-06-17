package Ejercicio_18;

/*
 * Ejercicio 18: Cálculo de salario con puesto
Pide un salario base por consola y el puesto por consola. Calcula su sueldo sabiendo lo siguiente:

Si es vendedor, cobra 500 euros más.
Si es director, cobra 1000 euros más.
Si es conserje, cobra 100 euros más.
Utiliza un enumerado para almacenar los tipos de puesto de trabajo.

 * 
 */

import java.util.Scanner;

public class Main {

    enum POSITION {
        VENDEDOR,
        DIRECTOR,
        CONSERJE,
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un puesto de trabajo");

        POSITION job = POSITION.valueOf(sc.next().toUpperCase());

        System.out.println("Ingrese su salario base");

        int salaryBase = sc.nextInt();

        int resultSalary=0;
        switch (job) {
            case VENDEDOR:
            resultSalary = salaryBase + 500;
                break;
            case DIRECTOR:
            resultSalary = salaryBase + 1000;
                break;
            case CONSERJE:
            resultSalary = salaryBase + 100;
                break;
            default:
                System.out.println("Ninguna posicion corresponde a las aceptadas");
                break;
        }
        System.out.println("El salario del puesto ingresado es "+resultSalary);
      

    }
}
