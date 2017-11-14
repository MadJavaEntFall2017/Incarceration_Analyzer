package edu.matc.incarcerationanalyzer.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        urlPatterns = {"/HandleData"}
        )
public class HandleData extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String facilityid   = request.getParameter("facility");
        String type         = request.getParameter("dataType");
        String age          = request.getParameter("age");
        String ethnic       = request.getParameter("ethnic");

        //building up the url
        String applicationPath  = "incarceration/";
        String defaultResource  = "/facility/";
        String url;

        int urlLength = request.getRequestURL().length();
        url = request.getRequestURL().delete(urlLength - 10, urlLength).toString();
        url += applicationPath + type + defaultResource;

        if (facilityid.equals("all")){

            if (age != null && ethnic != null) {
                url += "all?both=true";

            }else if (age != null && ethnic == null){

                url += "all/age";

            }else if (age == null && ethnic != null){

                url += "all/ethnic";

            }else {
                url += "all";
            }
        } else {

            if (age != null && ethnic != null) {

                url += facilityid + "/age/ethnic";

            }else if (age != null && ethnic == null){

                url += facilityid + "/age";

            }else if (age == null && ethnic != null){

                url += facilityid + "/ethnic";

            }else {
                url += facilityid;
            }

        }

        response.sendRedirect(url);
    }
}
