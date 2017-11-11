package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.AgepopSQL;
import edu.matc.incarcerationanalyzer.entity.EthnicpopSQL;
import edu.matc.incarcerationanalyzer.entity.FacilitySQL;
import edu.matc.incarcerationanalyzer.entity.FacilityXML;
import edu.matc.incarcerationanalyzer.persistence.HibernateDaoAndSQL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("xml")
public class XMLOutput {
    List<FacilitySQL> facilitySQLS = new ArrayList<>();
    List<AgepopSQL> agepopSQLS = new ArrayList<>();
    List<EthnicpopSQL> ethnicpopSQLS = new ArrayList<>();
    List<Object> response = new ArrayList<>();
    HibernateDaoAndSQL hibernateDaoAndSQL = new HibernateDaoAndSQL();
    String sql = "";


    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/facility")
    public Response checkingThisOut(){

        hibernateDaoAndSQL.produceData(facilitySQLS, ethnicpopSQLS, agepopSQLS);
        response.addAll(facilitySQLS);

        return Response.status(200).entity(response).build();
    }
}
