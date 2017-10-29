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
public class Equipo {

    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador[] jugadores;
    private Tecnico[] tecnicos;

    public Equipo(String nombre, String siglas, int anio_fundacion) {
        this.jugadores = new Jugador[6];
        this.tecnicos = new Tecnico[3];
        this.nombre = nombre;
        this.siglas = siglas;
        this.anio_fundacion = anio_fundacion;
    }

    public float obtener_promedio_edad_jugadores() {
        float promedio = 0;
        for (Jugador jugador : this.jugadores) {
            promedio += jugador.obtener_edad();
        }
        promedio = promedio / this.jugadores.length;
        return promedio;
    }

    public float obtener_promedio_edad_tecnicos() {
        float promedio = 0;
        for (Tecnico tecnico : this.tecnicos) {
            promedio += tecnico.obtener_edad();
        }
        promedio = promedio / this.tecnicos.length;
        return promedio;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_siglas(String siglas) {
        this.siglas = siglas;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void establecer_anio_fundacion(int anio_fundacion) {
        this.anio_fundacion = anio_fundacion;
    }

    public String obtener_jugadores() {
        String result = "";
        for (Jugador jugador : jugadores) {
            result += jugador;
        }
        return result;
    }

    public void establecer_jugadores(int i, Jugador jugador) {
        this.jugadores[i] = jugador;
    }

    public String obtener_tecnicos() {
        String result = "";
        for (Tecnico tecnico : tecnicos) {
            result += tecnico;
        }
        return result;
    }

    public void establecer_tecnicos(int i, Tecnico tecnico) {
        this.tecnicos[i] = tecnico;
    }

    @Override
    public String toString() {
        return String.format("Equipo \"%s\"\n"
                + "Sus técnicos son: \n"
                + "%s\n"
                + "Sus jugadores son: \n"
                + "%s\n"
                + "Promedio de edad de: \n"
                + " Técnicos: %f años\n"
                + " Jugadores: %f años",
                obtener_nombre(), obtener_tecnicos(), obtener_jugadores(),
                obtener_promedio_edad_tecnicos(), obtener_promedio_edad_jugadores());
    }
}
