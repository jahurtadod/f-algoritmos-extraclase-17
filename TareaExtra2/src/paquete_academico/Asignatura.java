/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author jahur
 */
public class Asignatura {

    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;

    public Asignatura (){
    }
    
    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establecer_creditos(int creditos) {
        this.creditos = creditos;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }

    public void establecer_carrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Docente obtener_docente() {
        return docente;
    }

    public void establecer_docente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return String.format("%s (%d creditos) de la carrera %s. Docente: %s",
                obtener_nombre(), obtener_creditos(), obtener_carrera(), obtener_docente());
    }

}
