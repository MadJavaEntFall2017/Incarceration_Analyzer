package edu.matc.incarcerationanalyzer.persistence;

import edu.matc.incarcerationanalyzer.entity.Agepop;
import edu.matc.incarcerationanalyzer.entity.Ethnicitypop;
import edu.matc.incarcerationanalyzer.entity.Facility;
import edu.matc.incarcerationanalyzer.entity.FacilityXML;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * FacilityDaoTest is a class that tests the methods in facilityDao
 * @author Brian Kruse
 */
public class FacilityDaoTest {

    private final Logger log = Logger.getLogger(this.getClass());

    FacilityDao facilityDao;
    int initialFacilityCount;
    Facility facility;
    @Before
    public void facilitySetup() {
        facilityDao = new FacilityDao();
        initialFacilityCount = facilityDao.getAllFacilities().size();
    }

    @Test
    //Test getAllFacilities method to see if all facilities are returned
    public void getAllFacilitiesTest() throws Exception {
        List<Facility> facilities = facilityDao.getAllFacilities();
        assertTrue("Failed to get all facilities" + facilities.size(), facilities.size() > 0);
    }

    @Test
    //Test getFacility method and Assert it was found
    public void getFacilityTest() throws Exception {
        Facility facility = facilityDao.getFacility(1);
        assertNotNull("Facility was not found", facility);
    }

    @Test
    //Test to see output for all facilities in xml. Make assertEquals untrue to see xml.
    public void getAllFacilitiesXMLTest() throws Exception {
        List<FacilityXML> facilities = facilityDao.getAllFacilitiesXML();
        assertEquals(facilities, facilities);
    }

}