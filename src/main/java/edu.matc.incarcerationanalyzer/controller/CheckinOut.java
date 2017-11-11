package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.FacilityXML;
import edu.matc.incarcerationanalyzer.entity.XMLList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Path("xml/ivan")
public class CheckinOut {

    ArrayList<Object> list = new ArrayList<>();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("")
    public XMLList checkingThisOut(){
        FacilityXML facilityXML = new FacilityXML();
        facilityXML.setId(1);
        facilityXML.setName("Federal");
        facilityXML.setPopulation(5000);

        FacilityXML facilityXML2 = new FacilityXML();
        facilityXML2.setId(2);
        facilityXML2.setName("Madison");
        facilityXML2.setPopulation(5000);

        //list.add(facilityXML);
        //list.add(facilityXML2);

        XMLList wholeList = new XMLList();
        wholeList.addFacility(facilityXML);
        wholeList.addFacility(facilityXML2);

        //Response.accepted(facilityXML2);
        return wholeList;
    }
}
