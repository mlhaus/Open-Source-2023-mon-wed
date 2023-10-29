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

@WebServlet(name="KateServlet", value="/kate_compound_interest")
public class KateServlet extends HttpServlet {
    Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/kate_compound_interest.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String timePeriod = req.getParameter("timePeriod");
        String presentValue = req.getParameter("presentValue");
        String annualInterestRate = req.getParameter("annualInterestRate");
        String numberOfTimePeriods = req.getParameter("numberOfTimePeriods");
        results.clear();
        results.put("timePeriod", timePeriod);
        results.put("presentValue", presentValue);
        results.put("annualInterestRate", annualInterestRate);
        results.put("numberOfTimePeriods", numberOfTimePeriods);
        calculateFutureValue(timePeriod, presentValue, annualInterestRate, numberOfTimePeriods);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/kate_compound_interest.jsp").forward(req, resp);
    }
    public void calculateFutureValue(String timePeriod, String presentValue, String annualInterestRate, String numberOfTimePeriods) {
        if(timePeriod == null || !timePeriod.equals("mo") && !timePeriod.equals("yr")) {
            results.put("timePeriodError", "Select a time period.");
        }
        if(!Helpers.isANumber(presentValue)) {
            results.put("presentValueError", "Please enter a valid present value.");
        }
        if(!Helpers.isANumber(annualInterestRate)) {
            results.put("interestRateError", "Please enter a valid interest rate percentage.");
        }
        if(!Helpers.isANumber(numberOfTimePeriods)) {
            results.put("numberOfTimePeriodsError", "Please enter a valid number of time periods.");
        }
        if(!results.containsKey("timePeriodError") && !results.containsKey("presentValueError") &&
                !results.containsKey("interestRateError") && !results.containsKey("numberOfTimePeriodsError")) {
            double presentDouble = Double.parseDouble(presentValue);
            double interestDouble = Double.parseDouble(annualInterestRate);
            double timePeriodDouble = Double.parseDouble(numberOfTimePeriods);
            if(timePeriod.equals("mo")) {
                double interestRate = interestDouble / 100 / 12;
                double futureValue = presentDouble * Math.pow((1 + interestRate), timePeriodDouble);
                results.put("futureValue", String.format("$%s in %s months = $%s", presentValue, numberOfTimePeriods,
                        Helpers.round(futureValue)));
            }
            if(timePeriod.equals("yr")) {
                double interestRate = interestDouble / 100;
                double futureValue = presentDouble * Math.pow((1 + interestRate), timePeriodDouble);
                results.put("futureValue", String.format("$%s in %s years = $%s", presentValue, numberOfTimePeriods,
                        Helpers.round(futureValue)));
            }
        }
    }
}