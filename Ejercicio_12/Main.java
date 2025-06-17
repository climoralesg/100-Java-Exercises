package Ejercicio_12;

import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        System.out.println("Ingresa una cantidad de segundos");

        segundos = sc.nextInt();

        if(segundos >=60){
            
            minutos = segundos / 60;
            
            if(minutos>=60){
            
                horas = minutos / 60;
            
            }
        }

        System.out.printf("Los segundos ingresados fueron %d los que se convierten en %d minutos y en %d horas \n",segundos,minutos,horas);

    }
}

