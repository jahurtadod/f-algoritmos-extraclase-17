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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Docente docente1 = new Docente();
        
        docente1.setNombres("Luis V.");
        docente1.setApellidos("Perez J.");
        docente1.setAsignatura1("Matemáticas", 8);
        docente1.setAsignatura2("Física", 6);
        docente1.setTitulo_tercer_nivel("Licenciado en Físico-Matemáticas", "Universidad Politécnica");
        docente1.setTitulo_cuarto_nivel("Magister en Docencia Matemática", "Universidad Valenciana");
        
        Docente docente2 = new Docente();
        
        docente2.setNombres("Ana M.");
        docente2.setApellidos("Velez P.");
        docente2.setAsignatura1("Sociales", 9);
        docente2.setAsignatura2("Literatura", 10);
        docente2.setTitulo_tercer_nivel("Licenciado en Ciencias Sociales", "Universidad Saleciana");
        docente2.setTitulo_cuarto_nivel("Magister en Docencia Social", "Uniersidad Cataluña");        
        
        System.out.println(docente1.toString());
        System.out.println(docente2.toString());
        
    }
    
}
