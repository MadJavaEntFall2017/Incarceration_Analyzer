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
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        List<Facility> facilities = session.createCriteria(Facility.class).list();
        session.close();
        return facilities;
    }
}
