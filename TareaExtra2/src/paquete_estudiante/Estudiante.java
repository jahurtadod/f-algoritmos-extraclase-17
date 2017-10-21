/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Universidad;

/**
 *
 * @author jahur
 */
public class Estudiante {

    private String nombres, apellidos;
    private Asignatura asignatura1, asignatura2;
    private Universidad universidad;
    
    public Estudiante (){
    }

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_nombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Asignatura obtener_asignatura1() {
        return asignatura1;
    }

    public void establecer_asignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura obtener_asignatura2() {
        return asignatura2;
    }

    public void establecer_asignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Universidad obtener_universidad() {
        return universidad;
    }

    public void establecer_universidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return String.format("Datos del Estudiante:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Universidad: %s\n"
                + "Tiene las siguientes asignaturas:\n"
                + "\tAsignatura 1: %s\n"
                + "\tAsignatura 2: %s\n",
                obtener_nombres(), obtener_apellidos(), obtener_universidad(), obtener_asignatura1(), obtener_asignatura2());
    }

}
