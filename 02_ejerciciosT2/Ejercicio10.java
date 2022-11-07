/*
 */

import bpc.daw.objetos.Caja;

public class Ejercicio10 {
    public static void main(String[] args) {
        
       Caja c = new Caja("Hola amigo");
       c.abrirCaja();
       String m = c.getMensaje();
       
       System.out.println("el mensaje es: "+m);
       boolean cambio =c.cambiarMensaje("Adios amigo");
        
        
         m = c.getMensaje();
       System.out.println("el mensaje es: "+m);
        
       
    }
    
}
