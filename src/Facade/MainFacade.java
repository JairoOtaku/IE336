package Facade;

import DAOs.AlumnoDAO;
import DAOs.ProfeDAOInter;
import DAOs.ProfesorDAO;

/**
 *
 * @author Jairo_Otaku
 */
public class MainFacade {

    private ProfeDAOInter profe = new ProfesorDAO();
    private AlumnoDAO alumno= new AlumnoDAO();

}
