/*
 */

import bpc.daw.objetos.Caja;

public class Ejercicio09 {
    public static void main(String[] args) {
        
       Caja c = new Caja("Bienvendido al instituto");
       String m = c.getMensaje();
       
       System.out.println("el mensaje es: "+m);
       
        c.abrirCaja();
        
         m = c.getMensaje();
       System.out.println("el mensaje es: "+m);
        
       
    }
    
}
