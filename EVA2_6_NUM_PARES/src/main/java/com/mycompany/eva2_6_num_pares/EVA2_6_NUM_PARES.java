/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_num_pares;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA2_6_NUM_PARES {

    public static void main(String[] args) {
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Inicio;");
        num1 = captu.nextInt();
        captu.nextLine();
        System.out.println("Fin;");
        num2 = captu.nextInt();
        captu.nextLine();
        for (int i = num1; i <= num2; i++) {
            int modulo = i % 2;
            if (modulo == 0)
                 continue; 
            System.out.println(i + "-");    
        }
    }
}
