/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Pojos.Asignatura;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface AsigDAOInter {

    public ArrayList<Asignatura> selectAllAsignatura();

    public ArrayList<Asignatura> selectAsignatura(int id);

    public void updateAsignatura();

    public void insertAsignatura();

    public void deleteAsignatura();
}
