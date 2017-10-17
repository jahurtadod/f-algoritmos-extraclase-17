/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextraclase1;

/**
 *
 * @author DELL
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura1;
    private Asignatura asignatura2;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Titulo getTitulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public void setTitulo_tercer_nivel(String nombre, String nombre_universidad) {
        this.titulo_tercer_nivel = new Titulo();
        this.titulo_tercer_nivel.setNombre(nombre);
        this.titulo_tercer_nivel.setNombre_universidad(nombre_universidad);
    }

    public Titulo getTitulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }

    public void setTitulo_cuarto_nivel(String nombre, String nombre_universidad) {
        this.titulo_cuarto_nivel = new Titulo();
        this.titulo_cuarto_nivel.setNombre(nombre);
        this.titulo_cuarto_nivel.setNombre_universidad(nombre_universidad);
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(String nombre, int creditos) {
        this.asignatura1 = new Asignatura();
        this.asignatura1.setNombre(nombre);
        this.asignatura1.setCreditos(creditos);
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(String nombre, int creditos) {
        this.asignatura2 = new Asignatura();
        this.asignatura2.setNombre(nombre);
        this.asignatura2.setCreditos(creditos);
    }

    @Override
    public String toString() {
        return String.format("Datos del Docente:\n"
                + "Nombres: %s\n" + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "    Asignatura 1: %s con número de créditos %d\n"
                + "    Asignatura 2: %s con número de créditos %d\n"
                + "El docente tiene los siguientes títulos académicos:\n"
                + "    Título 3er nivel: Licenciado en %s - %s\n"
                + "    Título 4er nivel: Licenciado en %s - %s\n",
                this.nombres, this.apellidos,
                this.asignatura1.getNombre(), this.asignatura1.getCreditos(),
                this.asignatura2.getNombre(), this.asignatura2.getCreditos(),
                this.titulo_tercer_nivel.getNombre(), this.titulo_tercer_nivel.getNombre_universidad(),
                this.titulo_cuarto_nivel.getNombre(), this.titulo_cuarto_nivel.getNombre_universidad());
    }
}
