/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Pojos.AulasAsig;
import Pojos.AulasAsigId;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utiles.HibernateUtil;

/**
 *
 * @author Alumno
 */
public class AulaAsigDAO {

    public void InsertUpdateAsigNota() {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción

        Pojos.AulasAsigId idaula = new AulasAsigId();
        Pojos.AulasAsig aula = new AulasAsig();

        idaula.setCodAsig(0);
        idaula.setCodAula(0);
        idaula.setDniPro("65465454R");

        aula.setId(idaula);

        session.saveOrUpdate(aula); //Guarda el objeto creado en la BBDD.
        tx.commit(); //Materializa la transacción
        session.close();
    }

}
