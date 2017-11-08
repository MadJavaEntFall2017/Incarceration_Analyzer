package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.Agepop;
import edu.matc.incarcerationanalyzer.entity.Ethnicitypop;
import edu.matc.incarcerationanalyzer.entity.Facility;
//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FacilityDaoTest {

   private final Logger log = Logger.getLogger(this.getClass());

    FacilityDao facilityDao;
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

    @After
    public void cleanup() {
        facilityDao.deleteFacility(facility);
    }

    @Test
    public void getAllFacilitiesTest() throws Exception {
        List<Facility> facilities = facilityDao.getAllFacilities();
        assertTrue("Failed to get all facilities" + facilities.size(), facilities.size() > 0);
    }

    @Test
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


}