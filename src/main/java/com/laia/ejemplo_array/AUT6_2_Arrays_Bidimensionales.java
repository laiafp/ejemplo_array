/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laia.ejemplo_array;

import java.util.Arrays;

/**
 *
 * @author profesor
 */
public class AUT6_2_Arrays_Bidimensionales {
    
    
    /***
     * Ejercicio1: Generar una matriz de 3×3 con números aleatorios.
     */
    public static void ejercicio1(){
        
      //declaro y creo la matrix 3x3
       int[][] matrizEj1 = new int[3][3];
        System.out.println("ANTES DE PONER VALORES: ");
       
        //inicializar los valores random la matrix 3x3
       for(int i = 0; i<3; i++){
           for(int j = 0; j<3; j++){
               matrizEj1[i][j] = (int)(Math.random()*20 + 1);
           }
       }
       
       //mostrar la matriz
       for(int i = 0; i<3; i++){
           for(int j = 0; j<3; j++){
               
                //System.out.print(" - "+matrizEj1[i][j]); 
                 System.out.printf(" - %2d",matrizEj1[i][j]);          
           }
           System.out.println(""); 
       }     
       
    }
    
    
    /***
     * Ejercicio2: Generar una matriz de 3×3 con números aleatorios. SIN REPETIDOS
     */
    public static void ejercicio2(){
        
        
        //declaro y creo la matrix 3x3
       int[][] matrizEj1 = new int[3][3];
       int nuevo_valor=0;
        //inicializar los valores random la matrix 3x3
       for(int i = 0; i<3; i++){
           for(int j = 0; j<3; j++){
               
               do{
                   nuevo_valor = (int)(Math.random()*10 + 1);
               }while(valor_repetido(matrizEj1, nuevo_valor));
                   
               matrizEj1[i][j] = nuevo_valor;
           }
       }
       
       //mostrar la matriz
       for(int i = 0; i<matrizEj1[0].length; i++){
            System.out.println(Arrays.toString(matrizEj1[i])); 
           
       } 
        
        
    }
    
    
    /***
     * Ejercicio3: Crear un programa que lea por teclado números enteros y los 
     * guarde en una matriz de 5 filas por 4 columnas. Se deberá buscar el número 
     * mayor y el número menor mostrándolos así como las posiciones que ocupen. 
     * Finalmente se mostrará el array completo (poner un ‘\n’ en los print al 
     * final de cada fila del array) recorriéndolo mediante bucles for-each
     */
    public static void ejercicio3(){
        
    }

    private static boolean valor_repetido(int[][] matriz_para_comprobar, int nuevo_valor) {
       
        for(int k = 0; k<3; k++){
           for(int l = 0; l<3; l++){
                if(nuevo_valor == matriz_para_comprobar[k][l]){
                   return true;
                } 
                
           }
        }
        return false; 
    
    }
}
