package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.*;
import edu.matc.incarcerationanalyzer.persistence.FacilityDao;
import edu.matc.incarcerationanalyzer.utility.Convertions;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("json/facility")
public class JsonOutput{

    //creating XML entities
    GenerateListOfXML wholeList = new GenerateListOfXML();
    FacilityXML facilityXML = new FacilityXML();
    AgePopXML agePopXML = new AgePopXML();
    EthnicPopXML ethnicPopXML = new EthnicPopXML();

    //creating hibernate entities
    Facility facility = new Facility();
    FacilityDao facilityDao = new FacilityDao();

    List<Facility> listFacilities = new ArrayList<>();
    Convertions convertions = new Convertions();


    @GET
    @Path("")
    public List<FacilityXML> getAllFacilityXML(){
        listFacilities = facilityDao.getAllFacilities();

        for (Facility currentItem: listFacilities
                ) {
            facilityXML = new FacilityXML();
            convertions.facilityToXML(facilityXML, currentItem);
            wholeList.addFacility(facilityXML);
        }

        return wholeList.getListFacility();
    }

    @POST
    @Path("")
    public List<FacilityXML> postAllFacilityXML(){
        return this.getAllFacilityXML();
    }

    @GET
    @Path("/all")
    public GenerateListOfXML getTheWholeData(){
        listFacilities = facilityDao.getAllFacilities();
        GroupOfXML groupOfXML;

        for (Facility currentItem: listFacilities
                ) {
            groupOfXML  = new GroupOfXML();
            facilityXML = new FacilityXML();
            ethnicPopXML = new EthnicPopXML();
            agePopXML = new AgePopXML();

            convertions.facilityToXML(facilityXML, currentItem);
            convertions.ethnicToXML(ethnicPopXML, currentItem.getEthnicitypop());
            convertions.ageToXML(agePopXML, currentItem.getAgepop());

            groupOfXML.setFacilityXML(facilityXML);
            groupOfXML.setEthnicPopXML(ethnicPopXML);
            groupOfXML.setAgePopXML(agePopXML);

            wholeList.addGroupOfXml(groupOfXML);

        }
        return wholeList;
    }

    @POST
    @Path("/all")
    public GenerateListOfXML postTheWholeData(){
        return this.getTheWholeData();
    }


    @GET
    @Path("/{pathParam}")
    public List<FacilityXML> getFacilityXMLById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));
        convertions.facilityToXML(facilityXML, facility);
        wholeList.addFacility(facilityXML);

        return wholeList.getListFacility();
    }

    @POST
    @Path("/{pathParam}")
    public List<FacilityXML> postFacilityXMLById(@PathParam("pathParam") String id){
        return this.getFacilityXMLById(id);
    }

    @GET
    @Path("/{pathParam}/age")
    public GenerateListOfXML getFacilityAndAgeById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));

        convertions.facilityToXML(facilityXML, facility);
        convertions.ageToXML(agePopXML, facility.getAgepop());

        wholeList.addFacility(facilityXML);
        wholeList.addAge(agePopXML);

        return wholeList;
    }

    @POST
    @Path("/{pathParam}/age")
    public GenerateListOfXML postFacilityAndAgeById(@PathParam("pathParam") String id){
        return this.getFacilityAndAgeById(id);
    }

    @GET
    @Path("/{pathParam}/ethnic")
    public GenerateListOfXML getFacilityAndEthnicById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));

        convertions.facilityToXML(facilityXML, facility);
        convertions.ethnicToXML(ethnicPopXML, facility.getEthnicitypop());

        wholeList.addFacility(facilityXML);
        wholeList.addEthnic(ethnicPopXML);

        return wholeList;
    }

    @POST
    @Path("/{pathParam}/ethnic")
    public GenerateListOfXML postFacilityAndEthnicById(@PathParam("pathParam") String id){

        return this.getFacilityAndEthnicById(id);
    }

    @GET
    @Path("/{pathParam}/age/ethnic")
    public GenerateListOfXML getFacilityAgeAndEthnicById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));
        convertions.facilityToXML(facilityXML, facility);
        convertions.ageToXML(agePopXML, facility.getAgepop());
        convertions.ethnicToXML(ethnicPopXML, facility.getEthnicitypop());

        wholeList.addFacility(facilityXML);
        wholeList.addAge(agePopXML);
        wholeList.addEthnic(ethnicPopXML);

        return wholeList;
    }

    @POST
    @Path("/{pathParam}/age/ethnic")
    public GenerateListOfXML postFacilityAgeAndEthnicById(@PathParam("pathParam") String id){
        return this.getFacilityAgeAndEthnicById(id);
    }
}
