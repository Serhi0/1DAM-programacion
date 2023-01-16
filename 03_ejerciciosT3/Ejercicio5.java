


package tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        /*
         * Según el reglamento de la federación de caza, un cazador no puede 
         * cazar más piezas de las que se permiten en un día. Queremos hacer un
         * programa que nos lleve la cuenta de piezas cazadas e indique cuando 
         * se ha excedido el límite. Para ello primero se leerá por teclado el 
         * límite del día y a continuación los valores de las piezas cazadas en 
         * el orden que se obtienen. El programa imprimirá un mensaje en el 
         * momento en que el límite haya sido excedido. Después de que cada 
         * pieza ha sido registrada, el programa mostrará el número total de 
         * piezas que se llevan hasta ese momento cazadas.
         */
        
        int piezas=0, permitidas=0, aux=0 ;
        
        while(permitidas == 0){
            System.out.println("¿Cuántas piezas se pueden cazar hoy?");
            try{
                permitidas = new Scanner(System.in).nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage()+". Repita.");
            } 
            if(permitidas < 0){
                System.out.println("El número es negativo. Repita");
                permitidas = 0;
            }
        }
        
        while(permitidas >= aux){
            while(piezas == 0){
                System.out.println("Introduzca el número de piezas cazadas:");
                try{
                    piezas = new Scanner(System.in).nextInt();
                }catch(InputMismatchException e){
                    System.out.println("Error: "+e.getMessage()+". Repita.");
                } 
                if(piezas < 0){
                    System.out.println("Número es negativo. Repita");
                    piezas = 0;
                }
            }
            aux += piezas;
            System.out.println("Usted lleva cazadas "+aux+" piezas de "
            +permitidas+" posibles.");
            piezas = 0;
        }
        System.out.println("El número máximo de piezas ha sido excedido");
        System.out.println("Pulse \"Enter\" para finalizar");
        
        
        String finalizar = new Scanner(System.in).nextLine();
        
    }
        
}


