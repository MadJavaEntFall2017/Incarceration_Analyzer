package edu.matc.incarcerationanalyzer.controller;

import edu.matc.incarcerationanalyzer.entity.Facility;
import edu.matc.incarcerationanalyzer.persistence.FacilityDao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        name = "PreloadDataStartup",
        urlPatterns = {"/incarcaerationStartup"},
        loadOnStartup = 1
)
public class PreloadDataStartup extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ServletContext servletContext = getServletContext();
        FacilityDao facilityDao = new FacilityDao();
        List<Facility> facility = new ArrayList<>();

        facility = facilityDao.getAllFacilities();
        servletContext.setAttribute("facilities", facility);
    }
}
