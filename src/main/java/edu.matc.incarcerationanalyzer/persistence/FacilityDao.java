package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.Facility;
import edu.matc.incarcerationanalyzer.entity.FacilityXML;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

    //Get all the facilities as List of objects
    public List<FacilityXML> getAllFacilitiesXML() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<FacilityXML> facilities = session.createCriteria(Facility.class).list();
        session.close();
        return facilities;
    }


    public Facility getFacility(int id) {
        Facility facility= null;
        Session session = null;

            session = SessionFactoryProvider.getSessionFactory().openSession();
            facility = (Facility) session.get(Facility.class, id);

            if (session != null) {
                session.close();
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
        } catch (HibernateException he) {
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back delete of facility id: " + facility, he2);
                }
            }
        }
    }
}