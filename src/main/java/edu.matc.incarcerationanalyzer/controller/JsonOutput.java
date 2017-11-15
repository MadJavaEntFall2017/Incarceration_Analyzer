package edu.matc.incarcerationanalyzer.controller;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("json/facility")
public class JsonOutput extends XMLOutput {
}
