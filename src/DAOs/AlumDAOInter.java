package DAOs;

import Pojos.Alumno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo_Otaku
 */
public interface AlumDAOInter {

    public ArrayList<Alumno> selectAllAlumnos();

    public ArrayList<Alumno> selectAlumno(int dni);

    public void InsertUpdateAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso);

    public void deleteAlumno(String dni);

    public DefaultTableModel todoAlumnos();
}
