package edu.matc.incarcerationanalyzer.controller;




import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("/")
public class StartupServlet {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    @Path("")
    public Response welcomeMessage(){

        String output = "Welcome to Incarceration API, type \n" +
                "\n/xml                                   \tto output on XML" +
                "\n/json                                  \tto output on JSON \n" +
                "\n\t/facility/all                          to retrieve all the facilities" +
                "\n\t/facility/all?both=true                to retrieve all facilities including ages and ethnics" +
                "\n\t/facility/all/age                      to retrieve all facilities including the ages" +
                "\n\t/facility/all/ethnic                   to retrieve all facilities including the ethnics" +
                "\n\t/facility/id                           to retrieve a specific facility" +
                "\n\t/facility/id/age                       to retrieve a specific facility and the age" +
                "\n\t/facility/id/ethnic                    to retrieve a specific facility and the ethnic" +
                "\n\t/facility/id/age/ethnic                to retrieve a specific facility, the age and the ethnic";

        return Response.status(200).entity(output).build();
    }

}