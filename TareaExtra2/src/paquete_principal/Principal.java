/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_estudiante.Estudiante;

/**
 *
 * @author jahur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se crea todos los objetos del caso 1
        Estudiante caso1 = new Estudiante ();
        Universidad u_caso1 = new Universidad();
        Asignatura a1_caso1 = new Asignatura();
        Docente d1_caso1 = new Docente();
        Asignatura a2_caso1 = new Asignatura();
        Docente d2_caso1 = new Docente();
        Carrera c_caso1 = new Carrera();
        
        //Se manda los valores caso 1
        caso1.establecer_nombres("Luis V.");
        caso1.establecer_apellidos("Perez J.");
        
        u_caso1.establecer_nombre("Universidad Técnica Particular de Loja");
        u_caso1.establecer_siglas("UTPL");
        u_caso1.obtener_pais().establecer_nombre("Ecuador");
        a1_caso1.establecer_nombre("Matemáticas");
        a1_caso1.establecer_creditos(10);
        c_caso1.establecer_nombre("Sistemas");
        c_caso1.establecer_modalidad("presencial");
        d1_caso1.establecer_nombre("Mario");
        d1_caso1.establecer_apellidos("Alcivar");
        d1_caso1.obtener_pais().establecer_nombre("Colombia");
        a2_caso1.establecer_nombre("Fisica");
        a2_caso1.establecer_creditos(8);
        d2_caso1.establecer_nombre("Maria");
        d2_caso1.establecer_apellidos("Ruiz");
        d2_caso1.obtener_pais().establecer_nombre("Perú"); 
        
        caso1.establecer_universidad(u_caso1);
        caso1.establecer_asignatura1(a1_caso1);
        caso1.establecer_asignatura2(a2_caso1);
        a1_caso1.establecer_docente(d1_caso1);
        a1_caso1.establecer_carrera(c_caso1);
        a2_caso1.establecer_docente(d2_caso1);
        a2_caso1.establecer_carrera(c_caso1);
        
        //Se crea todos los objetos del caso 2
        Estudiante caso2 = new Estudiante ();
        Universidad u_caso2 = new Universidad();
        Asignatura a1_caso2 = new Asignatura();
        Docente d1_caso2 = new Docente();
        Asignatura a2_caso2 = new Asignatura();
        Docente d2_caso2 = new Docente();
        Carrera c_caso2 = new Carrera();
        
        //Se manda los valores caso 2
        caso2.establecer_nombres("Ana.");
        caso2.establecer_apellidos("Lima J.");
        
        u_caso2.establecer_nombre("Universidad Técnica Equinoccial");
        u_caso2.establecer_siglas("UTE");
        u_caso2.obtener_pais().establecer_nombre("Ecuador");
        a1_caso2.establecer_nombre("Biología");
        a1_caso2.establecer_creditos(9);
        c_caso2.establecer_nombre("Biología");
        c_caso2.establecer_modalidad("distancia");
        d1_caso2.establecer_nombre("Luis");
        d1_caso2.establecer_apellidos("Armijos");
        d1_caso2.obtener_pais().establecer_nombre("Venezuela");
        a2_caso2.establecer_nombre("Fisica");
        a2_caso2.establecer_creditos(7);
        d2_caso2.establecer_nombre("Maria");
        d2_caso2.establecer_apellidos("Ruiz");
        d2_caso2.obtener_pais().establecer_nombre("Perú"); 
        
        caso2.establecer_universidad(u_caso2);
        caso2.establecer_asignatura1(a1_caso2);
        caso2.establecer_asignatura2(a2_caso2);
        a1_caso2.establecer_docente(d1_caso2);
        a1_caso2.establecer_carrera(c_caso2);
        a2_caso2.establecer_docente(d2_caso2);
        a2_caso2.establecer_carrera(c_caso2);
        
        //Se imprime los casos
        System.out.println(caso1);
        System.out.println(caso2);
    }
    
}