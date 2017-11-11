package edu.matc.incarcerationanalyzer.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class AgepopResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("")
    public String getFacility(@Context UriInfo info){
        //String idParameter = info.getQueryParameters().getFirst("id");


        return "from ages";
    }
}
