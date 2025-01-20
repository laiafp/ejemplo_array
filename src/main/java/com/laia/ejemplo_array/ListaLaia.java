/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laia.ejemplo_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class ListaLaia {
     
    //atributos
    private int[] lista;
    private int num_elementos;

    /**
     * Constructor
     * @param num_elementos 
     */
    public ListaLaia(int num_elementos) {
        
        this.num_elementos = num_elementos;
       lista = new int[num_elementos];
        
    }
    
    //Getters y setters

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }
  
    //Obtener número de elementos, 
    public int getNum_elementos() {
        return num_elementos;
    }

    public void setNum_elementos(int num_elementos) {
        this.num_elementos = num_elementos;
    }
    
    //Otros métodos
  
    
    //mostrar los datos, 
    public void mostrar_lista(){
        System.out.println("La lista es: " + Arrays.toString(this.lista));
    }
    
    //pedir datos al usuario, 
    public void pedir_datos_lista(){
         Scanner sc = new Scanner(System.in);
        for(int i = 0; i< this.lista.length; i++){
            System.out.println("Escribe un valor");
            this.lista[i]=sc.nextInt();
        }
    }
    
    //sumar los datos, 
    
     public int sumar_datos_lista(){
         int suma = 0;
        for(int elemento_actual: this.lista){
            
            suma = suma + elemento_actual;
        }
        return suma;
    }
    //hallar la media, 
     
    public double media_datos_lista(){
         int suma = sumar_datos_lista();
        
        return suma/this.lista.length;
    }
    //buscar un valor, (que nos de su posición, si no lo encuentra -1 )
    public int buscar_elemento(int elemento_buscado){
        int i;
        int posicion = -1;
        for(i = 0; i< this.lista.length; i++){
            if(elemento_buscado == this.lista[i]) {
                posicion = i;
                break;
            }
            
        }
        return posicion;
    }
    
    //modificar un dato.a el 5(dato_buscado) vamos a ponerlo a 10(dato_nuevo)
    //vamos a indicar si si ha realizado la modificacion o no se ha podido
    public boolean modifica_elemento(int dato_buscado, int dato_nuevo){
        int posicion = buscar_elemento(5);
        if(posicion!=-1){
            this.lista[posicion] = 10;
            return true;
        } else return false;
    }
    
    
    
}
