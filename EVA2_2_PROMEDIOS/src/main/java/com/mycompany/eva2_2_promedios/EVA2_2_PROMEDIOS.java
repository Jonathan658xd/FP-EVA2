/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedios;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA2_2_PROMEDIOS {

    public static void main(String[] args) {
        int califa, sumaCali;
        Scanner captu = new Scanner(System.in);
        sumaCali = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # " + i);    
        System.out.println("Cual es tu calificacion?");
        califa = captu.nextInt();
        captu.nextLine();
        sumaCali = sumaCali + califa;
        }
        double promedio = sumaCali / 10.0;
       System.out.println("promedio = " + promedio);
    }
}
