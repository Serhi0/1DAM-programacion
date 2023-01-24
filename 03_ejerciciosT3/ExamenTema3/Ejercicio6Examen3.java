


package examen3;

import java.util.*;


/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio6Examen3 {

    
    public static void main(String[] args) {
        
        int i;
   
        Integer [] lista = new Integer [5000];
        
        for(i=0;i<lista.length;i++){
            lista[i]=0;
        }
        for(i=1;i<=lista.length;i++){
            if(i%2!=0){
                lista[i-1]=1;
            }else{
                lista[i-1]=0;
            }
        }
        for(int x : lista){
            System.out.println(x);
        }
    }

}
