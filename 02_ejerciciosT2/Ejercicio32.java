import bpc.daw.reproductor.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio32 {

    
    public static void main(String[] args) {
        
      
        ArchivoMP3 mp3 = new ArchivoMP3("C:/Users/sergi/Documents/FPS/"
          + "Programación LLFJ/Tema 3/musica/Shakira Ft. Rauw Alejandro"
          + " - Te Felicito.mp3");
        
        Reproductor radio = new Reproductor(mp3,true,false);
        
        System.out.println("Titulo: "+mp3.getTitulo()+". Autor: "+mp3.getAutor()
          +". Duración: "+(mp3.getDuracion()/1000)+ " segundos");
        
        radio.play();  
    }
}
