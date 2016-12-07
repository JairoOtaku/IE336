/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jairo_Otaku
 */
public interface FacadeInter {

    /*PROFESOR*/
    public void InsertUpdateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6);

    public void deleteProfesor(String dni);

    public DefaultTableModel todoProfes();

    /*ALUMNOS*/
    public void InsertUpdateAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso);

    public void deleteAlumno(String dni);

    public DefaultTableModel todoAlumnos();

    /*ASIGNATURA*/
    public void InsertUpdateAsignatura(int codigo, String titulo, int creditos);

    public DefaultTableModel todoAsignaturas();

    public void deleteAsignatura(int codigo);
}
