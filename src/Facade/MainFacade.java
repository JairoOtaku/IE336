package Facade;

import Pojos.Alumno;
import Pojos.Asignatura;
import Pojos.Aulas;
import Pojos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Jairo_Otaku
 */
public class MainFacade implements FacadeAlumno, FacadeAsignaturas, FacadeAulas, FacadeProfesor {

    //-----------  ALUMNOS  ----------
    @Override
    public ArrayList<Alumno> selectAllAlumno() {
        ArrayList<Alumno> array = new ArrayList<>();
        Alumno a = new Alumno();
        a.selectAllAlumno();
        return array;
    }

    @Override
    public ArrayList<Alumno> selectAlumno(String dni) {
        ArrayList<Alumno> array = new ArrayList<>();
        Alumno a = new Alumno();
        a.selectAlumno();
        return array;
    }

    @Override
    public Alumno insertAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso) {
        Alumno a = new Alumno();
        a.insertAlumnos();
        return a;
    }

    @Override
    public Alumno updateAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso) {
        Alumno a = new Alumno();
        a.updateAlumnos();
        return a;
    }

    @Override
    public Alumno deleteAlumno(String dni) {
        Alumno a = new Alumno();
        a.deleteAlumnos();
        return a;
    }

    //--------------  ASIGNATURAS  ------------------
    @Override
    public ArrayList<Asignatura> selectAllAsignatura() {
        ArrayList<Asignatura> array = new ArrayList<>();
        Asignatura asi = new Asignatura();
        asi.selectAllAsignatura();
        return array;
    }

    @Override
    public ArrayList<Asignatura> selectAsignatura(int codigo) {
        ArrayList<Asignatura> array = new ArrayList<>();
        Asignatura asi = new Asignatura();
        asi.selectAsignatura();
        return array;
    }

    @Override
    public Asignatura insertAsignatura(int codigo, String titulo, int creditos) {
        Asignatura asi = new Asignatura();
        asi.insertAsignatura();
        return asi;
    }

    @Override
    public Asignatura updateAsignatura(int codigo, String titulo, int creditos) {
        Asignatura asi = new Asignatura();
        asi.updateAsignatura();
        return asi;
    }

    @Override
    public Asignatura deleteAsignatura(int codigo) {
        Asignatura asi = new Asignatura();
        asi.deleteAsignatura();
        return asi;
    }

    //------------------  AULAS  ------------------------
    @Override
    public ArrayList<Aulas> selectAllAulas() {
        ArrayList<Asignatura> array = new ArrayList<>();
        Aulas aul = new Aulas();
        aul.selectAllAulas();
        return array;
    }

    @Override
    public ArrayList<Aulas> selectAulas(int NAula, String nombreEdificio) {
        ArrayList<Aulas> array = new ArrayList<>();
        Aulas aul = new Aulas();
        aul.selectAulas();
        return array;
    }

    @Override
    public Aulas insertAulas(int NAula, String nombreEdificio) {
        Aulas aul = new Aulas();
        aul.insertAulas();
        return aul;
    }

    @Override
    public Aulas updateAulas(int NAula, String nombreEdificio) {
        Aulas aul = new Aulas();
        aul.updateAulas();
        return aul;
    }

    @Override
    public Aulas deleteAulas(int NAula, String nombreEdificio) {
        Aulas aul = new Aulas();
        aul.deleteAulas();
        return aul;
    }

    //-----------------  PROFESOR  ---------------------
    @Override
    public ArrayList<Profesor> selectAllProfesor() {
        ArrayList<Profesor> array = new ArrayList<>();
        Profesor pro = new Profesor();
        pro.selectAllProfesor();
        return array;
    }

    @Override
    public ArrayList<Profesor> selectProfesor(int codigo) {
        ArrayList<Profesor> array = new ArrayList<>();
        Profesor pro = new Profesor();
        pro.selectAllProfesor();
        return array;
    }

    @Override
    public Profesor insertProfesorSimple(String dni, String nombre, String apellidos, String domicilio, int telefono) {
        Profesor pro = new Profesor();
        pro.selectProfesor();
        return pro;
    }

    @Override
    public Profesor insertProfesorCompleto(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6) {
        Profesor pro = new Profesor();
        pro.insertProfesor();
        return pro;
    }

    @Override
    public Profesor updateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono) {
        Profesor pro = new Profesor();
        pro.updateProfesor();
        return pro;
    }

    @Override
    public Profesor deleteProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono) {
        Profesor pro = new Profesor();
        pro.deleteProfesor();
        return pro;
    }

}
