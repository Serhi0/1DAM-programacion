/*
 */
package mario;

import bpc.daw.mario.Mario;
import bpc.daw.mario.*;

public class Ejercicio5 {
    public static void main(String[] args){
        
      Ca�on  c1= new Ca�on(300,300);
      Ca�on  c2= new Ca�on(400,400);
        
        c1.disparar(0, 0);
        c1.disparar(0, 0);
        
        c2.disparar(0, 0);
        c2.disparar(0, 0);
        c2.disparar(0, 0);
        
      int totalc1=  c1.getTotalDisparosRealizados();
      int totalc2=  c2.getTotalDisparosRealizados();
      
      System.out.println("Disparos ca�on 1: "+totalc1+" Disparos ca�on 2: "+totalc2);
        
    }
}
