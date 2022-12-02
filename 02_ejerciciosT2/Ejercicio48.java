import bpc.daw.objetos.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio48 {

    
    public static void main(String[] args) {
       
        MarcadorMejorado marcador = new MarcadorMejorado("Estudiantes", 
        "CB Granada");
        
        final int E = 697259;
        final int CB = 782507;
        final int canasta = 522;
        final int libre = 266;
        final int triple = 778;
        
        marcador.anotarCanasta(E,canasta );
        marcador.anotarCanasta(CB,triple);
        marcador.anotarCanasta(E,canasta);
        marcador.anotarCanasta(CB, canasta);
        marcador.anotarCanasta(CB,triple);
        marcador.anotarCanasta(E,libre);
        marcador.anotarCanasta(E,libre);
        marcador.anotarCanasta(CB,canasta);
        
        System.out.println("Equipos: "+marcador.getNombreLocal()
                +"-"+marcador.getNombreVisitante());
        
        System.out.println("Puntos: "+marcador.getPuntosLocal()
        +"-"+marcador.getPuntosVisitante());
        
        System.out.println("Va ganando "+marcador.getNombreEquipoGanador()
        +". Va perdiendo "+marcador.getNombreEquipoPerdedor()+".");
        
        
    }

}
