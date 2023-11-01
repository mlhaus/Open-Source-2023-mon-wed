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
        String timePeriod = req.getParameter("timePeriod");
        results.clear();
        results.put("num1", num1);
        results.put("timePeriod", timePeriod);
        results.put("convertOutput", calcValues(num1, timePeriod));
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/tyler-calculator.jsp").forward(req, resp);
    }

    private String calcValues(String num1, String option){
        float out = 0;
        Float numOne = Float.parseFloat(num1);

        switch(option){
            case "inch":
                out = numOne;
                break;

            case "feet":
                out = (numOne)/12;
                break;

            case "yard":
                out = (numOne)/36;
                break;
        }

        return String.valueOf(out);
    }
}
