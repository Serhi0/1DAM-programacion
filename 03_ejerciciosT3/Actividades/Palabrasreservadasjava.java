


package palabrasreservadasjava;

import java.util.*;

/**
 *
 * @author Sergio
 */
public class Palabrasreservadasjava {

    
    public static void main(String[] args) {
        
        String[] lista ={"abstract","continue","for","new","switch",
                        "assert","default","goto","package","synchronized",
                        "boolean","do","if","private","this","break",	
                        "double","implements","protected","throw","byte",	
                        "else","import","public","thows","case","enum",
                        "instanceof","return","transient","catch","extends",
                        "int","short","try","char","final","interface","static",
                        "void","class","finally","long","strictfp","volatile",
                        "const","float","native","super","while"};
        
        int[] on={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        
        System.out.println("Escriba palabras reservadas en Java:");
        String comprobar = new Scanner(System.in).nextLine();
        
        int  i=0, h=0;
           
        while(i <= lista.length){
           
             if(lista[i].equals(comprobar.replaceAll("\\s+",""))){
                
                if(on[i]==0){
                   on[i] =1;
                   h += on[i];
                }
                i=0;
                
            if(lista.length > h){
               System.out.println("Correcto ("+h+"/50)");
               System.out.println("Escriba otra palabras reservadas en Java:");
               comprobar = new Scanner(System.in).nextLine();
               i =0;
              }else{
                   i= lista.length + 1;
              }
            }else{
                i++; 
                if(i== lista.length){
                    System.out.println("Incorrecto ("+h+"/50)");
                    System.out.println("Escriba otra palabras reservadas en Java:");
                    comprobar = new Scanner(System.in).nextLine();
                    i=0;
                }
            }        
        }
        System.out.println("Ha complentado toda la lista");
    }
}
