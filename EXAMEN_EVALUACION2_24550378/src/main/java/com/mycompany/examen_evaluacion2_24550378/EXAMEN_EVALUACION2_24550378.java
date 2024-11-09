/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_evaluacion2_24550378;

import java.util.Scanner;

/**
 *
 * @author ae478
 */
public class EXAMEN_EVALUACION2_24550378 {

    public static void main(String[] args) {
       
        Scanner captu = new Scanner(System.in);
        int juegosJugador = 0;
        int juegosBot = 0;
        int empates = 0;
        boolean seguirJugando = true;

        while (seguirJugando) {
            System.out.println("Elige una opción: ");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.print("Elije 1, 2 o 3: ");
            int eleccionJugador = captu.nextInt();
            int eleccionBot = (int) (Math.random() * 3) + 1;
            System.out.print("El bot eligió: ");
            switch (eleccionBot) {
                case 1: 
                    System.out.println("Piedra"); 
                    break;
                case 2: 
                    System.out.println("Papel"); 
                    break;
                case 3: 
                    System.out.println("Tijera"); 
                    break;
            }
            if (eleccionJugador == eleccionBot) {
                System.out.println("¡Es un empate!");
                empates++;
            } else if ((eleccionJugador == 1 && eleccionBot == 3) || 
                       (eleccionJugador == 2 && eleccionBot == 1) || 
                       (eleccionJugador == 3 && eleccionBot == 2)) {
                System.out.println("¡Ganaste!");
                juegosJugador++;
            } else {
                System.out.println("¡Te Gano un Bot jajaja!");
                juegosBot++;
            }
            System.out.println("\nPuntaje actual:");
            System.out.println("Ganados por el Bot = " + juegosBot);
            System.out.println("Ganados por el Jugador = " + juegosJugador);
            System.out.println("Empates = " + empates);
            System.out.print("\n¿Quieres seguir jugando? (si o no): ");
            String respuesta = captu.next().toLowerCase();
            if (respuesta.equals("no")) {
                seguirJugando = false;
            }
        }
        System.out.println("\nJuego terminado!");
        System.out.println("Ganados por el Bot = " + juegosBot);
        System.out.println("Ganados por el Jugador = " + juegosJugador);
        System.out.println("Empates = " + empates);

        if (juegosJugador > juegosBot) {
            System.out.println("¡Has ganado más partidas!");
        } else if (juegosBot > juegosJugador) {
            System.out.println("¡Te gano mas veces el bot jajaja!");
        } else {
            System.out.println("Es un Empate.");
        }

        captu.close();
    }
}

     
            
           
                
        
    
         
        
    
