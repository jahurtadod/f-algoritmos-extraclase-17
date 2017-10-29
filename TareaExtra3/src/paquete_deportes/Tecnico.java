/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author jahur
 */
public class Tecnico {

    private String nombre;
    private String funcion;
    private int edad;

    public Tecnico(String nombre, String funcion, int edad) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.edad = edad;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_funcion() {
        return funcion;
    }

    public void establecer_funcion(String funcion) {
        this.funcion = funcion;
    }

    public int obtener_edad() {
        return edad;
    }

    public void establecer_edad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("  %s - %s - %d años\n",
                this.obtener_nombre(), this.obtener_funcion(), this.obtener_edad());
    }
    
}
