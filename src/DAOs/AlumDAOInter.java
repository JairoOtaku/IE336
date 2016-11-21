package DAOs;

import Pojos.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Jairo_Otaku
 */
public interface AlumDAOInter {

    public ArrayList<Alumno> selectAllAlumnos();

    public ArrayList<Alumno> selectAlumno(int dni);

    public void updateAlumno();

    public void insertAlumno();

    public void deleteAlumno();
}
