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

@WebServlet(name="AndrewServlet", value="/andrew_inches_feet_yards")
public class AndrewServlet extends HttpServlet {
    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/andrew_inches_feet_yards.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String unitOfMeasure = req.getParameter("unitOfMeasure");
        String convertUnitOfMeasure = req.getParameter("convertUnitOfMeasure");
        results.clear();
        results.put("unitOfMeasure", unitOfMeasure);
        results.put("convertUnitOfMeasure", convertUnitOfMeasure);
        convertUnitOfMeasure(unitOfMeasure, convertUnitOfMeasure);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/andrew_inches_feet_yards.jsp").forward(req,resp);
    }

    public void convertUnitOfMeasure(String unitOfMeasure, String convertUnitOfMeasure){
        if(!unitOfMeasure.equals("in") && !unitOfMeasure.equals("ft") && !unitOfMeasure.equals("yd")
                || unitOfMeasure == null) {
            results.put("unitOfMeasureError", "Please select a unit of measure");
        }
        if(!Helpers.isANumber(convertUnitOfMeasure)){
            results.put("invalidNumberError", "Please enter a valid number to convert");
        }
        if(!results.containsKey("unitOfMeasureError") && !results.containsKey("invalidNumberError")){
            double unitToConvertDouble = Double.parseDouble(convertUnitOfMeasure);
            if(unitOfMeasure.equals("in")){
                double feet = unitToConvertDouble/12;
                double yards = unitToConvertDouble/36;
                results.put("feetValue", String.format("%.2f ft", feet));
                results.put("yardsValue", String.format("%.2f yd", yards));
            } else if (unitOfMeasure.equals("ft")) {
                double inches = unitToConvertDouble * 12;
                double yards = unitToConvertDouble / 3;
                results.put("inchesValue", String.format("%.2f in", inches));
                results.put("yardsValue", String.format("%.2f yd", yards));
            } else if (unitOfMeasure.equals("yd")) {
                double inches = unitToConvertDouble * 36;
                double feet = unitToConvertDouble * 3;
                results.put("inchesValue", String.format("%.2f in", inches));
                results.put("feetValue", String.format("%.2f ft", feet));
            }
        }
    }
}
