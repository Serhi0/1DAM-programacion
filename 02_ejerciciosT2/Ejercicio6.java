/*
 */
package mario;

import bpc.daw.mario.Mario;
import bpc.daw.mario.*;
import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args){
        
        System.out.println("Introduzca la coordenada x entera :");
       int x = new Scanner(System.in).nextInt();
       
       System.out.println("introduzca la coordena y entera :");
       int y = new Scanner(System.in).nextInt();
       
       Mario m = new Mario(x,y);
    }
}
