package Ejercicio_8;

/*
 * Ejercicio 8: Concatena palabras
Pide palabras al usuario hasta que el usuario escriba una cadena vacía. Muestra la concatenación de esas palabras al final.
 * 
 */

 import java.util.Scanner; 

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String concat="";
        String wordRead;
        
        System.out.println("Ingresa palabras hasta que sea una cadena vacia");
        while (true) {
            wordRead = sc.nextLine();      
            if( wordRead.equals("")){
                break;
            }else{
                concat = concat+wordRead; 
            }  
                      
        }

        System.out.println("Concatenacion realizada "+concat);

    }    
}
