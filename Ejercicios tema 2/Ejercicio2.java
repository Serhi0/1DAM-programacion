/*
 */
package mario;

import bpc.daw.mario.*;
import bpc.daw.mario.Mario;

/*
Ejercicio 2 : Consulta la documentaci�n de la librer�a Mario Bros y haz un programa que cree 
los siguientes objetos en la pantalla: 
a) Dos mu�ecos de Mario, uno a 100 p�xeles de distancia de la esquina superior izquierda 
de la pantalla y otro en las coordenadas (640,320) 
b) Una Seta en la esquina superior izquierda de la pantalla 
c) Un ca��n en las coordenadas (100,320) 
d) Tres plantas en las coordenadas (400,500), (450,500) y (500,500) 
e) Un mu�eco de Luigi situado a 200 p�xeles de la esquina superior izquierda de la 
pantalla y uno de Mario situado a 50 p�xeles horizontales de �l. 
 */
public class Ejercicio2 {
    public static void main(String[] args){
        
        
        
        
       Mario  m = new Mario(100); //seria Mario
              m = new Mario(640,320); //seria Mario
       Seta   s = new Seta(0,0);
       Ca�on  c = new Ca�on(100,320);
       Planta p = new Planta(400,500);
              p = new Planta(450,500);
              p = new Planta(500,500);
       Luigi  l = new Luigi(200);
              m = new Mario(l,50); //seria Mario
    }
}
