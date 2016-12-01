package DAOs;

import Pojos.Aulas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utiles.HibernateUtil;

/**
 *
 * @author Jairo_Otaku
 */
public class AulasDAO implements AulaDAOInter {

    Aulas aulas;
    //Factory factoria

    @Override
    public ArrayList<Aulas> selectAllAulas() {
        ArrayList<Aulas> array = new ArrayList<>();
        String c = "select a from Aulas a";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Aulas au = (Aulas) iterador.next();
            array.add(au);
        }
        session.close();
        return array;
    }

    @Override
    public ArrayList<Aulas> selectAulas(int NAula) {
        ArrayList<Aulas> array = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Aulas al;
        al = (Aulas) session.get(Aulas.class, NAula);

        session.close();
        return array;
    }

    @Override
    public void InsertUpdateAulas(int NAula, String nombreEdificio) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        Aulas au = new Aulas();
        au.setNAula(NAula);
        au.setNombreEdificio(nombreEdificio);

        session.saveOrUpdate(au); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void deleteAulas(int NAula) {
        String c = "delete from Aulas where NAula='" + NAula + "'";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

    @Override
    public DefaultTableModel todoAulas() {
        DefaultTableModel AulaTab = new DefaultTableModel();
        Object[] fila = new Object[2];
        for (Aulas au : selectAllAulas()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            AulaTab.addColumn(au.getNAula());
            AulaTab.addColumn(au.getNombreEdificio());

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = au.getNAula();
            fila[1] = au.getNombreEdificio();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            AulaTab.addRow(fila);
        }
        return AulaTab;
    }
}
