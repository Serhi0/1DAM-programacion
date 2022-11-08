import bpc.daw.objetos.MarcadorBaloncesto;

public class Ejercicio12 {
    public static void main(String[] args){
        
    MarcadorBaloncesto mbalon = new MarcadorBaloncesto("Estudiantes","CB Granada");
    

    
     boolean anota = mbalon.anotarCanasta('L',2);
             anota = mbalon.anotarCanasta('V',3);
             anota = mbalon.anotarCanasta('L',2);
             anota = mbalon.anotarCanasta('V',2);
             anota = mbalon.anotarCanasta('V',3);
             anota = mbalon.anotarCanasta('L',1);
             anota = mbalon.anotarCanasta('L',1);
             anota = mbalon.anotarCanasta('V',2);
             
            System.out.println(mbalon.toString());
            System.out.println("va ganando : "+mbalon.getNombreEquipoGanador());
            System.out.println("va perdiendo : "+mbalon.getNombreEquipoPerdedor());
             
     
    }
}
