package tema3;

import bpc.daw.reproductor.*;
import java.util.Scanner;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class ReproductorConLibreria {
    public static void main(String[] args){
        System.out.println("==============================================");
        System.out.println("= Elige el número de cancion para reproducir =");
        System.out.println("==============================================");
        System.out.println("=             1 - Pavaroti.mp3                =");
        System.out.println("=             2 - Badbunny.mp3               =");
        System.out.println("=             3 - Copiapirata.mp3            =");
        System.out.println("=             4 - Mozart.mp3                 =");
        System.out.println("=             5 - Shakira.mp3                =");
        System.out.println("==============================================");
        
        ArchivoMP3 c = null;
        int cancion = new Scanner(System.in).nextInt();
        
        switch(cancion){
            case 1:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Pavaroti.mp3          =");
                System.out.println("==============================================");
                
                c = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 3/a.mp3");
                System.out.println( "Reproduciendo: "+c.getTitulo());
                
                
            break;
            case 2:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Badbunny.mp3         =");
                System.out.println("==============================================");
                
                c = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 3/Bad Bunny - Tití Me Preguntó.mp3/");
                System.out.println( "Reproduciendo: "+c.getTitulo());
                
                ;
            break;
            case 3:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo CopiaPirata.mp3      =");
                System.out.println("==============================================");
                
                c = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 3/Ayax y Prok - Zinedine.mp3");
                System.out.println( "Reproduciendo: "+c.getTitulo());
            break;
            case 4:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Mozart.mp3           =");
                System.out.println("==============================================");
                
                c = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 3/Mozart - Concierto Para Violin Nº1 En SI Mayor. Allegro Moderato.mp3");
                System.out.println( "Reproduciendo: "+c.getTitulo());
            break;
            case 5:
                System.out.println("==============================================");
                System.out.println("=         Reproduciendo Shakira.mp3          =");
                System.out.println("==============================================");
                
                c = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación LLFJ/Tema 3/Shakira Ft. Rauw Alejandro - Te Felicito.mp3");
                System.out.println( "Reproduciendo: "+c.getTitulo());
            break;
            default:
                System.out.println("==============================================");
                System.out.println("=         Reproductor no hace nada           =");
                System.out.println("==============================================");
                
                
        }
        
        Reproductor radio = new Reproductor(c,true,true);
                radio.play();
        
    }                
}

