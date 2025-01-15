/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laia.ejemplo_array;

/**
 *
 * @author profesor
 */
public class ListaLaia {
     //atributos
    
    private int[] lista;
    private int num_elementos;

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

    public int getNum_elementos() {
        return num_elementos;
    }

    public void setNum_elementos(int num_elementos) {
        this.num_elementos = num_elementos;
    }
    
    //Otros métodos
    //Obtener número de elementos, 
    //mostrar los datos, 
    //pedir datos al usuario, 
    //sumar los datos, 
    //hallar la media, 
    //buscar un valor, 
    //unir dos listas, 
    //modificar un dato.
    
    
    
}
