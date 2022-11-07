/*
 */
package depositoagua;

 import bpc.daw.objetos.DepositoAgua;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        DepositoAgua d1 = new DepositoAgua(15,20);
        DepositoAgua d2 = new DepositoAgua(5,20);        
        d1.dibujar();
        d2.dibujar();
        
       boolean retira = d1.retirarLitro();
               retira = d1.retirarLitro();
               retira = d1.retirarLitro();
               retira = d1.retirarLitro();
               retira = d1.retirarLitro();
               
       boolean rellena = d2.añadirLitro();
               rellena = d2.añadirLitro();
               rellena = d2.añadirLitro();
               rellena = d2.añadirLitro();
               rellena = d2.añadirLitro();
               
       d1.dibujar();
       d2.dibujar();
               
    }
    
}
