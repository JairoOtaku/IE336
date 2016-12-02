/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Pojos.Profesor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public interface ProfeDAOInter {

 

    //public ArrayList<Profesor> selectProfesor(int dni);

    public void InsertUpdateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6);

    public void deleteProfesor(String dni);

    public DefaultTableModel todoProfes();
}
