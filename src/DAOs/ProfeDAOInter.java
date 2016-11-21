/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Pojos.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface ProfeDAOInter {

    public ArrayList<Profesor> selectAllProfesor() ;

    public ArrayList<Profesor> selectProfesor(int dni);

    public void updateProfesor();

    public void insertProfesor();

    public void deleteProfesor();
}
