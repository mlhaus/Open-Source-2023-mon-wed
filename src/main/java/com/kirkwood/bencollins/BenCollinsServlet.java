package com.kirkwood.bencollins;

import com.kirkwood.utilities.Helpers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "BenCollinsServlet", urlPatterns = {"/uscs-calculator"})
public class BenCollinsServlet extends HttpServlet {
    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // System.out.println("You made a GET request!!!"); // Made by typing a specific address into the browser
        req.getRequestDispatcher("WEB-INF/bencollins-USCScalculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversionFrom = req.getParameter("conversionFrom");
        String conversionTo = req.getParameter("conversionTo");
        String valueInput = req.getParameter("valueInput");
        results.clear();
        results.put("conversionFrom", conversionFrom);
        results.put("conversionTo", conversionTo);
        results.put("valueInput", valueInput);
        conversionCalc(conversionFrom, conversionTo, valueInput);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/bencollins-USCScalculator.jsp").forward(req, resp);

    }

    public void conversionCalc(String conversionFrom, String conversionTo, String valueInput) {
        if(conversionFrom.equals("Select a measurement unit") || !conversionFrom.equals("fromYards") && !conversionFrom.equals("fromFeet") &&
                !conversionFrom.equals("fromInches")) {
            results.put("conversionFromNotSelectedError", "Please select a unit to convert from.");
        }
        if(conversionTo.equals("Select a measurement unit") || !conversionTo.equals("toYards") && !conversionTo.equals("toFeet") &&
                !conversionTo.equals("toInches")) {
            results.put("conversionToNotSelectedError", "Please select a unit to convert to.");
        }
        if(valueInput.equals("")) {
            results.put("valueInputNotANumberError", "Please type a number to convert.");
        }
        else if(!Helpers.isANumber(valueInput)) {
            results.put("valueInputNotANumberError", "Not a number. Enter a number to convert.  (ex: 1, 5, 6)");
        }
        if(!results.containsKey("conversionFromNotSelectedError") && !results.containsKey("conversionToNotSelectedError")
                && !results.containsKey("valueInputNotANumberError")) {
            double number = Double.parseDouble(valueInput);
            if(conversionFrom.equals("fromYards")) {
                if(conversionTo.equals("toFeet")) {
                    double convertedValue = number * 3;
                    results.put("convertedValue", String.format("%s feet", convertedValue));
                } else if(conversionTo.equals("toInches")) {
                    double convertedValue = number * 36;
                    results.put("convertedValue", String.format("%s inches", convertedValue));
                } else {
                    results.put("convertedValue", "Cannot convert yards to yards");
                }
            } // end of convert from yards
            if(conversionFrom.equals("fromFeet")) {
                if(conversionTo.equals("toYards")) {
                    double convertedValue = number / 3;
                    results.put("convertedValue", String.format("%s yards", convertedValue));
                } else if(conversionTo.equals("toInches")) {
                    double convertedValue = number * 12;
                    results.put("convertedValue", String.format("%s inches", convertedValue));
                } else {
                    results.put("convertedValue", "Cannot convert feet to feet");
                }
            } // end of convert from feet
            if(conversionFrom.equals("fromInches")) {
                if(conversionTo.equals("toFeet")) {
                    double convertedValue = number / 12;
                    results.put("convertedValue", String.format("%s feet", convertedValue));
                } else if(conversionTo.equals("toYards")) {
                    double convertedValue = number / 36;
                    results.put("convertedValue", String.format("%s yards", convertedValue));
                } else {
                    results.put("convertedValue", "Cannot convert inches to inches");
                }
            } // end of convert from inches
        }
    }
}
