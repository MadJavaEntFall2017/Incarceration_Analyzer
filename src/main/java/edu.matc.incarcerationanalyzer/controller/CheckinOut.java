package edu.matc.incarcerationanalyzer.controller;


import edu.matc.incarcerationanalyzer.entity.*;
import edu.matc.incarcerationanalyzer.persistence.FacilityDao;
import edu.matc.incarcerationanalyzer.persistence.HibernateDaoAndSQL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("testing")
public class CheckinOut {
    List<FacilitySQL> facilitySQLS = new ArrayList<>();
    List<AgepopSQL> agepopSQLS = new ArrayList<>();
    List<EthnicpopSQL> ethnicpopSQLS = new ArrayList<>();
    List<FacilityXML> responseList = new ArrayList<>();
    HibernateDaoAndSQL hibernateDaoAndSQL = new HibernateDaoAndSQL();
    FacilityDao facilityDao = new FacilityDao();
    String sql = "";

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sql")
    public String checkingThisOut() throws SQLException {
        /*Gson gson = new Gson();
        List<String> lista = new ArrayList<>();


        FacilitySQL facilitySQL = new FacilitySQL();
        facilitySQL.setName("ivan");
        facilitySQL.setId(2);
        facilitySQL.setPopulation(5000);

        FacilitySQL facilitySQL2 = new FacilitySQL();
        facilitySQL2.setName("Evan");
        facilitySQL2.setId(2);
        facilitySQL2.setPopulation(5000);

        String item = gson.toJson(facilitySQL);
        String item2 = gson.toJson(facilitySQL2);
        lista.add(item);
        lista.add(item2);

        //facilitySQLS.add(facilitySQL);*/
        //return lista.toString();
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hibernate")
    public String checkingThisOutHibernate() throws SQLException {
        /*Gson gson = new Gson();
        List<String> lista = new ArrayList<>();*/




        //String item = gson.toJson(facilitySQL);
        //String item2 = gson.toJson(facilitySQL2);
        //lista.add(item);
        //ista.add(item2);

        //facilitySQLS.add(facilitySQL);
        //return lista.toString();
        return null;
    }
}
