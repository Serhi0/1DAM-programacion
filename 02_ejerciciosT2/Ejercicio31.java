
import bpc.daw.musica.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio31 {

    
    public static void main(String[] args) {
        
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Cancion cancion = new Cancion("");
        
        NotaMusical DoN = new NotaMusical(0,2);
        NotaMusical SolN = new NotaMusical(4,2);
        NotaMusical LaN = new NotaMusical(5,2);
        NotaMusical SolB = new NotaMusical(4,0);
        NotaMusical FaC = new NotaMusical(3,3);
        NotaMusical MiC = new NotaMusical(2,3);  
        NotaMusical ReS = new NotaMusical(1,4);
        NotaMusical MiS = new NotaMusical(2,4);
        NotaMusical FaS = new NotaMusical(3,4);
   
        cancion.a�adir(DoN);
        cancion.a�adir(DoN);
        cancion.a�adir(SolN);
        cancion.a�adir(SolN);
        cancion.a�adir(LaN);
        cancion.a�adir(LaN);
        cancion.a�adir(SolB);
        cancion.a�adir(FaC);
        cancion.a�adir(FaC);
        cancion.a�adir(MiC);
        cancion.a�adir(MiC);
        cancion.a�adir(ReS);
        cancion.a�adir(MiS);
        cancion.a�adir(FaS);
        cancion.a�adir(ReS);
        cancion.a�adir(DoN);
        
        piano.reproducir(cancion);
        guitarra.reproducir(cancion);
    }
}
