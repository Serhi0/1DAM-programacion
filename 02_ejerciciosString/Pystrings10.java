/*
 */
package pystrings01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Pystrings10 {
    public static void main(String[] args){
        
        System.out.println("Introduce palabra (maximo 5 letras): ");
        String cadena = new Scanner(System.in).nextLine();
        
        if(cadena.length()>5){
            System.out.println("Sobrepaso el limite de 5 letras, Fin de programa.");
        }else{
            cadena = cadena.toLowerCase().replace("á","a").replace("é", "e")
            .replace("í", "i").replace("ó", "o").replace("ú", "u")
            .replace(" ", "").replace(".", "").replace(",", "");
               
            StringBuilder completa = new StringBuilder(cadena);
            completa.setLength(5); 
            cadena =""+completa;
            
            int  [] ordenar={0,0,0,0,0};
            char [] letras = cadena.toCharArray();
            int contador=0;
            char auxiliar;
            
            Arrays.sort(letras);
            cadena =""+letras[0]+letras[1]+letras[2]+letras[3]+letras[4];
            
            int numero = cadena.indexOf(letras[0], 0);
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[0], 1);
            }
            if(numero != -1){
                 contador++;
                 numero =cadena.indexOf(letras[0],2);
            } 
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[0], 3);
            }
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[0], 4);
            }
            if(numero != -1){
                 contador++;
            }                  
            
            ordenar[0]=contador;
            contador=0;
            
            numero = cadena.indexOf(letras[1], 1);
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[1], 2);
            }
            if(numero !=-1){
                 contador++;
                 numero =cadena.indexOf(letras[1],3);
            }
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[1], 4);
            }
            if(numero != -1){
                 contador++;
            }
                                  
            if(letras[0]!=letras[1]) {
                 ordenar[1]=contador;
            }
            contador=0;
            
            numero = cadena.indexOf(letras[2], 2);
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[2], 3);
            }
            if(numero !=-1){
                 contador++;
                 numero =cadena.indexOf(letras[2],4);
            }
            if(numero != -1){
                 contador++;
            }
                                  
            if(letras[2]!= letras[0] &&letras[2] != letras[1]){
                 ordenar[2]=contador;
            }
            contador=0;
            
            numero = cadena.indexOf(letras[3], 3);
            if(numero != -1){
                 contador++;
                 numero = cadena.indexOf(letras[3], 4);
            }
            if(numero != -1){
                 contador++;
            }
                                  
            if(letras[3] != letras[0] && letras[3] != letras[1] && letras[3]!= letras[2]) { 
                 ordenar[3]=contador;
            }
            contador=0;
                                  
            numero = cadena.indexOf(letras[4], 4);
            if(numero != -1){
                 contador++;
            }
            if(letras[4] != letras[3]&& letras[4] !=letras[2]&&letras[4]!=letras[1]&&letras[4]!=letras[0]){ 
                ordenar[4]=contador; 
            }    
            
            if (ordenar[0] < ordenar[1]) {
                 ordenar[0] += ordenar[1];  ordenar[1] = ordenar[0] - ordenar[1];  ordenar[0] -= ordenar[1]; 
                 auxiliar=letras[0]; letras[0]=letras[1]; letras[1]=auxiliar;   
            }
            if (ordenar[0] < ordenar[2]) {
                 ordenar[0] += ordenar[2];  ordenar[2] = ordenar[0] - ordenar[2];  ordenar[0] -= ordenar[2];
                 auxiliar=letras[0]; letras[0]=letras[2]; letras[2]=auxiliar;
            }
            if (ordenar[0] < ordenar[3]) {
                 ordenar[0] += ordenar[3];  ordenar[3] = ordenar[0] - ordenar[3];  ordenar[0] -= ordenar[3]; 
                 auxiliar=letras[0]; letras[0]=letras[3]; letras[3]=auxiliar;
            }
            if (ordenar[0] < ordenar[4]) {
                 ordenar[0] += ordenar[4];  ordenar[4] = ordenar[0] - ordenar[4];  ordenar[0] -= ordenar[4];
                 auxiliar=letras[0]; letras[0]=letras[4]; letras[4]=auxiliar;
            }
            
            if (ordenar[1] < ordenar[2]) {
                 ordenar[1] += ordenar[2];  ordenar[2] = ordenar[1] - ordenar[2];  ordenar[1] -= ordenar[2];
                 auxiliar=letras[1]; letras[1]=letras[2]; letras[2]=auxiliar;
            }
            if (ordenar[1] < ordenar[3]) {
                 ordenar[1] += ordenar[3];  ordenar[3] = ordenar[1] - ordenar[3];  ordenar[1] -= ordenar[3];
                 auxiliar=letras[1]; letras[1]=letras[3]; letras[3]=auxiliar;
            }
            if (ordenar[1] < ordenar[4]) {
                 ordenar[1] += ordenar[4];  ordenar[4] = ordenar[1] - ordenar[4];  ordenar[1] -= ordenar[4];
                 auxiliar=letras[1]; letras[1]=letras[4]; letras[4]=auxiliar;
            }
 
            if (ordenar[2] < ordenar[3]) {
                 ordenar[2] += ordenar[3];  ordenar[3] = ordenar[2] - ordenar[3];  ordenar[2] -= ordenar[3];
                 auxiliar=letras[2]; letras[2]=letras[3]; letras[3]=auxiliar;
            }
            if (ordenar[2] < ordenar[4]) {
                 ordenar[2] += ordenar[4];  ordenar[4] = ordenar[2] - ordenar[4];  ordenar[2] -= ordenar[4];
                 auxiliar=letras[2]; letras[2]=letras[4]; letras[4]=auxiliar;
            }
 
            if (ordenar[3] < ordenar[4]) {
                 ordenar[3] += ordenar[4];  ordenar[4] = ordenar[3] - ordenar[4];  ordenar[3] -= ordenar[4]; 
                 auxiliar=letras[3]; letras[3]=letras[4]; letras[4]=auxiliar;
            }
                      
            if(ordenar[0]!=0){
                 System.out.println(letras[0]+" : "+ordenar[0]+" veces");
            }
            if(ordenar[1]!=0){
                 System.out.println(letras[1]+" : "+ordenar[1]+" veces");
            }
            if(ordenar[2]!=0){
                 System.out.println(letras[2]+" : "+ordenar[2]+" veces");
            }
            if(ordenar[3]!=0){
                 System.out.println(letras[3]+" : "+ordenar[3]+" veces");
            }
            if(ordenar[4]!=0){
                 System.out.println(letras[4]+" : "+ordenar[4]+" veces");
            }
                                  
        }           
    }          
}


