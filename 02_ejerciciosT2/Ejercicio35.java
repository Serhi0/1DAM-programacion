import bpc.daw.reproductor.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio35 {

    
    public static void main(String[] args) {
        
      System.out.println("Parte A");  
      
      ArchivoMP3 c1 = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación"
          + " LLFJ/Tema 3/musica/Ayax y Prok - Zinedine.mp3");
      ArchivoMP3 c2 = new ArchivoMP3("C:/Users/sergi/Documents/FPS/Programación"
          + " LLFJ/Tema 3/musica/Ayax y Prok - Zinedine.mp3");
      
      boolean iguales = c1==c2;
      System.out.println("La comparación con '==' es: "+iguales);
        
      iguales =  c1.equals(c2);
        System.out.println("La comparación con 'equals' es: "+iguales);
        
        System.out.println("HashCode de c1 es: "+c1.hashCode());
        System.out.println("HashCode de c2 es: "+c2.hashCode());
        
        iguales = c1.hashCode() == c2.hashCode();
        System.out.println("Son iguales los HashCode: "+iguales+"\n");
        
        System.out.println("Parte B");
        
        Reproductor radio = new Reproductor(c1,true,true);
        System.out.println("Metodo toString a Reproductor: "+radio.toString());
        
        System.out.println("Metodo toString a ArchivoMP3: "+c1.toString());
        System.out.println("La clase ArchivoMP3 tiene la clase reprogramada");
        
       
        
        
    }

}
