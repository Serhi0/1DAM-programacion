


package juegotrivialbucle;

import java.util.*;
/**
 *
 * @author Sergio
 */
public class Juegotrivialbucle {

    
    public static void main(String[] args) {


        System.out.println("     ____.                                 .___     .__      __         .__      .__       .__    \n" +
"    |    |__ __   ____   ____   ____     __| _/____ |  |   _/  |________|__|__  _|__|____  |  |   \n" +
"    |    |  |  \\_/ __ \\ / ___\\ /  _ \\   / __ |/ __ \\|  |   \\   __\\_  __ \\  \\  \\/ /  \\__  \\ |  |   \n" +
"/\\__|    |  |  /\\  ___// /_/  >  <_> ) / /_/ \\  ___/|  |__  |  |  |  | \\/  |\\   /|  |/ __ \\|  |__ \n" +
"\\________|____/  \\___  >___  / \\____/  \\____ |\\___  >____/  |__|  |__|  |__| \\_/ |__(____  /____/ \n" +
"                     \\/_____/               \\/    \\/                                     \\/     ");
        
        System.out.println("================================================================================================");
        System.out.println("=          \u269C                  Juego del trivial de cultura general         \u269C                   =");
        System.out.println("================================================================================================");
        
        System.out.println("Escriba su nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        
        //System.out.println(respuesta.equals(solucion));
        
        String preguntas[] ={"¿Helsinki es la capital de qué país?","¿Cómo se llama la línea vertical imaginaria a partir de la cual se miden las longitudes?",
                             "¿En cuál planeta nació el personaje ficticio Superman?","¿En qué año se hundió el Titanic?",
                             "¿Cuál era el segundo nombre de Michael Jackson?","¿En qué país se habla mayoritariamente el idioma tagálog?",
                             "¿Cuál es la hormona que provoca el estrés?","¿Cómo se llama la moneda oficial de Japón?","¿Cuál es la isla más grande del Mar Caribe?",
                             "¿Apellido de la primera mujer en ganar un Premio Nobel?","¿Cuál es el único alimento comestible que nunca se daña?"};
        
        String respuestas[]={"Finlandia","Greenwich","Krypton","1912","Joseph","Filipinas","Cortisol","Yen","Cuba","Curie","Miel"};
        
        String ranking[]={"¡Necesitas leer un poco!","¡Suspenso!","¡Aprobado justo!","¡Bien hecho!","¡PERFECT!"};
                
        int numPregunta=1;
        int puntuacion=0;
        
        String solucion;
        int preguntaLibre[]={1,1,1,1,1,1,1,1,1,1,1};
        //
        
        while( numPregunta <= 8){
            System.out.println("Pregunta número: "+numPregunta);
            numPregunta++;
            int numero = (int)(Math.random()*preguntas.length);
            
            if(preguntaLibre[numero] == 0){
               int  h=0;
               while(preguntaLibre[numero] == preguntaLibre[h]){ 
                    h++;
                }
               numero = h;
            }
            System.out.println(preguntas[numero]);
            
            solucion = new Scanner(System.in).nextLine();
            if (respuestas[numero].equalsIgnoreCase(solucion.replaceAll("\\s+",""))){
                System.out.println("\u001B[32m"+"Bien"+"\u001B[0m");
                puntuacion++;
            }else{
                  System.out.println("\u001B[31m"+"Mal"+"\u001B[0m");
                 }
        preguntaLibre[numero]=0;
        }
        
        System.out.println("\n"+nombre+", Tu puntuación es: "+puntuacion);
            
            if(puntuacion== 0){
                System.out.println("\u001B[31m"+ranking[0]+"\u001B[0m");
            }else{
                if(puntuacion >0 && puntuacion <4){
                   System.out.println("\u001B[31m"+ranking[1]+"\u001B[0m");
                }else{
                    if(puntuacion == 4){
                       System.out.println("\u001B[33m"+ranking[2]+"\u001B[0m");
                    }else{
                        if(puntuacion >=5 && puntuacion <8){
                           System.out.println("\u001B[32m"+ranking[3]+"\u001B[0m"); 
                        }else{
                            System.out.println("\u001B[35m"+ranking[4]+"\u001B[0m");
                        }    
                    }        
                }            
            }            
    }
}
