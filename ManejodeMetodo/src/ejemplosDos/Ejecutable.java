/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosDos;

//Generar un proceso que me permita ingresar 5 ciudades (de manera obligatoria) ciudades

import java.util.Scanner;

//Sis las ciudades no cumplen con las condiciones(empezar con A, C, D); nos e contabilizan.

/**
 *
 * @author Granda
 */
public class Ejecutable {
    public static void main(String[] args) {
              
        /*String nombreCiudad = "Arenillas";
        /boolean resultado = Operacion.comprobarCadena(nombreCiudad);
        /System.out.printf("%s\n", resultado);*/
        
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        int contador = 1;
        String ciudad = "";
        
        while(contador <= limite){
            System.out.printf("Ingrese una ciudad: ");
            ciudad = entrada.nextLine();
            boolean resultado = Operacion.comprobarCadena(ciudad);
            if (resultado == true) {
                System.out.printf("%s\n",ciudad);
                contador = contador + 1;
            }else{
              System.out.println("Valor ingresado fuera de rango\n"
                      + "Vuelva a ingresar una ciudad");
            }
            
        }
    }
  
}
