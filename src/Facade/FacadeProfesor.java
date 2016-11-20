package Facade;

import Pojos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Jairo_Otaku
 */
public interface FacadeProfesor {

    public ArrayList<Profesor> selectAllProfesor();

    public ArrayList<Profesor> selectProfesor(int codigo);

    public Profesor insertProfesorSimple(String dni, String nombre, String apellidos, String domicilio, int telefono);

    public Profesor insertProfesorCompleto(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6);

    public Profesor updateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono);

    public Profesor deleteProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono);

}
