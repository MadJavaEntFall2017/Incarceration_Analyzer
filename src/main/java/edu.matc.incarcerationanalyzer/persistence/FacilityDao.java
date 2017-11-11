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

<<<<<<< HEAD
    public Facility getFacility(int id) {
        Facility facility= null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            facility = (Facility) session.get(Facility.class, id);
        } catch (HibernateException he) {
            log.error("Error getting facility with id: " + id, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return facility;
    }

    public Facility addFacility(Facility facility) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(facility);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of facility: " + facility, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return facility;
    }

    public void deleteFacility(Facility facility) {

        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(facility);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back delete of facility id: " + facility, he2);
                }
            }
=======
    public void addNewRecord(Object object) {

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(object);
            tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for " + object.getClass(), he);
>>>>>>> ivan
        } finally {
            if (session != null) {
                session.close();
            }
        }
<<<<<<< HEAD

=======
>>>>>>> ivan
    }
}

