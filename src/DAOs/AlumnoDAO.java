package DAOs;

import Pojos.Alumno;
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
public class AlumnoDAO implements AlumDAOInter {

    Alumno alum;
    //Factory factoria

    
    public ArrayList<Alumno> selectAllAlumnos() {
        ArrayList<Alumno> arralum = new ArrayList<>();

        String c = "select a from Alumno a";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        List results = q.list();
        Iterator iterador = results.iterator();
        while (iterador.hasNext()) {
            Alumno p = (Alumno) iterador.next();
            arralum.add(p);
        }
        session.close();
        return arralum;
    }

    @Override
    public DefaultTableModel todoAlumnos() {
        DefaultTableModel AlumTab = new DefaultTableModel();
        Object[] fila = new Object[6];
        for (Alumno al : selectAllAlumnos()) {
            // CREAMOS LOS NOMBRES DE LAS COLUMNAS
            AlumTab.addColumn("DNI");
            AlumTab.addColumn("Nombre");
            AlumTab.addColumn("Apellidos");
            AlumTab.addColumn("Domicilio");
            AlumTab.addColumn("Telefono");
            AlumTab.addColumn("Acceso");

            // RELLENAMOS EL ARRAY CON LOS OBJETOS
            fila[0] = al.getDni();
            fila[1] = al.getNombre();
            fila[2] = al.getApellidos();
            fila[3] = al.getDomicilio();
            fila[4] = al.getTelefono();
            fila[5] = al.getAcceso();

            //METEMOS EL ARRAY EN LA TABLA POR COLUMNAS
            AlumTab.addRow(fila);
        }
        return AlumTab;
    }

    
    public ArrayList<Alumno> selectAlumno(int dni) {
        ArrayList<Alumno> arralum = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Alumno al;
        al = (Alumno) session.get(Alumno.class, dni);

        session.close();
        return arralum;
    }

    @Override
    public void InsertUpdateAlumno(String dni, String nombre, String apellidos, String domicilio, int telefono, int acceso) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        Alumno al = new Alumno();
        al.setDni(dni);
        al.setNombre(nombre);
        al.setApellidos(apellidos);
        al.setDomicilio(domicilio);
        al.setTelefono(telefono);
        al.setAcceso(acceso);

        session.saveOrUpdate(al); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

    @Override
    public void deleteAlumno(String dni) {
        String c = "delete from Alumno where dni='" + dni + "'";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(c);
        session.close();
    }

}
