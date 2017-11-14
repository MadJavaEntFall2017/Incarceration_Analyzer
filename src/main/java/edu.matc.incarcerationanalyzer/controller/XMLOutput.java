package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.*;
import edu.matc.incarcerationanalyzer.persistence.FacilityDao;
import edu.matc.incarcerationanalyzer.utility.Convertions;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_XML)
@Path("xml/facility")
public class XMLOutput {

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
    public Response getAllFacilityXML(){
        listFacilities = facilityDao.getAllFacilities();

        for (Facility currentItem: listFacilities
             ) {
            facilityXML = new FacilityXML();
            convertions.facilityToXML(facilityXML, currentItem);
            wholeList.addFacility(facilityXML);
        }

        return Response.status(200).entity(wholeList.getListFacility()).build();
    }

    @POST
    @Path("")
    public Response postAllFacilityXML(){
        return this.getAllFacilityXML();
    }

    @GET
    @Path("/all")
    public Response getTheWholeData(){
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
        return Response.status(200).entity(wholeList).build();
    }

    @POST
    @Path("/all")
    public Response postTheWholeData(){
        return this.getTheWholeData();
    }


    @GET
    @Path("/{pathParam}")
    public Response getFacilityXMLById(@PathParam("pathParam") String id) {

            facility = facilityDao.getFacility(Integer.parseInt(id));
            convertions.facilityToXML(facilityXML, facility);
            wholeList.addFacility(facilityXML);

            MessageForException  messageForException = new MessageForException();
            messageForException.setMessage("something went wrong");


        return Response.status(200).entity(wholeList).build();
    }

    @POST
    @Path("/{pathParam}")
    public Response postFacilityXMLById(@PathParam("pathParam") String id){
        return this.getFacilityXMLById(id);
    }

    @GET
    @Path("/{pathParam}/age")
    public Response getFacilityAndAgeById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));

        convertions.facilityToXML(facilityXML, facility);
        convertions.ageToXML(agePopXML, facility.getAgepop());

        wholeList.addFacility(facilityXML);
        wholeList.addAge(agePopXML);

        return Response.status(200).entity(wholeList).build();
    }

    @POST
    @Path("/{pathParam}/age")
    public Response postFacilityAndAgeById(@PathParam("pathParam") String id){
        return this.getFacilityAndAgeById(id);
    }

    @GET
    @Path("/{pathParam}/ethnic")
    public Response getFacilityAndEthnicById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));

        convertions.facilityToXML(facilityXML, facility);
        convertions.ethnicToXML(ethnicPopXML, facility.getEthnicitypop());

        wholeList.addFacility(facilityXML);
        wholeList.addEthnic(ethnicPopXML);

        return Response.status(200).entity(wholeList).build();
    }

    @POST
    @Path("/{pathParam}/ethnic")
    public Response postFacilityAndEthnicById(@PathParam("pathParam") String id){

        return this.getFacilityAndEthnicById(id);
    }

    @GET
    @Path("/{pathParam}/age/ethnic")
    public Response getFacilityAgeAndEthnicById(@PathParam("pathParam") String id){

        facility = facilityDao.getFacility(Integer.parseInt(id));
        convertions.facilityToXML(facilityXML, facility);
        convertions.ageToXML(agePopXML, facility.getAgepop());
        convertions.ethnicToXML(ethnicPopXML, facility.getEthnicitypop());

        wholeList.addFacility(facilityXML);
        wholeList.addAge(agePopXML);
        wholeList.addEthnic(ethnicPopXML);

        return Response.status(200).entity(wholeList).build();
    }

    @POST
    @Path("/{pathParam}/age/ethnic")
    public Response postFacilityAgeAndEthnicById(@PathParam("pathParam") String id){
        return this.getFacilityAgeAndEthnicById(id);
    }
}
