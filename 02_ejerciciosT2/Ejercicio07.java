/*
 */
package depositoagua;

import bpc.daw.objetos.DepositoAgua;

public class DepositoAgua {

    
    public static void main(String[] args) {
        
        DepositoAgua d = new DepositoAgua(15,50);
        d.dibujar();
       int capacidad = d.getCapacidadMaxima();
       int Actual    =d.getCantidadActual();
       
       double ocupacion = (Actual*1.0/capacidad)*100 ;
       
       System.out.println("El tanto por ciento de ocupación del depósito es: "+ocupacion+"%");
    }
    
}
