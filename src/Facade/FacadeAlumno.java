package Facade;

import Pojos.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Jairo_Otaku
 */
public interface FacadeAlumno {

    public ArrayList<Alumno> selectAllAlumno();

    public ArrayList<Alumno> selectAlumno(String dni);

    public Alumno insertAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso);

    public Alumno updateAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso);

    public Alumno deleteAlumno(String dni);
}
