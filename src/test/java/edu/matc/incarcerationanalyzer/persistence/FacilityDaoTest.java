package edu.matc.incarcerationanalyzer.persistence;

<<<<<<< HEAD
import edu.matc.incarcerationanalyzer.entity.Agepop;
import edu.matc.incarcerationanalyzer.entity.Ethnicitypop;
import edu.matc.incarcerationanalyzer.entity.Facility;
//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
=======
import edu.matc.incarcerationanalyzer.entity.*;
//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
>>>>>>> ivan
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FacilityDaoTest {
<<<<<<< HEAD

   private final Logger log = Logger.getLogger(this.getClass());

    FacilityDao facilityDao;
=======
/*
   // private final Logger log = Logger.getLogger(this.getClass());
    FacilityDao facilityDao = new FacilityDao();
>>>>>>> ivan
    int initialFacilityCount;
    Facility facility;
    @Before
    public void facilitySetup() {
        facilityDao = new FacilityDao();
        initialFacilityCount = facilityDao.getAllFacilities().size();

        //create test facility
        facility = new Facility();
        Agepop agepop = new Agepop(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Ethnicitypop ethnicitypop = new Ethnicitypop(1, 2, 3, 4);
        facility.setName("TestFacility");
        facility.setPopulation(50);
        facility.setAgepop(agepop);
        facility.setEthnicitypop(ethnicitypop);
    }

<<<<<<< HEAD
    @After
    public void cleanup() {
        facilityDao.deleteFacility(facility);
    }
=======
  @Test
    public void getAllFacilities() throws Exception {
>>>>>>> ivan

    @Test
    public void getAllFacilitiesTest() throws Exception {
        List<Facility> facilities = facilityDao.getAllFacilities();
        assertTrue("Failed to get all facilities" + facilities.size(), facilities.size() > 0);
    }

    @Test
<<<<<<< HEAD
    public void getFacilityTest() throws Exception {
        Facility facility = facilityDao.getFacility(1);
        assertNotNull("User usertest was not found", facility);
    }

    @Test
    public void addFacility() throws Exception {
        facilityDao.addFacility(facility);
        assertEquals("Facility was not added to the database", initialFacilityCount +1, facilityDao.getAllFacilities().size());
    }

    @Test
    public void deleteFacility() throws Exception {
        facilityDao.addFacility(facility);
        initialFacilityCount = facilityDao.getAllFacilities().size();
        facilityDao.deleteFacility(facility);
        assertEquals("Facility was not deleted from the database", initialFacilityCount - 1, facilityDao.getAllFacilities().size());
    }

=======
    public void addRecord(){
        final Logger log = Logger.getLogger(this.getClass());
        Session session = null;
        Transaction tx = null;

      Facility facility = new Facility();

      facility.setPopulation(2000);
      facility.setName("Madison");

        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            tx = session.beginTransaction();

            facility.setPopulation(2000);
            facility.setName("Madison");

            session.save(facility);
            tx.commit();
        } catch (HibernateException he) {
            if (tx != null) tx.rollback();
            log.info("Error adding new record for " + he);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Test
    public void addingRecordForAge(){
        Agepop agepop = new Agepop();
        agepop.setAge18To21(20);
        agepop.setAge22To25(30);

        FacilityDao facilityDao = new FacilityDao();
        facilityDao.addNewRecord(agepop);
    }

    @Test
    public void testingFacilitySQL() throws Exception{
        List<FacilitySQL> facilitySQLS = new ArrayList<>();
        List<AgepopSQL> agepopSQLS = new ArrayList<>();
        List<EthnicpopSQL> ethnicpopSQLS = new ArrayList<>();
        HibernateDaoAndSQL hibernateDaoAndSQL = new HibernateDaoAndSQL();

        String sql = "SELECT * FROM facility";
        facilitySQLS = hibernateDaoAndSQL.getQueryFromFacilitySQL(sql);

        sql = "SELECT * FROM agepop";
        agepopSQLS = hibernateDaoAndSQL.getQueryFromAgeSQL(sql);
>>>>>>> ivan

        sql="SELECT * FROM ethnicitypop";
        ethnicpopSQLS = hibernateDaoAndSQL.getQueryFromEthnicSQL(sql);
    }
*/
}