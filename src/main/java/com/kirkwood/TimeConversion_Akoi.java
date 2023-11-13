package com.kirkwood;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;

@WebServlet(name="TimeConversion", urlPatterns = {"/time-convert-akoi"})

public class TimeConversion_Akoi extends HttpServlet {
    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/day20/Time-Convert-Akoi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String timeconvert = req.getParameter("timeconvert");
        String timevalue = req.getParameter("timevalue");
        results.clear();
        results.put("timeconvert", timeconvert);
        results.put("timevalue", timevalue);
        convert(timevalue, timeconvert);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/day20/Time-Convert-Akoi.jsp").forward(req,resp);
    }
    private void convert(String timevalue, String timeconvert){
        if (timeconvert == null || !timeconvert.equals("sec") && !timeconvert.equals("min") && !timeconvert.equals("hr")){
            results.put("timeconverterror", "Select a time type");
        }
        if (!Helpers.isANumber(timevalue)){
            results.put("timevalueerror", "Please put a valid time");
        }
        if (!results.containsKey("timeconverterror") && !results.containsKey("timevalueerror")){
            double sec = Double.parseDouble(timevalue);
            if (timeconvert.equals("min")){
                int min = (int) (sec / 60);
                sec = sec % 60;
                results.put("converted", String.format("%s min = %s sec", min, sec, timevalue,Helpers.round(sec)));
            }
            if (timeconvert.equals("hr")){
                int hr = (int) (sec / 3600);
                sec = sec % 3600;
                results.put("converted", String.format("%s hr = %s sec", hr, sec, timeconvert, Helpers.round(sec)));
            }

        }

    }

}
