package com.kirkwood.contribution4;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="distanceConverter", value = {"/convert-dis"})
public class DistanceConverter extends HttpServlet {

    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/ConversionHub/convert-dis.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("conversion");
        String distance = req.getParameter("distance");
        results.clear();
        results.put("conversion", conversion);
        results.put("distance", distance);
        convertDistance(conversion, distance);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/ConversionHub/convert-dis.jsp").forward(req, resp);
    }

    private void convertDistance(String conversion, String distance) {
        if (conversion == null || !conversion.equals("InchToFeet") && !conversion.equals("FeetToInch") && !conversion.equals("FeetToYards") && !conversion.equals("YardsToFeet") && !conversion.equals("InchToYards") && !conversion.equals("YardsToInch")) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!Helpers.isANumber(distance)) {
            results.put("distanceError", "Please input a valid distance");
        }
        if (!results.containsKey("conversionError") && !results.containsKey("distanceError")) {
            double distanceDouble = Double.parseDouble(distance);

            if (conversion.equals("InchToFeet")) {
                double distanceConverted = distanceDouble / 12.0;
                results.put("distanceConverted", String.format("%s inches = %s feet", distance, Helpers.round(distanceConverted)));
            }

            if (conversion.equals("FeetToInch")) {
                double distanceConverted = distanceDouble * 12.0;
                results.put("distanceConverted", String.format("%s feet = %s inches", distance, Helpers.round(distanceConverted)));
            }

            if (conversion.equals("FeetToYards")) {
                double distanceConverted = distanceDouble / 3.0;
                results.put("distanceConverted", String.format("%s feet = %s yards", distance, Helpers.round(distanceConverted)));
            }

            if (conversion.equals("YardsToFeet")) {
                double distanceConverted = distanceDouble * 3.0;
                results.put("distanceConverted", String.format("%s yards = %s feet", distance, Helpers.round(distanceConverted)));
            }

            if (conversion.equals("InchToYards")) {
                double distanceConverted = distanceDouble / 36.0;
                results.put("distanceConverted", String.format("%s inches = %s yards", distance, Helpers.round(distanceConverted)));
            }

            if (conversion.equals("YardsToInch")) {
                double distanceConverted = distanceDouble * 36.0;
                results.put("distanceConverted", String.format("%s yards = %s inches", distance, Helpers.round(distanceConverted)));
            }
        }
    }
}
