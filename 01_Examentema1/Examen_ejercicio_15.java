/*
 */
package examen_ejercicio_1;

/**
15. Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina 
el valor de las siguientes expresiones lógicas, muestra un mensaje por pantalla con el valor:
- X OR Y OR X  AND !Z AND !Y 
- (X OR !Y) AND (!X OR Z)
- !X OR !Y OR Z AND X AND !Y
 */
public class Examen_ejercicio_15 {
    public static void main(String[] args){
        
        boolean X = true, Y = false, Z = true, R;
        
        R= X || Y || X && !Z && !Y;
        System.out.println("Resultado de la primera exprexión lógica: "+R);
        
        R=(X || !Y) && (!X ||Z);
        System.out.println("Resultado de la segunda exprexión lógica: "+R);
        
        R= !X || !Y || Z && X && !Y;
        System.out.println("Resultado de la tercera exprexión lógica: "+R);
        
    }
}
