package Ejercicio_41;

/*
 * Ejercicio 40: persona mayor
Teniendo un array de String con el nombre de personas y otro de números con su edad, indicar quien es la persona mas mayor.
*/

public class Main{

    public static void main(String args[]){
        String nombres[] = new String[]{"Pedro", "Juan", "Pablo"};
        int edad[] = new int[]{ 50, 45, 65 };
        
        int temp=0;
        String tempString = "";

        for( int i = 0 ; i < edad.length ; i++){

            for (int j = 0 ; j < edad.length - i - 1; j++){

                if(edad[j] > edad[j+1]){
                    temp = edad[j];
                    edad[j] = edad[j+1];
                    edad[j+1] = temp;


                    tempString = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = tempString;
                }

            }

        }

        System.out.println("La persona con mayor es "+ nombres[edad.length-1]);
        
    }
}