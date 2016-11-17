package Facade;

import Pojos.Aulas;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface FacadeAulas {

    public  ArrayList<Aulas> selectAllAulas();

    public  ArrayList<Aulas> selectAulas(int NAula, String nombreEdificio);

    public Aulas insertAulas(int NAula, String nombreEdificio);

    public Aulas updateAulas(int NAula, String nombreEdificio);

    public Aulas deleteAulas(int NAula, String nombreEdificio);
}
