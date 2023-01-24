


package examen3;

import java.util.*;


/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio4Examen3 {

    
    public static void main(String[] args) {
        
        boolean repetir=true;
        int numero=0,i=0,j=0;
        String imprimir="",aux="";
        
        while(repetir){
            System.out.println("Introduzca número");
            try{
                numero = new Scanner(System.in).nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            }
            if(numero<0){
                System.out.println("Número negativo, repita.");
            }else{
                repetir = false;
            }
        }
       
       for(i=1;i<=numero;i++){
            for(j=1;j<=i;j++){
                imprimir += j; 
            }
            System.out.println(imprimir);
               imprimir=""; 
        }
        for(i=numero;i>=0;i--){
            for(j=1;j<=i;j++){
                imprimir += j; 
            }
            System.out.println(imprimir);
               imprimir=""; 
        }
       
    }
}
