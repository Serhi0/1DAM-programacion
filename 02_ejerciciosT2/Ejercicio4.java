/*
 */
package mario;

import bpc.daw.mario.Mario;
import bpc.daw.mario.*;

public class Ejercicio4 {
    public static void main(String[] args){
        
        Luigi l = new Luigi(500);
        Mario m = new Mario(l,0);
        
        double distanciaL = l.getDistanciaOrigen();
        double distanciaM = m.getDistanciaOrigen();
        
        System.out.println("Distancia Luigi: "+distanciaL+" Distancia Mario: "+distanciaM);
    }
}
