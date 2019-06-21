package manejoMetodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Granda
 */
public class Operacion {
    public static String variable;
    
    public static void metodoUno(){
        System.out.printf("%s\n", variable);
    }
    
     public static void metodoTres(String v, String m){
        variable = v;
        variable = m;
    }
    
    public static String metodoDos(){
        return variable;
    }
    
    public static void metodoTres(String v){
        variable = v;
    }
}
