/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Pojos.Aulas;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface AulaDAOInter {

    public ArrayList<Aulas> selectAllAulas();

    public ArrayList<Aulas> selectAulas(int id);

    public void updateAulas();

    public void insertAulas();

    public void deleteAulas();
}
