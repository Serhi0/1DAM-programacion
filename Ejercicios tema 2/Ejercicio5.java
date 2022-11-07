/*
 */
package mario;

import bpc.daw.mario.Mario;
import bpc.daw.mario.*;

public class Ejercicio5 {
    public static void main(String[] args){
        
      Cañon  c1= new Cañon(300,300);
      Cañon  c2= new Cañon(400,400);
        
        c1.disparar(0, 0);
        c1.disparar(0, 0);
        
        c2.disparar(0, 0);
        c2.disparar(0, 0);
        c2.disparar(0, 0);
        
      int totalc1=  c1.getTotalDisparosRealizados();
      int totalc2=  c2.getTotalDisparosRealizados();
      
      System.out.println("Disparos cañon 1: "+totalc1+" Disparos cañon 2: "+totalc2);
        
    }
}
