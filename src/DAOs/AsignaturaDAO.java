package DAOs;

import Pojos.Asignatura;
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
public class AsignaturaDAO implements AsigDAOInter {

    Asignatura asig;
    //Factory factoria

    
    public ArrayList<Asignatura> selectAllAsignatura() {
        ArrayList<Asignatura> array = new ArrayList<>();
        String c = "select a from Asignatura a";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Asignatura au = (Asignatura) iterador.next();
            array.add(au);
        }
        session.close();
        return array;
    }

    
    public ArrayList<Asignatura> selectAsignatura(int codigo) {
        ArrayList<Asignatura> array = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Asignatura al;
        al = (Asignatura) session.get(Asignatura.class, codigo);

        session.close();
        return array;
    }

    @Override
    public void InsertUpdateAsignatura(int codigo, String titulo, int creditos) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        Asignatura au = new Asignatura();
        au.setCodigo(codigo);
        au.setTitulo(titulo);
        au.setCreditos(creditos);

        session.saveOrUpdate(au); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void deleteAsignatura(int codigo) {
        String c = "delete from Asignatura where codigo='" + codigo + "'";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

    @Override
    public DefaultTableModel todoAsignaturas() {
        DefaultTableModel AsigTab = new DefaultTableModel();
        Object[] fila = new Object[3];
        for (Asignatura as : selectAllAsignatura()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            AsigTab.addColumn("Cod.");
            AsigTab.addColumn("Titulo");
            AsigTab.addColumn("Creditos");
            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = as.getCodigo();
            fila[1] = as.getTitulo();
            fila[2] = as.getCreditos();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            AsigTab.addRow(fila);
        }
        return AsigTab;
    }
}
