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
        String facilityid = request.getParameter("facility");
        String type = request.getParameter("dataType");

        //building up the url
        String url = request.getRequestURL().toString();
        int urlLength = request.getRequestURL().length();

        url = request.getRequestURL().delete(22, urlLength).toString();
        url += "teamproject/" + type + "/facility/" + facilityid;

        response.sendRedirect(url);

    }
}
