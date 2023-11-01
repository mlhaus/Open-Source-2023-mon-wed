package com.kirkwood;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="DarrylServlet", value="/Darryl_miles_meters")
public class DarrylServlet extends HttpServlet {

    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/Darryl_miles_meters.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String DistanceType = req.getParameter("DistanceType");
        String Distance = req.getParameter("Distance");
        String DistanceType2 = req.getParameter("DistanceType2");

        results.clear();
        results.put("DistanceType", DistanceType);
        results.put("Distance", Distance);
        results.put("DistanceType2", DistanceType2);
        convertDistance(DistanceType, Distance, DistanceType2);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/Darryl_miles_meters.jsp").forward(req, resp);
    }

    public void convertDistance(String DistanceType, String Distance, String DistanceType2){
        if(!Helpers.isANumber(Distance)){
            results.put("IncorrectInput", "please put in a number");
        }
        else if(Double.parseDouble(Distance) >= 0) {
            if (DistanceType.contains(DistanceType2)) {
                double distanceConverted = Double.parseDouble(Distance);
                results.put("NewDistance", "Distance Type not converted so distance is: " + distanceConverted + ".");
            } else if (DistanceType.contains("Kilometers") && DistanceType2.contains("Meters")) {
                double distanceConverted = Double.parseDouble(Distance) * 1000;
                results.put("NewDistance", "Distance in meters is: " + distanceConverted + ".");
            } else if (DistanceType.contains("Kilometers") && DistanceType2.contains("Miles")) {
                double distanceConverted = Double.parseDouble(Distance) * 0.621371;
                results.put("NewDistance", "Distance in miles is: " + distanceConverted + ".");
            } else if (DistanceType.contains("Meters") && DistanceType2.contains("Miles")) {
                double distanceConverted = Double.parseDouble(Distance) * 0.000621371;
                results.put("NewDistance", "Distance in miles is: " + distanceConverted + ".");
            } else if (DistanceType.contains("Meters") && DistanceType2.contains("Kilometers")) {
                double distanceConverted = Double.parseDouble(Distance) * 0.001;
                results.put("NewDistance", "Distance in kilometers is: " + distanceConverted + ".");
            } else if (DistanceType.contains("Miles") && DistanceType2.contains("Kilometers")) {
                double distanceConverted = Double.parseDouble(Distance) * 1.60934;
                results.put("NewDistance", "Distance in kilometers is: " + distanceConverted + ".");
            } else if (DistanceType.contains("Miles") && DistanceType2.contains("Meters")) {
                double distanceConverted = Double.parseDouble(Distance) * 1609.34;
                results.put("NewDistance", "Distance in meters is: " + distanceConverted + ".");
            } else {
                results.put("DistanceError1", "you forgot to select a distance type");
            }
        }
        else{
            results.put("DistanceError2", "Please pick a non-negative number");
        }

    }

}
