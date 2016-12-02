package DAOs;

import Pojos.Profesor;
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
public class ProfesorDAO implements ProfeDAOInter {

    Profesor profe;
    //Factory factoria

    public ArrayList<Profesor> selectAllProfesor() {
        ArrayList<Profesor> array = new ArrayList<>();
        String c = "select a from Profesor a";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Profesor p = (Profesor) iterador.next();
//            System.out.println("-" + p.getDni());
            array.add(p);
        }
        session.close();
        return array;
    }

    @Override
    public DefaultTableModel todoProfes() {
        DefaultTableModel ProfeTab = new DefaultTableModel();
        Object[] fila = new Object[11];
        for (Profesor p : selectAllProfesor()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            ProfeTab.addColumn("DNI");
            ProfeTab.addColumn("Nombre");
            ProfeTab.addColumn("Apellidos");
            ProfeTab.addColumn("Domicilio");
            ProfeTab.addColumn("Telefono");
            ProfeTab.addColumn("Asignatura");
            ProfeTab.addColumn("Asignatura");
            ProfeTab.addColumn("Asignatura");
            ProfeTab.addColumn("Asignatura");
            ProfeTab.addColumn("Asignatura");
            ProfeTab.addColumn("Asignatura");

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = p.getDni();
            fila[1] = p.getNombre();
            fila[2] = p.getApellidos();
            fila[3] = p.getDomicilio();
            fila[4] = p.getTelefono();
            fila[5] = p.getAsignatura1();
            fila[6] = p.getAsignatura2();
            fila[7] = p.getAsignatura3();
            fila[8] = p.getAsignatura4();
            fila[9] = p.getAsignatura5();
            fila[10] = p.getAsignatura6();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            ProfeTab.addRow(fila);
        }
        return ProfeTab;
    }

//    @Override
//    public ArrayList<Profesor> selectProfesor(int dni) {
//        ArrayList<Profesor> array = new ArrayList<>();
//        Transaction tx = null;
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Profesor p;
//        p = (Profesor) session.get(Profesor.class, dni);
//        // System.out.println("Autor:" + p.getNombre());
//        session.close();
//        return array;
//    }
    @Override
    public void InsertUpdateProfesor(String dni, String nombre, String apellidos, String domicilio, int telefono, String asignatura1, String asignatura2, String asignatura3, String asignatura4, String asignatura5, String asignatura6) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción
        Profesor p = new Profesor();
        p.setDni(dni);
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setDomicilio(domicilio);
        p.setTelefono(0);
        p.setAsignatura1(asignatura1);
        p.setAsignatura2(asignatura2);
        p.setAsignatura3(asignatura3);
        p.setAsignatura4(asignatura4);
        p.setAsignatura5(asignatura5);
        p.setAsignatura6(asignatura6);
        session.saveOrUpdate(p); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void deleteProfesor(String dni) {
        String c = "delete from Profesor where dni='" + dni + "'";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

}
