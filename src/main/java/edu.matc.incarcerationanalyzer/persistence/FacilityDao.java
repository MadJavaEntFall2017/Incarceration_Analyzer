package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.Facility;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FacilityDao {
    private final Logger log = Logger.getLogger(this.getClass());
    Session session = null;
    Transaction tx = null;


    public List<Facility> getAllFacilities() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<Facility> facilities = session.createCriteria(Facility.class).list();
        session.close();
        return facilities;
    }

    public void addNewRecord(Object object) {

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(object);
            tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for " + object.getClass(), he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
