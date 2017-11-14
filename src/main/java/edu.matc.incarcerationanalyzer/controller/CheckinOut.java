package edu.matc.incarcerationanalyzer.controller;


import edu.matc.incarcerationanalyzer.entity.*;
import edu.matc.incarcerationanalyzer.persistence.FacilityDao;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



@Path("testing")
public class CheckinOut {

    List<FacilityXML> responseList = new ArrayList<>();
    FacilityDao facilityDao = new FacilityDao();
    String sql = "";

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sql")
    public String checkingThisOut() throws SQLException {

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
