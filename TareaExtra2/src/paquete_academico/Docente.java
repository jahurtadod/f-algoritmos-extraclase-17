/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author jahur
 */
public class Docente {
    
    private String  nombre, apellidos;
    private Pais    pais;

    public Docente() {
        this.pais = new Pais();
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Pais obtener_pais() {
        return pais;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s - pais %s", obtener_nombre(), obtener_apellidos(), obtener_pais().obtener_nombre());
    }
}
