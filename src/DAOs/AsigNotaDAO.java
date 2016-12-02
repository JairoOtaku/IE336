/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utiles.HibernateUtil;

/**
 *
 * @author Alumno
 */
public class AsigNotaDAO {

    public void InsertUpdateAsigNota() {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        Pojos.AsigNotaId idNota = new Pojos.AsigNotaId();
        Pojos.AsigNota nota = new Pojos.AsigNota();
        
        idNota.setCodAsig(2);
        idNota.setDniAlum("43534564d");
        
        nota.setId(idNota);
        nota.setNota(5);
        

        session.saveOrUpdate(nota); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }
}
