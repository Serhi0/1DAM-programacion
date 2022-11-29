import bpc.daw.reproductor.*;
import java.io.IOException;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio33 {

    
    public static void main(String[] args) {
        
      ArchivoMP3 c1 = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación"
          + " LLFJ/Tema 3/musica/Ayax y Prok - Zinedine.mp3");
      ArchivoMP3 c2 = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación"
          + " LLFJ/Tema 3/musica/Shakira Ft. Rauw Alejandro - Te Felicito.mp3");
      ArchivoMP3 c3 = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación"
          + " LLFJ/Tema 3/musica/Mozart - Concierto Para Violin Nº1 En SI Mayor"
          + ". Allegro Moderato.mp3");
      
      ArchivoMP3 [] a ={c1,c2,c3};
      PlayList playlist = new PlayList();
      playlist.añadirVarias(a);
      playlist.setTitulo("Lista de Ejemplo");
      
      try{
         playlist.guardar("C:/Users/sergi/Documents/FPS/Programación LLFJ"
                 + "/Tema 3/musica/playlist"); 
         }catch(IOException e){
               System.out.println("Error "+e.getMessage());
               }
      Reproductor Radio = new Reproductor(playlist,true,true);
      Radio.play();
    
    }
}
