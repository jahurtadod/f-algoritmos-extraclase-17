/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_deportes.Equipo;
import paquete_deportes.Jugador;
import paquete_deportes.Tecnico;

/**
 *
 * @author jahur
 */
public class Principal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se crea los opjetos
        Jugador j1 = new Jugador("Manuel Alvarez","Arquero",20);
        Jugador j2 = new Jugador("Eduardo Valencia","Defensa",21);
        Jugador j3 = new Jugador("Fabian Cevallos","Defensa",30);
        Jugador j4 = new Jugador("Antonio Lara","Centrocampista",32);
        Jugador j5 = new Jugador("Luis Delgado","Centrocampista",17);
        Jugador j6 = new Jugador("Xavier Lopez","Delantero",25);
        
        Tecnico t1 = new Tecnico("Luis Gomez","Técnico Principal",45);
        Tecnico t2 = new Tecnico("Julio Neto","Asistente Técnico",46);
        Tecnico t3 = new Tecnico("Marco Silva","Preparador Físico",47);
        
        Equipo e1 = new Equipo("Boca Juniors", "BJ", 1889);
        e1.establecer_jugadores(0, j1);
        e1.establecer_jugadores(1, j2);
        e1.establecer_jugadores(2, j3);
        e1.establecer_jugadores(3, j4);
        e1.establecer_jugadores(4, j5);
        e1.establecer_jugadores(5, j6);
        
        e1.establecer_tecnicos(0, t1);
        e1.establecer_tecnicos(1, t2);
        e1.establecer_tecnicos(2, t3);
        
        System.out.println(e1);
    }
    
}
