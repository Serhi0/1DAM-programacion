/*
 */
package mario;

import bpc.daw.mario.*;
/**
 *
 * @author Sergio
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Mario m = null;
        Luigi l = null;
        Planta p = null;
        Disparo d = null;
        Cañon c = null;
        Seta s = null;
        
        m = new Mario();
        s = new Seta(20,20);
        l = new Luigi(300,300);
        p = new Planta(200,200);
        d = new Disparo(0,0,700,700);
        c = new Cañon(600,600);
        s.andarHacia(440, 400);
        
        
    }
    
}
