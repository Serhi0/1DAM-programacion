


package examen3;

import java.util.*;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio3Examen3 {
    
    public static void main(String[] args) {
        
        int i, j;
        String  imprimir="";
        
        for(i=8;i>0;i--){
            for(j=0;j<i;j++){
                imprimir += "*"; 
            }
            System.out.println(imprimir);
            imprimir="";
        }
    }
}
