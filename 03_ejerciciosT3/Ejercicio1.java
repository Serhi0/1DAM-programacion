package tema3;

import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio1 {
    public static void main(String[] args){
        
        System.out.println("==============================================");
        System.out.println("= Elige el número de cancion para reproducir =");
        System.out.println("==============================================");
        System.out.println("=             1 - Jackson.mp3                =");
        System.out.println("=             2 - Badbunny.mp3               =");
        System.out.println("=             3 - Copiapirata.mp3            =");
        System.out.println("=             4 - Mozart.mp3                 =");
        System.out.println("=             5 - Shakira.mp3                =");
        System.out.println("==============================================");
        
        int cancion = new Scanner(System.in).nextInt();
        
        switch(cancion){
            case 1:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Jackson.mp3          =");
                System.out.println("==============================================");
            break;
            case 2:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Badbunny.mp3         =");
                System.out.println("==============================================");
            break;
            case 3:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo CopiaPirata.mp3      =");
                System.out.println("==============================================");
            break;
            case 4:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Mozart.mp3           =");
                System.out.println("==============================================");
            break;
            case 5:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Shakira.mp3          =");
                System.out.println("==============================================");
            break;
            default:
                System.out.println("==============================================");
                System.out.println("=         Reproductor no hace nada           =");
                System.out.println("==============================================");
        }
        
        
    }
}
