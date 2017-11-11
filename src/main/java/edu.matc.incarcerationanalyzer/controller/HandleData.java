package edu.matc.incarcerationanalyzer.controller;

import javax.servlet.RequestDispatcher;
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

        response.sendRedirect("http://localhost:8080/teamproject/json/facility?id="+ facilityid);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*
        String url = null;
        String contextPath = req.getContextPath();
        if (req.getParameter("submit").equals("registered")) {
            url = "jsp/login.jsp";
        } else if (req.getParameter("submit").equals("guest")) {
            url ="jsp/constructionGuest.jsp";
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher(url);
        dispatcher.forward(req, resp);
*/
    }
}
