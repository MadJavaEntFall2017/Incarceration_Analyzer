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

        String output = "Welcome to Incarceration API, type " +
                "\n/facility/all        to retrieve all facilities" +
                "\n/facility/id         to retrieve a specific facility";

        return Response.status(200).entity(output).build();
    }

}