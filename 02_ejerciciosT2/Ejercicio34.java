import bpc.daw.reproductor.*;
import java.io.IOException;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio34 {

    
    public static void main(String[] args) {
        
        try{
           PlayList lista = new PlayList("C:/Users/sergi/Documents/FPS/"
                + "Programación LLFJ/Tema 3/musica/playlist");
           Reproductor radio = new Reproductor(lista,true,false);
           radio.play();
        
        }catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
 
    }
}
