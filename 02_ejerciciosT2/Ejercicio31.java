
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
   
        cancion.añadir(DoN);
        cancion.añadir(DoN);
        cancion.añadir(SolN);
        cancion.añadir(SolN);
        cancion.añadir(LaN);
        cancion.añadir(LaN);
        cancion.añadir(SolB);
        cancion.añadir(FaC);
        cancion.añadir(FaC);
        cancion.añadir(MiC);
        cancion.añadir(MiC);
        cancion.añadir(ReS);
        cancion.añadir(MiS);
        cancion.añadir(FaS);
        cancion.añadir(ReS);
        cancion.añadir(DoN);
        
        piano.reproducir(cancion);
        guitarra.reproducir(cancion);
    }
}
