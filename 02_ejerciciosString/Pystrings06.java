/*
 */
package pystrings01;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Pystrings06 {
     public static void main(String[] args){
         
        System.out.println("Escribe la primera linea: ");
        String primeraLinea = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe la segunda linea: ");
        String segundaLinea = new Scanner(System.in).nextLine();
        
        String Unidas = primeraLinea+" "+segundaLinea;
        System.out.println("Impresión de las dos lineas unidas: "+Unidas);
       
    }
}
