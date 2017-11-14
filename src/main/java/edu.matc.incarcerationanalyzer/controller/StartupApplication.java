package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.HandlerGeneralException;
import edu.matc.incarcerationanalyzer.entity.HandlerNullPointerException;
import edu.matc.incarcerationanalyzer.entity.HandlerNumberFormatException;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("teamproject")

//The java class declares root resource and provider classes
public class StartupApplication extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(StartupServlet.class );
        h.add(JsonOutput.class);
        h.add(CheckinOut.class);
        h.add(XMLOutput.class);
        h.add(HandlerNullPointerException.class);
        h.add(HandlerNumberFormatException.class);
        h.add(HandlerGeneralException.class);
        return h;
    }
}