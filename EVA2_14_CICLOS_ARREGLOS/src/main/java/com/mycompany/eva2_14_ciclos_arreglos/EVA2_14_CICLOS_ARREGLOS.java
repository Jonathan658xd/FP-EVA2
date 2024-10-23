/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclos_arreglos;

/**
 *
 * @author ae478
 */
public class EVA2_14_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int dato, valores[];
        int[]datos, x, y, z;
        int[]arreglo = new int[400];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
                   
        }
        //System.out.println(arreglo);solo imprime la direccion de mi 
        for (int i = 0; i < arreglo.length; i++) {//leer todos los valores de los arreglos
            System.out.print(arreglo[i] + " - ");
        }
        
    }
}
