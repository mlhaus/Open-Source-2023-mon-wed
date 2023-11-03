package com.kirkwood.contribution5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="TimeConverter", value="time")
public class TimeConverter extends HttpServlet {

    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("conversion");
        String num = req.getParameter("num");
        results.clear();
        results.put("conversion", conversion);
        results.put("num", num);
        convertTime(conversion, num);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/convert-time.jsp").forward(req, resp);

    }

    public void convertTime(String conversion, String num) {
        if(conversion == null) {
            results.put("conversionError", "Please choose a conversion type.");
        }
        if(!Helpers.isANumber(num)) {
            results.put("numError", "Please enter a valid number");
        }

        if(!results.containsKey("conversionError") && !results.containsKey("numError")) {
            int numInt = Integer.parseInt(num);
            if(conversion.equals("SectoMin")) {
                int numConverted = numInt / 60;
                results.put("numConverted", num);
            } else if (conversion.equals("SectoHr")) {
                int numConverted = numInt / 3600;
                results.put("numConverted", num);
            } else if (conversion.equals("MintoSec")) {
                int numConverted = numInt * 60;
                results.put("numConverted", num);
            } else if (conversion.equals("MintoHr")) {
                int numConverted = (int) (numInt / 60.0);
                results.put("numConverted", num);
            } else if (conversion.equals("HrtoSec")) {
                int numConverted = (int)(numInt * 3600.0);
                results.put("numConverted", num);
            } else if (conversion.equals("HrtoMin")) {
                int numConverted = (int)(numInt * 3600.0);
                results.put("numConverted", num);
            }
        }
    }
}
