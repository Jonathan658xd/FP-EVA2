/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_validar_2;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA2_10_VALIDAR_2 {

    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner(System.in);
        while(true){
            System.out.println("Numero corespondiente al dia (1 - 7)");
            dia = captu.nextInt();
            if(dia >= 1 && dia <= 7)
                break;
        }
               switch(dia){
        case 1:
        System.out.println("Lunes");
        break;
        case 2:
        System.out.println("Martes");
        break;
        case 3:
        System.out.println("Miercoles");
        break;
        case 4:
        System.out.println("Jueves");
        break;
        case 5:
        System.out.println("Viernes");
        break;
        case 6:
        System.out.println("Sabado");
        break;
        case 7:
        System.out.println("Domingo");
        break;
        default:
        System.out.println("Numero no valido(debe ser entre 1 y 7)");
         } 
    }
}
