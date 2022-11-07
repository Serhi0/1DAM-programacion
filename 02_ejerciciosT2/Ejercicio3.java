/*
 */
package mario;
import bpc.daw.mario.Mario;
import bpc.daw.mario.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio3 {
    public static void main(String[] args){
        
        Mario  m = new Mario(100,100);
        Luigi  l = new Luigi(m,50);
        Seta   s = new Seta(420,20);
        Planta p = new Planta (400,400);
        Planta p1 = new Planta (p,0);
        Planta p2 = new Planta (p1, 0);
        Cañon  c = new Cañon(700,700);       
               
               s.andarHacia(0, 0);
               m.saltar();
               c.disparar(150,100);
               p.comer(true);
               p1.comer(true);
               p2.comer(true);
    }
}
