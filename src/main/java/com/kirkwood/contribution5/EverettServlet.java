package com.kirkwood.contribution5;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="EverettServlet", urlPatterns = {"/everett-metric-calculator"})
public class EverettServlet extends HttpServlet {

    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/everett-metric-calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fromConversion = req.getParameter("fromConversion");
        String toConversion = req.getParameter("toConversion");
        String distance = req.getParameter("distance");
        results.clear();
        results.put("fromConversion", fromConversion);
        results.put("toConversion", toConversion);
        results.put("distance", distance);
        convertDistance(fromConversion, toConversion, distance);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/everett-metric-calculator.jsp").forward(req, resp);
    }

    private void convertDistance(String fromConversion, String toConversion, String distance) {
        if(fromConversion.equals("Select a unit of distance.")) {
            results.put("fromConversionError", "Select a conversion type");
        }
        if(toConversion.equals("Select unit of distance to covert to.")) {
            results.put("toConversionError", "Please select a conversion type");
        } else if(toConversion.equals(fromConversion)) {
            results.put("toConversionError", "Conversion type can not be the same.");
        }

        if(!Helpers.isANumber(distance)) {
            results.put("distanceError", "Please input a valid distance");
        }

        if(!results.containsKey("fromConversionError") && !results.containsKey("toConversionError") &&
            !results.containsKey("distanceError")) {
            double distanceDouble = Double.parseDouble(distance);
            if(fromConversion.equals("Miles")) {
                if(toConversion.equals("Meters")){
                    double alteredValue = distanceDouble * 1609.344;
                    results.put("alteredValue", String.format("%s meters", alteredValue));
                }
                if(toConversion.equals("Kilometers")){
                    double alteredValue = distanceDouble * 1.609344;
                    results.put("alteredValue", String.format("%s kilometers", alteredValue));
                }
            }

            if(fromConversion.equals("Meters")) {
                if(toConversion.equals("Miles")){
                    double alteredValue = distanceDouble / 1609.344;
                    results.put("alteredValue", String.format("%s miles", alteredValue));
                }
                if(toConversion.equals("Kilometers")){
                    double alteredValue = distanceDouble / 1000;
                    results.put("alteredValue", String.format("%s kilometers", alteredValue));
                }
            }

            if(fromConversion.equals("Kilometers")) {
                if(toConversion.equals("Miles")){
                    double alteredValue = distanceDouble * 0.621371;
                    results.put("alteredValue", String.format("%s miles", alteredValue));
                }
                if(toConversion.equals("Meters")){
                    double alteredValue = distanceDouble * 1000;
                    results.put("alteredValue", String.format("%s meters", alteredValue));
                }
            }
        }
    }
}
