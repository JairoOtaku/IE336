package Facade;

import DAOs.AlumnoDAO;
import DAOs.AsignaturaDAO;
import DAOs.ProfeDAOInter;
import DAOs.ProfesorDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo_Otaku
 */
public class MainFacade {

    private ProfeDAOInter profe = new ProfesorDAO();
    private AlumnoDAO alumno = new AlumnoDAO();
    private AsignaturaDAO asig = new AsignaturaDAO();

    public void InsertUpdateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6) {
        profe.InsertUpdateProfesor(dni, nombre, apellidos, domicilio, telefono, asignatura1, asignatura2, asignatura3, asignatura4, asignatura5, asignatura6);
    }

    public void deleteProfesor(String dni) {
        profe.deleteProfesor(dni);
    }

    public DefaultTableModel todoProfes() {
        return profe.todoProfes();
    }

}
