/*
 */

import bpc.daw.objetos.Caja;

public class Ejercicio11 {
    public static void main(String[] args) {
        
       Caja c1 = new Caja("Hola amigo");
       Caja c2 = new Caja("Hola compañero");
       
       c1.abrirCaja();
       c2.abrirCaja();
       
       String m1 = c1.getMensaje();
       String m2 = c2.getMensaje();
       System.out.println("el mensaje de la caja 1 es: "+m1);
       System.out.println("el mensaje de la caja 2 es: "+m2);
       
       
       boolean cambio =c1.cambiarMensaje(m2);
               cambio =c2.cambiarMensaje(m1);
               
        m1 = c1.getMensaje();
        m2 = c2.getMensaje();
        
       System.out.println("el mensaje de la caja 1 es: "+m1);
       System.out.println("el mensaje de la caja 2 es: "+m2);
       
        
       
    }
}
