/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
         int expo, base;
        Scanner captu = new Scanner(System.in);
        System.out.println("Base:");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Exponenete");
        expo = captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for(int i = 1; i <= expo; i++){
            resu = resu * base;
        }
        System.out.println("El resultado es = " + resu);
    }
}
