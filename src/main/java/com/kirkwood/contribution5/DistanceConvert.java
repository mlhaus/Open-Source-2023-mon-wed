package com.kirkwood.contribution5;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DistanceConvert", value = "/distance-convert")
public class DistanceConvert extends HttpServlet {
    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("WEB-INF/contribution5/distance-convert.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String conversion = request.getParameter("conversion");
        String  distance = request.getParameter("distance");
        results.clear();
        results.put("conversion", conversion);
        results.put("distance", distance);
        convertDistance(conversion, distance);
        request.setAttribute("results", results);
        request.getRequestDispatcher("WEB-INF/contribution5/distance-convert.jsp").forward(request,response);

    }
    private void convertDistance (String conversion, String distance){
        if(conversion == null || !conversion.equals("MeterstoMiles") && !conversion.equals("MilestoMeters") && !conversion.equals("MeterstoKilometers") && !conversion.equals("KilometerstoMeters") && !conversion.equals("MilestoKilometers") && !conversion.equals("KilometerstoMiles")){
            results.put("ConversionError", "Select a conversion types");
        }
        if(!Helpers.isANumber(distance)){
            results.put("DistanceError", "Enter a valid number");
        }
        if(!results.containsKey("ConversionError") && !results.containsKey("DistanceError")){
            double distDouble = Double.parseDouble(distance);
            if(conversion.equals("MeterstoMiles")){
                double distConvert = distDouble * 0.00062137;
                results.put("distConvert", String.format("%s Meters =%s Miles", distance,Helpers.round(distConvert)));
            }else if(conversion.equals("MilestoMeters")){
                double distConvert = distDouble * 1609.344;
                results.put("distConvert", String.format("%s Meters =%s Miles", distance,Helpers.round(distConvert)));
            }else if(conversion.equals("MeterstoKilometers")){
                double distConvert = distDouble / 1000.00;
                results.put("distConvert", String.format("%s Meters =%s Kilometers", distance,Helpers.round(distConvert)));
            }else if(conversion.equals("KilometerstoMeters")){
                double distConvert = distDouble * 1000.00;
                results.put("distConvert", String.format("%s Kilometers =%s Meters", distance,Helpers.round(distConvert)));
            }else if(conversion.equals("MilestoKilometers")){
                double distConvert = distDouble * 1.609344;
                results.put("distConvert", String.format("%s Miles =%s Kilometers", distance,Helpers.round(distConvert)));
            }else{
                double distConvert = distDouble / 1.609344;
                results.put("distConvert", String.format("%s Kilometers =%s Miles", distance,Helpers.round(distConvert)));
            }
        }
    }
}