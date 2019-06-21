/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosDos;

/**
 *
 * @author Granda
 */
public class Operacion {
    
    public static boolean comprobarCadena(String cadena){
        
        boolean bandera = false;
        
        if ((cadena.startsWith("A")) ||
                (cadena.startsWith("C"))||
                (cadena.startsWith("D"))
                ){
            bandera = true;
        }
        else {
            bandera = false;
    }
    return bandera;
}
}
