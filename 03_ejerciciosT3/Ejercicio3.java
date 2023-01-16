


package tema3;

import java.util.Random;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        /*
         * Realiza un programa que genere números enteros aleatorios entre 0 y 
         * 10 y los muestre por pantalla. El programa terminará cuando el número 
         * generado sea el 10
         */
        
        int n = 0;
        Random r = new Random();
        
        while(n != 10){
            n =0 + r.nextInt(11-0);
            System.out.println("El numero generado es: "+n);
        }
        System.out.println("Fin de progama");
    }

}
