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
public class Jugador {

    private String  nombre;
    private String  posicion;
    private int     edad;

    public Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_posicion() {
        return posicion;
    }

    public void establecer_posicion(String posicion) {
        this.posicion = posicion;
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
                this.obtener_nombre(), this.obtener_posicion(), this.obtener_edad());
    }
    
}
