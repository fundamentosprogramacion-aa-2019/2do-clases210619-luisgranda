/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoMetodos;
/**
 *
 * @author Granda
 */
public class ManejodeMetodo {
    
     public static void main(String[] args) {
        
         Operacion.metodoUno();
         Operacion.metodoTres("52");
         Operacion.metodoUno();
         String m = Operacion.metodoDos();
         Operacion.metodoTres("20", "51");
         System.out.println(m);
         Operacion.metodoUno();
                 
         System.out.println(m);
    }
         
             
}    
