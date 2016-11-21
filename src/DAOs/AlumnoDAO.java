package DAOs;

import Pojos.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Jairo_Otaku
 */
public class AlumnoDAO implements AlumDAOInter {

    Alumno alum;
    //Factory factoria

    @Override
    public ArrayList<Alumno> selectAllAlumnos() {
        ArrayList<Alumno> arralum = new ArrayList<>();
        return arralum;
    }

    @Override
    public ArrayList<Alumno> selectAlumno(int dni) {
        ArrayList<Alumno> arralum = new ArrayList<>();
        return arralum;
    }

    @Override
    public void updateAlumno() {

    }

    @Override
    public void insertAlumno() {

    }

    @Override
    public void deleteAlumno() {

    }

}
