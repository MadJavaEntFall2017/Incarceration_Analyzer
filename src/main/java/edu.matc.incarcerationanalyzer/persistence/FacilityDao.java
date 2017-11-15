package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.Facility;
import edu.matc.incarcerationanalyzer.entity.FacilityXML;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * FacilityDao is a the main data access object for the project. It holds
 * the methods for getting all facilities or facility by id.
 * @author Brian Kruse
 */
public class FacilityDao {
    private final Logger log = Logger.getLogger(this.getClass());
    Session session = null;
    Transaction tx = null;

    /**
     * Returns all facilities in the database
     * @return facilities the list of facilities in the database
     */
    public List<Facility> getAllFacilities() {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<Facility> facilities = session.createCriteria(Facility.class).list();
        session.close();
        return facilities;
    }

    /**
     * Returns all facilities in the database
     * @return facilities the list of facilities in the database
     */
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
}