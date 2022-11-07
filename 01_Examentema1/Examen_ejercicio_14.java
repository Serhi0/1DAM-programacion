/*
 */
package examen_ejercicio_1;

/**
 14. Hacer un programa en el que haya una variable entera llamada dinero e inicializarla a 
cualquier valor. El programa nos expresará esa cantidad en billetes de 500, 100, 50, 20 y 10 
€ y monedas de 2 y 1 €. Se ignoran los céntimos.
 */
public class Examen_ejercicio_14 {
    public static void main(String[] args){
        
        int r=0,resto, dinero =1283;
        
        r= dinero/500 ;
        System.out.println("Billetes de 500:"+r);
        
       
        resto= dinero%500;
        r = resto/100;
        System.out.println("Billetes de 100:"+r);
        
        resto %= 100;
        r = resto/50;
        System.out.println("Billetes de 50:"+r);
        
        resto %= 50;
        r = resto/20;
        System.out.println("Billetes de 20:"+r);
        
        resto %= 20;
        r = resto/10;
        System.out.println("Billetes de 10:"+r);
        
        resto %= 10;
        r= resto/2;
        System.out.println("monedas de 2:"+r);
        
        resto %=2;
        r= resto/ 1;
        System.out.println("monedas de 1:"+r);
        
    }
    
}
