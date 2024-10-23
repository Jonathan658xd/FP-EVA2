/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
       
        //final PI = 3.1416;
        
        String usu, pwd;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("Usuario:");
            usu = captu.nextLine();
            System.out.println("Password:");
            pwd = captu.nextLine();
        }while((usu.equals("admin") && pwd.equals("1234")));
        System.out.println("ACCESO DENEGADO:");
         
    }
}
