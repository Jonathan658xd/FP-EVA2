/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while;

/**
 *
 * @author ae478
 */
public class EVA2_7_WHILE {

    public static void main(String[] args) {
        //imprimir los numeros de 1 al 10
        int val = 1;
        while(val <= 10){   
            System.out.print(val + "-");
            val++;
            
        }
        System.out.println("");
        val = 1;
        do{
            System.out.print(val + "-");
            val++;
        }while(val <= 10);//REPETIR INTSTRUCCIONES MIENTRAS ESTO SE CUMPLA
    }
}
