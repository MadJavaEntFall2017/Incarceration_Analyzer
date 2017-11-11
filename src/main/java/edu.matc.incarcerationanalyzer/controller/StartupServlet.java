package edu.matc.incarcerationanalyzer.controller;


import edu.matc.incarcerationanalyzer.entity.AgepopSQL;
import edu.matc.incarcerationanalyzer.entity.EthnicpopSQL;
import edu.matc.incarcerationanalyzer.entity.FacilitySQL;
import edu.matc.incarcerationanalyzer.persistence.HibernateDaoAndSQL;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Path("/")
public class StartupServlet {
    List<FacilitySQL> facilitySQLS = new ArrayList<>();
    List<AgepopSQL> agepopSQLS = new ArrayList<>();
    List<EthnicpopSQL> ethnicpopSQLS = new ArrayList<>();
    List<Object> response = new ArrayList<>();
    HibernateDaoAndSQL hibernateDaoAndSQL = new HibernateDaoAndSQL();
    String sql = "";

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    @Path("")
    public Response welcomeMessage(){

        String output = "Welcome to Incarceration API, type /facility or /alldata " +
                "to retrieve data";

        return Response.status(200).entity(output).build();
    }


/*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("json/facility")
    public Response getFacility(){
        produceData();

        response.addAll(facilitySQLS);

        return Response.status(200).entity(response.toString()).build();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("json/facility")
    public Response postFacility(){
        produceData();

        response.addAll(facilitySQLS);

        return Response.status(200).entity(response.toString()).build();
    }
*/


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("alldata")
    public Response getWholeData(){
        produceData();

        for (int i=0; i < facilitySQLS.size(); i++){
            response.add(facilitySQLS.get(i));
            response.add(agepopSQLS.get(i));
            response.add(ethnicpopSQLS.get(i));
        }

        return Response.status(200).entity(response.toString()).build();
    }

    private void produceData(){
        final Logger logger = Logger.getLogger(this.getClass());
        try {
            sql = "SELECT * FROM facility";
            facilitySQLS = hibernateDaoAndSQL.getQueryFromFacilitySQL(sql);

            sql="SELECT * FROM ethnicitypop";
            ethnicpopSQLS = hibernateDaoAndSQL.getQueryFromEthnicSQL(sql);

            sql="SELECT * FROM agepop";
            agepopSQLS = hibernateDaoAndSQL.getQueryFromAgeSQL(sql);
        } catch (SQLException e) {
            logger.info("StarupServlet.produceData().. Exception: " + e);
            e.printStackTrace();
        }
    }

}