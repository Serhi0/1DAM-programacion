/*
 */
package mario;

import bpc.daw.mario.*;
import bpc.daw.mario.Mario;

/*
Ejercicio 2 : Consulta la documentación de la librería Mario Bros y haz un programa que cree 
los siguientes objetos en la pantalla: 
a) Dos muñecos de Mario, uno a 100 píxeles de distancia de la esquina superior izquierda 
de la pantalla y otro en las coordenadas (640,320) 
b) Una Seta en la esquina superior izquierda de la pantalla 
c) Un cañón en las coordenadas (100,320) 
d) Tres plantas en las coordenadas (400,500), (450,500) y (500,500) 
e) Un muñeco de Luigi situado a 200 píxeles de la esquina superior izquierda de la 
pantalla y uno de Mario situado a 50 píxeles horizontales de él. 
 */
public class Ejercicio2 {
    public static void main(String[] args){
        
        
        
        
       Mario  m = new Mario(100); //seria Mario
              m = new Mario(640,320); //seria Mario
       Seta   s = new Seta(0,0);
       Cañon  c = new Cañon(100,320);
       Planta p = new Planta(400,500);
              p = new Planta(450,500);
              p = new Planta(500,500);
       Luigi  l = new Luigi(200);
              m = new Mario(l,50); //seria Mario
    }
}
