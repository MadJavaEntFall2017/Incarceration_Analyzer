package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.AgepopSQL;
import edu.matc.incarcerationanalyzer.entity.EthnicpopSQL;
import edu.matc.incarcerationanalyzer.entity.FacilitySQL;
import edu.matc.incarcerationanalyzer.persistence.HibernateDaoAndSQL;
import org.apache.log4j.Logger;

//import javax.websocket.server.PathParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Path("json")
public class FacilityById {


    List<FacilitySQL> facilitySQLS = new ArrayList<>();
    List<AgepopSQL> agepopSQLS = new ArrayList<>();
    List<EthnicpopSQL> ethnicpopSQLS = new ArrayList<>();
    List<Object> response = new ArrayList<>();
    HibernateDaoAndSQL hibernateDaoAndSQL = new HibernateDaoAndSQL();
    String sql = "";


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/facility")
    public Response getFacility(@Context UriInfo info){
        String idParameter = info.getQueryParameters().getFirst("id");
        if (idParameter == null || idParameter.equals("")) {

            produceData();
        } else if (idParameter.equalsIgnoreCase("all")){
            produceData();

        } else {
            produceDataById(idParameter);
        }
        //produceData();
        response.addAll(facilitySQLS);

        return Response.status(200).entity(response.toString()).build();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/facility")
    public Response postFacility(@Context UriInfo info){
        String idParameter = info.getQueryParameters().getFirst("id");
        if (idParameter == null || idParameter.equals("")) {

            produceData();
        } else if (idParameter.equalsIgnoreCase("all")){
            produceData();

        } else {
            produceDataById(idParameter);
        }
        //produceData();
        response.addAll(facilitySQLS);

        return Response.status(200).entity(response.toString()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/facility/{idParameter}/age")
    public Response getAge(@PathParam("idParameter") String idParameter){
        produceDataById(idParameter);
        String output = facilitySQLS.toString();
        output += agepopSQLS.toString();
        //response1.add(facilitySQLS.toString());
        //response1.add(agepopSQLS.toString());

        return Response.status(200).entity(output).build();

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/facility/{idParameter}/age")
    public Response postAge(@PathParam("idParameter") String idParameter){
        produceDataById(idParameter);
        String output = facilitySQLS.toString();
        output += agepopSQLS.toString();
        //response1.add(facilitySQLS.toString());
        //response1.add(agepopSQLS.toString());

        return Response.status(200).entity(output).build();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/facility/{idParameter}/age/ethnic")
    public Response getAgeAndEthnic(@PathParam("idParameter") String idParameter){
        produceDataById(idParameter);
        String output = facilitySQLS.toString();
        output += agepopSQLS.toString();
        output += ethnicpopSQLS.toString();

        //response1.add(facilitySQLS.toString());
        //response1.add(agepopSQLS.toString());

        return Response.status(200).entity(output).build();


    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/facility/{idParameter}/age/ethnic")
    public Response postAgeAndEthnic(@PathParam("idParameter") String idParameter){
        produceDataById(idParameter);
        String output = facilitySQLS.toString();
        output += agepopSQLS.toString();
        output += ethnicpopSQLS.toString();

        //response1.add(facilitySQLS.toString());
        //response1.add(agepopSQLS.toString());

        return Response.status(200).entity(output).build();


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

    private void produceDataById(String id){
        final Logger logger = Logger.getLogger(this.getClass());
        try {
            sql = "SELECT * FROM facility where facilityid = '" + id + "'";
            facilitySQLS = hibernateDaoAndSQL.getQueryFromFacilitySQL(sql);

            sql="SELECT * FROM ethnicitypop where ethnicityid = '" + id + "'";
            ethnicpopSQLS = hibernateDaoAndSQL.getQueryFromEthnicSQL(sql);

            sql="SELECT * FROM agepop where ageid = '" + id + "'";
            agepopSQLS = hibernateDaoAndSQL.getQueryFromAgeSQL(sql);
        } catch (SQLException e) {
            logger.info("StarupServlet.produceData().. Exception: " + e);
            e.printStackTrace();
        }
    }


}
