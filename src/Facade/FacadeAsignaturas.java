package Facade;

import Pojos.Asignatura;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public interface FacadeAsignaturas {

    public ArrayList<Asignatura> selectAllAsignatura();

    public ArrayList<Asignatura> selectAsignatura(int codigo);

    public Asignatura insertAsignatura(int codigo, String titulo, int creditos);

    public Asignatura updateAsignatura(int codigo, String titulo, int creditos);

    public Asignatura deleteAsignatura(int codigo);
}
