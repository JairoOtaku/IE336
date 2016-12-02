/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Pojos.Asignatura;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public interface AsigDAOInter {

   
    public void InsertUpdateAsignatura(int codigo, String titulo, int creditos);

    public void deleteAsignatura(int codigo);

    public DefaultTableModel todoAsignaturas();

}
