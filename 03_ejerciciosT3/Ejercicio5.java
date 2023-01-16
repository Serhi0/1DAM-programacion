


package tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        /*
         * Seg�n el reglamento de la federaci�n de caza, un cazador no puede 
         * cazar m�s piezas de las que se permiten en un d�a. Queremos hacer un
         * programa que nos lleve la cuenta de piezas cazadas e indique cuando 
         * se ha excedido el l�mite. Para ello primero se leer� por teclado el 
         * l�mite del d�a y a continuaci�n los valores de las piezas cazadas en 
         * el orden que se obtienen. El programa imprimir� un mensaje en el 
         * momento en que el l�mite haya sido excedido. Despu�s de que cada 
         * pieza ha sido registrada, el programa mostrar� el n�mero total de 
         * piezas que se llevan hasta ese momento cazadas.
         */
        
        int piezas=0, permitidas=0, aux=0 ;
        
        while(permitidas == 0){
            System.out.println("�Cu�ntas piezas se pueden cazar hoy?");
            try{
                permitidas = new Scanner(System.in).nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage()+". Repita.");
            } 
            if(permitidas < 0){
                System.out.println("El n�mero es negativo. Repita");
                permitidas = 0;
            }
        }
        
        while(permitidas >= aux){
            while(piezas == 0){
                System.out.println("Introduzca el n�mero de piezas cazadas:");
                try{
                    piezas = new Scanner(System.in).nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Error: "+e.getMessage()+". Repita.");
                } 
                if(piezas < 0){
                    System.out.println("N�mero es negativo. Repita");
                    piezas = 0;
                }
            }
            aux += piezas;
            System.out.println("Usted lleva cazadas "+aux+" piezas de "
            +permitidas+" posibles.");
            piezas = 0;
        }
        System.out.println("El n�mero m�ximo de piezas ha sido excedido");
        System.out.println("Pulse \"Enter\" para finalizar");
        
        
        String finalizar = new Scanner(System.in).nextLine();
        
    }
        
}


