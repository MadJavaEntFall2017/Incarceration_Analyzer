package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.Facility;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class FacilityDao {
    private final Logger log = Logger.getLogger(this.getClass());

    public List<Facility> getAllFacilities() {
        List<Facility> facilities = new ArrayList<Facility>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            facilities = session.createCriteria(Facility.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all recipes", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return facilities;
    }
}
