/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.laia.ejemplo_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Ejemplo_array {

    public static void main(String[] args) {
        
        
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejemplo_matriz();
         
    }

    /****
     * Ejercicio1: Programa que carga el vector 'sqrs' con los cuadrados de los números del 1 al 10 y después los muestra por pantalla.
     * 
     */
    private static void ejercicio1() {
       
    int[] sqrt = new int[10];
      
        
        for(int j = 0; j<10; j++){
            sqrt[j] = (int)Math.pow(j+1, 2);
        }
        
        
        //mostrar array
        for(int i = 0; i < sqrt.length ;i++){
            System.out.println("sqrt["+i+"]: " + sqrt[i]);
        }
    }

    /****
    * Ejercicio 2: Realiza un desarrollo para trabajar con 4 arrays que :
     *
     * Declara y asigna los 10 valores iniciales (enteros) de dos arrays a1 y
     * a2. Declara 2 arrays de enteros diferentes llamados b1 y b2 b1 crea el
     * array y....
    */
    private static void ejercicio2() {

      //declaramos e creamos los arrays a1 y a2 (con valores ya dentro)
      
        int[] a1= {2,3,4,5,6,7,8,9,33,23};   //inicializamos con estos valores 'YA' dentro del array
        int[] a2= {6,64,34,7,98,5,3,2,43,76};
        
        //mostrar a1
        System.out.println("a1: " + Arrays.toString(a1));
        
        //mostrar a2
         System.out.println("a2: " + Arrays.toString(a2));
        
         //declaramos b1 y b2
         int[] b1;
         int[] b2;
         
         //creamos b1 con valores vacios--> todo a 0)
         b1 = new int[10];
         
         //asignamos valores a los elementos de b1
         b1[0]= 54;
         b1[1]= 543;
         b1[2]= 23;
         b1[3]= 23;
         b1[4]= 11;
         b1[5]= 13;
         b1[6]= 66;
         b1[7]= 53;
         b1[8]= 58;
         b1[9]= 53;
         
         //mostrar b1
         System.out.println("b1: " + Arrays.toString(b1));
         
         b2 = b1;
         
        //mostrar b1
        System.out.println("b2: " + Arrays.toString(b2));
         
         
        //Modificamos los valores del incide 3 de los arrays a1, a2 y b1
        System.out.println("Modificamos los valores del incide 3 de los arrays a1, a2 y b1");
        a1[3] = 111;
        a2[3] = 222;
        b1[3] = 333;
         
         
        System.out.println("Mostramos los valores de todos los arrays");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        System.out.println("b1: " + Arrays.toString(b1));
        System.out.println("b2: " + Arrays.toString(b2));
         
        System.out.println("Ahora modificamos los valores del incide 3 b2");
        b2[3] = 444;
         
         
        System.out.println("Mostramos los valores de todos los arrays");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        System.out.println("b1: " + Arrays.toString(b1));
        System.out.println("b2: " + Arrays.toString(b2));
        
        System.out.println("QUE ha pasado??");
       
       
    }

    
    /*****
     * Ejercicio3: 
     * Ingresar 15 números enteros en un array y muestra todos por pantalla. 
     * Posteriormente suma 10 a los 4 primeros elementos y multiplica todos los elementos x2. 
     * Finalmente vuelve a mostrar los 15 elementos del array.
     *
     */
    private static void ejercicio3() {
        
        Scanner sc = new Scanner(System.in);
        /*
        int[] array_duplica = new int[15];
        
        for(int i = 0; i< 15; i++){
            System.out.println("Escrbe un valor");
            array_duplica[i]=sc.nextInt();
        }*/
        int[] array_duplica = {2, 22, 4,23,12,19,53,67,5,3,8,6,7,9,1};
        
        System.out.println("Mostrmamos el array");
        
        System.out.println("array_duplica: " + Arrays.toString(array_duplica)+" num elementos: "+array_duplica.length);
        
        //suma 10 a los 4 primeros elementos
        
        array_duplica[0] = array_duplica[0]+10;
        array_duplica[1] = array_duplica[1]+10;
        array_duplica[2] = array_duplica[2]+10;
        array_duplica[7] = array_duplica[7]+10;
        
        System.out.println("array_duplica +10: " + Arrays.toString(array_duplica)+" num elementos: "+array_duplica.length);
        
        for(int i= 0; i < array_duplica.length; i++){
            array_duplica[i] = array_duplica[i]*2;
        }
        
        System.out.println("array_duplica x2: " + Arrays.toString(array_duplica)+" num elementos: "+array_duplica.length);
        
    }
    
    /*****
     * Ejercicio4: 
     * Programa que lee por teclado una secuencia de 10 números enteros almacenándolos en un array llamado “números” y:
     *   - los muestra en orden inverso al de entrada.
     *   - encuentra y muestra la posición que ocupa el primer número negativo en caso de existir. En caso contrario escribirá un mensaje indicándolo
     *   - muestra cuáles son el mayor y el menor, y cuántas veces se repiten ambos.
     *
     */
     private static void ejercicio4() {
         
         Scanner sc = new Scanner(System.in);
        /*int[] numeros = new int[10];
        
        for(int i = 0; i< 10; i++){
            System.out.println("Escrbe un valor");
            numeros[i]=sc.nextInt();
        }*/
      /*  int[] numeros = {3, 3, 2, 2, 2, 2, 96, 4, 11, 96};
        
        System.out.println("Mostrmamos el array");
        
        System.out.println("numeros: " + Arrays.toString(numeros));
        
        //- los muestra en orden inverso al de entrada.
        
        for(int j = numeros.length-1; j >= 0; j--) System.out.print("-" + numeros[j]);
        
            
        
        
        //- encuentra y muestra la posición que ocupa el primer número negativo en caso de existir. En caso contrario escribirá un mensaje indicándolo
        int i;
        
        for(i= 0; i< numeros.length; i++){
             
             if(numeros[i]==7) break;
         }
        
        if(i!=10)System.out.println("el 7 es: " + i);
        else System.out.println("Mensaje indicando que no hay 7");
        
        //- muestra cuáles son el mayor y el menor, y cuántas veces se repiten ambos.
        
        int mayor= numeros[0];
        int cont_mayor = 1;
        int cont_menor = 1;
        int menor =  numeros[0];
        for(i= 1; i< numeros.length; i++){         
             if(mayor < numeros[i] ){
                 mayor = numeros[i];
                 cont_mayor = 1;
             }
             else if(mayor == numeros[i]) cont_mayor++;
             if(menor > numeros[i]) {
                 menor = numeros[i];
                 cont_menor = 1;
             }
             else if(menor == numeros[i]) cont_menor++;
         }
         System.out.println("El mayor es: " + mayor + "y aparece "+ cont_mayor+" veces y el menor: "+ menor+ " y aparece "+ cont_menor+" veces" );
        */
         
         double[] miarray = {3.7, 6, 9, 2.1, 4, 5};
         double suma=0;
         for( double num_actual : miarray){
             
             
             System.out.print(" - "+ num_actual);
             
         }
         System.out.println("suma: "+ suma);
     
     }

    private static void ejercicio5() {
        //un Listalaia
        ListaLaia lislaia = new ListaLaia(4);
        
        System.out.println("Los elementos de mi lista son "+lislaia.getNum_elementos());
        System.out.println("Mostrar los datos");
        lislaia.mostrar_lista();
        System.out.println("Pon datos en el array");
        lislaia.pedir_datos_lista();
        System.out.println("Mostrar los datos (CON DATOS)");
        lislaia.mostrar_lista();
        System.out.println(" La suma de los datos es: "+lislaia.sumar_datos_lista());
        System.out.println("Y la media: " +lislaia.media_datos_lista());
        System.out.println(" donde esta el numero 5: " + lislaia.buscar_elemento(5) );
        System.out.println(" se ha modificado el elemento: " + lislaia.modifica_elemento(5,10));
        System.out.println("Mostrar los datos");
        lislaia.mostrar_lista();
    }
    
    /***
     * ejemplo_matriz() Ejemplo de una matriz de 2 dimensiones PaisesxMedallas
     * 
     */
    public static void ejemplo_matriz(){
        final int PAISES = 7;
        final int MEDALLAS = 3;
        String[] paises = {"Canada","China","Japon","Rusia","Espana","Ucrania","Estados Unidos" };
        int[][] cuentas = { { 0, 0, 1 },
                            { 0, 1, 1}, { 1, 0, 0 }, { 3, 0, 1 }, { 0, 1, 0 }, { 0,0, 1 }, { 0, 2, 0 }};
        
        
        System.out.println(" \t Pais \t \t Oro \t Plata \t Bronce Total");
        
        for (int i = 0; i < PAISES; i++) {
            System.out.printf("a: %15s", paises[i]);
            int total = 0;
            for (int j = 0; j < MEDALLAS; j++) {
                System.out.printf("%8d",cuentas[i][j]);

                total = total + cuentas[i][j];
            }
        System.out.printf("%8d\n" , total);
        
        
        
        }   
    }
}
