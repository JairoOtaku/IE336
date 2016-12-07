package Facade;

import DAOs.AlumDAOInter;
import DAOs.AlumnoDAO;
import DAOs.AsignaturaDAO;
import DAOs.AsignaturaDAOInter;
import DAOs.ProfeDAOInter;
import DAOs.ProfesorDAO;
import javax.swing.table.DefaultTableModel;
import utiles.MyFactory;

/**
 *
 * @author Jairo_Otaku
 */
public class MainFacade implements FacadeInter {

    private ProfeDAOInter profe = (ProfesorDAO) MyFactory.getObject("PROFESOR");
    private AlumDAOInter alumno = (AlumnoDAO) MyFactory.getObject("ALUMNO");
    private AsignaturaDAOInter asig = (AsignaturaDAO) MyFactory.getObject("ASIGNATURA");

    /*PROFESOR*/
    @Override
    public void InsertUpdateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6) {
        profe.InsertUpdateProfesor(dni, nombre, apellidos, domicilio, telefono, asignatura1, asignatura2, asignatura3, asignatura4, asignatura5, asignatura6);
    }

    @Override
    public void deleteProfesor(String dni) {
        profe.deleteProfesor(dni);
    }

    @Override
    public DefaultTableModel todoProfes() {
        return profe.todoProfes();
    }

    /*ALUMNOS*/
    @Override
    public void InsertUpdateAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso) {
        alumno.InsertUpdateAlumno(dni, nombre, apellidos, domicilio, telefono, acceso);
    }

    @Override
    public void deleteAlumno(String dni) {
        alumno.deleteAlumno(dni);
    }

    @Override
    public DefaultTableModel todoAlumnos() {
        return alumno.todoAlumnos();
    }

    /*ASIGNATURA*/
    @Override
    public void InsertUpdateAsignatura(int codigo, String titulo, int creditos) {
        asig.InsertUpdateAsignatura(codigo, titulo, creditos);
    }

    @Override
    public DefaultTableModel todoAsignaturas() {
        return asig.todoAsignaturas();
    }

    @Override
    public void deleteAsignatura(int codigo) {
        asig.deleteAsignatura(codigo);
    }
}
