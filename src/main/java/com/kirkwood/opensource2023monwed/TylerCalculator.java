package com.kirkwood.opensource2023monwed;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TylerServlet", value = "/tyler-calculator")
public class TylerCalculator extends HttpServlet {
    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/tyler-calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String fromType = req.getParameter("fromType");
        String toType = req.getParameter("toType");

        results.clear();
        if(num1.equals("") || fromType.equals("Select a time period") || toType.equals("Select a time period")){
            results.put("convertOutput", "Enter number, and time period");
        } else{
            String output = String.format("%s %s(s) equals %s %s(s)", num1, fromType, calcValues(num1, fromType, toType), toType);
            results.put("convertOutput", output);
        }

        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/tyler-calculator.jsp").forward(req, resp);
    }

    private String calcValues(String num1, String from, String to){
        float out = 0;
        Float numOne = Float.parseFloat(num1);

        float inInches = 0;
        switch (from) {
            case "inch":
                inInches = numOne;
                break;
            case "feet":
                inInches = numOne * 12;
                break;
            case "yard":
                inInches = numOne * 36;
                break;
        }

        switch (to) {
            case "inch":
                out = inInches;
                break;
            case "feet":
                out = inInches / 12;
                break;
            case "yard":
                out = inInches / 36;
                break;
        }

        return String.valueOf(out);
    }
}
